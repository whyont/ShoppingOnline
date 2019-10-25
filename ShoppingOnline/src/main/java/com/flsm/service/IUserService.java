package com.flsm.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.flsm.pojo.Users;

public interface IUserService {
	/**
	 * 用户登录方法
	 * @param zhanghao
	 * @param pwd
	 * @return
	 */
	Users login(String zhanghao,String pwd);
	/**
	 * 忘记手机号方法
	 * @param phone
	 * @param re
	 * @return
	 */
	String PhoneVerificationCode (String phone,HttpServletRequest re);
	/**
	 * 忘记邮箱号方法
	 * @param email
	 * @param re
	 * @return
	 */
	String EmailVerificationCode (String email,HttpServletRequest re);
	/**
	 * 查找用户是否存在
	 * @param emailorPhone
	 * @return
	 */
	 List<Users> FidUserTelOrEmail(String emailorPhone);
	 /**
	  * 手机或邮箱验证码是否正确
	  * @param phoneOrEmail
	  * @param code
	  * @param request
	  * @return
	  */
	 boolean ForgetPasswordVerification (String phoneOrEmail,String code,HttpServletRequest request);
	 /**
	  * 重置页面
	  * @param request
	  * @return
	  */
	 boolean ResetPageValidation(HttpServletRequest request);
	 /**
	  * 重置密码
	  * @param request
	  * @return
	  */
	 boolean ForgetPasswordReset(HttpServletRequest request);

	 /**
	  * 验证该注册邮箱是否已被使用
	  * @param Email
	  * @return
	  */
	 boolean CheckEmail(String email);
	 
	 /**
	  * 用户邮箱注册
	  * @param email
	  * @param pwd
	  * @return
	  */
	 boolean UserRigeister(String emailString, String pwd);
	 /**
	  * 拿到手机验证码
	  * @param phone
	  * @param session
	  * @return
	  */
	 String SendPhoneCode(String phone,HttpSession session);
	 /**
	  * 用户手机注册
	  * @param tellphone
	  * @param pwd
	  * @return
	  */
	 boolean pregister(String tellphone,String pwd);
	 /**
	  * 验证手机号是否存在
	  * @param tellphone
	  * @return
	  */
	 Users chauser(String tellphone);
}
