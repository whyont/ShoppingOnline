package com.flsm.service.imp;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.flsm.mapper.IUsersMapper;
import com.flsm.pojo.Users;
import com.flsm.service.IUserService;
import com.flsm.util.EamlUtil;

import tk.mybatis.mapper.entity.Example;

@Service
public class UserServiceImp implements IUserService{
	
	@Autowired
	IUsersMapper usermapper;

	@Override
	public Users login(String zhanghao,String pwd) {
		
		Example example=new Example(Users.class);
		example.createCriteria().orEqualTo("uemail", zhanghao).orEqualTo("uphone", zhanghao).orEqualTo("uname",zhanghao).andEqualTo("upwd",pwd);
		List<Users> list = usermapper.selectByExample(example);
		
		return list.size()>0?list.get(0):null;
	}
	@Override
	public String PhoneVerificationCode(String phone, HttpServletRequest re) {
		if(phone==null) return null;
		String data="";
		if(phone!=null) {
			String code="";
			for(int i=0;i<4;i++) {
				Random r=new Random();
				code+=r.nextInt(10);
				
			}
			
			
			HttpSession session = re.getSession();
			DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4FcuU7GWeLtSgCQbpTo7", "Jb3As2FqKAa2VV4DqxW8wUTfi1h4Yb");
	        IAcsClient client = new DefaultAcsClient(profile);
	        CommonRequest request = new CommonRequest();
	        request.setMethod(MethodType.POST);
	        request.setDomain("dysmsapi.aliyuncs.com");
	        request.setVersion("2017-05-25");
	        request.setAction("SendSms");
	        request.putQueryParameter("RegionId", "cn-hangzhou");
	        request.putQueryParameter("PhoneNumbers", "13627391776");
	        request.putQueryParameter("SignName", "石头少年");
	        request.putQueryParameter("TemplateCode", "SMS_171858677");
	        request.putQueryParameter("TemplateParam", "{\"code\":"+code+"}");
	        try {
	            CommonResponse response = client.getCommonResponse(request);
	            data = response.getData();
	        } catch (ServerException e) {
	            e.printStackTrace();
	        } catch (ClientException e) {
	            e.printStackTrace();
	        }
	        session.setAttribute(phone, code);
		}
	        return data;
	}

	@Override
	public String EmailVerificationCode(String email, HttpServletRequest re) {
		if(email==null) return null;
		String code = "";
		Random ran = new Random();
		for (int i = 1; i <= 6; i++) {
			int num = ran.nextInt(10);
			code+=num;
		}
		EamlUtil e=new EamlUtil(email, "验证码", "你好! 你的验证码为："+code);
		re.getSession().setAttribute(email, code);
		e.sendOut();
		return code;
	}

	@Override
	public List<Users> FidUserTelOrEmail(String emailorPhone) {
		Example e=new Example(Users.class);
		e.createCriteria().orEqualTo("uemail", emailorPhone).orEqualTo("uphone", emailorPhone);
		List<Users> list = usermapper.selectByExample(e);
		return list;
	}

	@Override
	public boolean ForgetPasswordVerification(String phoneOrEmail, String code, HttpServletRequest request) {
		// TODO Auto-generated method stub
		Object attribute = request.getSession().getAttribute(phoneOrEmail);
		if(attribute!=null&&attribute.equals(code)) {
			request.getSession().setAttribute("resetusername", phoneOrEmail);
			return true;
		}
		return false;
	}

	@Override
	public boolean ResetPageValidation(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Object attribute = request.getSession().getAttribute("resetusername");
		return attribute!=null;
	}

	@Override
	@Transactional
	public boolean ForgetPasswordReset(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String password = (String) request.getParameter("password");
		String attribute = (String) request.getSession().getAttribute("resetusername");
		Users users = FidUserTelOrEmail(attribute).get(0);
		System.out.println(users);
		if(password==null||attribute==null||users==null) {
			return false;
		}
		System.out.println(users);
		users.setUpwd(password);
		usermapper.updateByPrimaryKeySelective(users);
		return true;
	}

}
