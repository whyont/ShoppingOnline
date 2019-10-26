package com.flsm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flsm.pojo.Users;
import com.flsm.service.IUserService;


@Controller
public class UserController {
	
	@Autowired
	IUserService userService;
	
	/**
	 * 启动登录跳转页面的方法
	 * @return
	 */
	@RequestMapping("ActionLogin")
	public String ActionLogin() {
		return "home/login.html";
	}
	
	/**
	 * 启动注册跳转页面的方法
	 * @return
	 */
	@RequestMapping("ActionRegister")
	public String ActionRegister() {
		return "home/register.html";
	}
	
	/**
	 * 登录方法，登录可以通过手机号，用户名，邮箱号中任意一个
	 * @param zhanghao 直接获取
	 * @param pwd 直接获取
	 * @param session 用来保存已登录用户的个人信息
	 * @return
	 */
	@RequestMapping("login")
	public String login(String zhanghao,String pwd,HttpSession session) {
		Users myself = userService.login(zhanghao, pwd);
		if(myself!=null) {
			session.setAttribute("myself", myself);
			return "redirect:show";
		}else {
			return "home/login.html";
		}
	}
	
	/**
	 * 跳转到忘记密码处理界面
	 * @return
	 */
	@RequestMapping("/ForgetPassword")
	public String ForgetPassword() {
		return "home/ForgetPassword";
	}
	
	/**
	 * 用户忘记邮箱密码时，调用此方法进行找回
	 * @param phone 提交过来的邮箱号码
	 * @param request 自动获取
	 * @return 验证码
	 */
	@RequestMapping("/UserEmailCode")
	@ResponseBody()
	public String UserEmailCode(String email,HttpServletRequest request) {
		return userService.EmailVerificationCode(email, request);
	}
	
	/**
	 * 用户忘记手机密码时，调用此方法进行找回
	 * @param phone 提交过来的手机号码
	 * @param request 自动获取
	 * @return 验证码
	 */
	
	@RequestMapping("/UserPhoneCode")
	@ResponseBody()
	public String UserPhoneCode(String phone,HttpServletRequest request) {
		return userService.PhoneVerificationCode(phone, request);
	}

	/***
	 * 检测用户是否已经存在
	 * @param phoneoremail 用户手机号或邮箱
	 * @return 是否已经被注册或使用了
	 */
	@RequestMapping("/CheckUserPhoneAndEmial")
	@ResponseBody()
	public boolean CheckUserPhoneAndEmial(String phoneoremail) {
		return userService.FidUserTelOrEmail(phoneoremail).size()>0;
	}
	
	/**
	 * 验证邮箱或手机是否存在
	 * @param phoneOrEmail 修改密码的手机号或邮箱
	 * @param code 验证码
	 * @param request
	 * @return
	 */
	@RequestMapping("ForgetPasswordVerification")
	public String ForgetPasswordVerification(String phoneOrEmail,String code,HttpServletRequest request) {
		if(userService.ForgetPasswordVerification(phoneOrEmail, code, request))
			return "redirect:ForgetResetPage";
		return "redirect:ForgetPassword";
	}
	
	/**
	 * 跳转到重置密码页面
	 * @param request
	 * @return
	 */
	@RequestMapping("/ForgetResetPage")
	public String ForgetResetPage(HttpServletRequest request) {
		if(userService.ResetPageValidation(request))
			return "home/ForgetPasswordOK";
		return "redirect:ForgetPassword";
	}
	
	/**
	 * 验证用户为本人后，重新设置账号密码
	 * @param request 从request中拿到session再从session中拿到需要重置密码的账号
	 * @return 成功返回login 否则 重写跳转到验证密码
	 */
	@RequestMapping("ForgetPasswordReset")
	public String ForgetPasswordReset(HttpServletRequest request) {
		if(userService.ForgetPasswordReset(request))
			return "redirect:ActionLogin";
		return "redirect:ForgetPassword";
		
	}
	
	/**
	 * 验证该注册用户
	 * 用户名或者邮箱号是否已存在
	 * @param tel
	 * @param pwd
	 * @return
	 */
	@RequestMapping("/ChekEmail")
	@ResponseBody()
	public boolean ChekEmail(String email) {
		return userService.CheckEmail(email);
	}
	
	/**
	 * 用户邮箱注册
	 * 
	 */
	@RequestMapping("UserRegister")
	public String UserRegister(String email,String pwd) {
		userService.UserRigeister(email, pwd);
		return "redirect:ActionLogin";
	}
	
	/**
	 * 发送验证码
	 * @param phone
	 * @param session
	 * @return
	 */
	@RequestMapping("/SendPhoneCode")
	@ResponseBody()
	public String SendPhoneCode(String phone,HttpSession session) {
		return userService.SendPhoneCode(phone, session);
	}
	
	/**
	 * 手机号注册
	 * @param tel
	 * @param pwd
	 * @param code
	 * @param session
	 * @return
	 */
	@RequestMapping("register")
	public String pregister(String tel,String pwd,String code,HttpSession session) {
	     Users u = userService.chauser(tel);
		    if(session.getAttribute(tel).equals(code)&&u==null) { 
		    	userService.pregister(tel, pwd);
		    	return "home/login.html";
		    }
		    else {
		    	return "home/register.html";
		    }
	}

}
