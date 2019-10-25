package com.flsm.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.flsm.pojo.users;

public interface IUserService {
	/**
	 * 用户登录方法
	 * @param zhanghao
	 * @param pwd
	 * @return
	 */
	users login(String zhanghao,String pwd);
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
	 List<users> FidUserTelOrEmail(String emailorPhone);
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

}
