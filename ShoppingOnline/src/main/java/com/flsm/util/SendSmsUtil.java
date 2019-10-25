package com.flsm.util;
import java.util.Random;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

public class SendSmsUtil {


	  /***
	       *  【项目未上线，不可用短信通知】
	       *  阿里云短信平台发送下单短信通知
	   * @param phone：接收验证码短信的手机号码
	   * @param username：下单用户名
	   * @return:返回验证码
	   */

	  
	  /***
	       *  【项目未上线，不可用短信通知】
	       *  阿里云短信平台发送收货短信通知
	   * @param phone：接收验证码短信的手机号码
	   * @param username：收货用户名
	   * @return:返回验证码
	   */
	  public static String sendReceiveMSM(String phone) {
		  String code="";
		  Random rand=new Random();
		  	for(int i=0;i<6;i++) {
		  		code+=rand.nextInt(9);
		  		
		  	}
		  
		  	DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIjVWFStKNEUqD", "hdzFMe3yxMAcfl45Q40TAgf4c1KKGP");
	        IAcsClient client = new DefaultAcsClient(profile);
	        CommonRequest request = new CommonRequest();
	        request.setMethod(MethodType.POST);
	        request.setDomain("dysmsapi.aliyuncs.com");
	        request.setVersion("2017-05-25");
	        request.setAction("SendSms");
	        request.putQueryParameter("RegionId", "cn-hangzhou");
	        request.putQueryParameter("PhoneNumbers", phone);// 手机号码
	        request.putQueryParameter("SignName", "世纪巅峰");// 签名名称
	        request.putQueryParameter("TemplateCode", "SMS_171858668");//模板CODE
	        request.putQueryParameter("TemplateParam", "{'code':'"+code+"'}");// 验证码内容,以json格式传递,键为模板中的名字
	        try {
	            CommonResponse response = client.getCommonResponse(request);
	            System.out.println(response.getData());
	        } catch (ServerException e) {
	            e.printStackTrace();
	        } catch (ClientException e) {
	            e.printStackTrace();
	        }
	        return code;
	    }
}
