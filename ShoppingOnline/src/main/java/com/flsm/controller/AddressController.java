package com.flsm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flsm.pojo.Address;
import com.flsm.pojo.Users;
import com.flsm.service.IAddressService;




@Controller
public class AddressController {
	
	@Autowired
	IAddressService addressservice;
	/**
	 * 跳转到地址界面
	 * @return
	 */
	@RequestMapping("action")
	public String Action() {
		return "redirect:SelectAddress";
	}
	
	/**
	 * 添加新地址
	 * @param address
	 * @param session
	 * @return
	 */
	@RequestMapping("InsertAddress")
	public String insertAddress(Address address,HttpSession session) {
		Users users=(Users)session.getAttribute("myself");
		//address.setUserid(users.getUid());
		if(addressservice.InsertAddress(address))
			return "redirect:SelectAddress";
		return "person/address.html";
	}
	
	/**
	 * 通过当前登录的用户ID查到此用户的地址
	 * @return
	 */
	@RequestMapping("SelectAddress")
	public String SelectAddress(Integer userid,Model model) {
		model.addAttribute("MyAddress", addressservice.SelectAddress(userid));
		return "person/address.html";
	}
	
	/**
	 * 通过地址id删除
	 * @param id
	 * @return
	 */
	@RequestMapping("DeleteById")
	public String DeleteById(Integer id) {
		addressservice.DeleteAddress(id);
		return "redirect:SelectAddress";
	}
	
	/**
	 * 查到要修改的地址id
	 * @param id
	 * @return
	 */
	@RequestMapping("SelectUpdateAddressById")
	public String SelectUpdateAddressById(Integer id,Model model) {
		model.addAttribute("UpdateAddress", addressservice.SelectUpdateAddressById(id));
		return "person/address.html";
	}
	
	/**
	 * 修改用户地址
	 * @param address
	 * @return
	 */
	@RequestMapping("UpdateAddress")
	public String UpdateAddress(Address address) {
		addressservice.UpdateAddress(address);
		return "redirect:SelectAddress";
	}

}
