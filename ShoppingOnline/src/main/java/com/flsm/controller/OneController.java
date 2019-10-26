package com.flsm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flsm.pojo.one;
import com.flsm.service.imp.OneServiceImp;

@Controller
public class OneController {
	@Autowired
	OneServiceImp imp;
	
	@RequestMapping("show")
	public String show(Model mod,HttpSession session) {
		List<one> onedata = imp.findall();
		mod.addAttribute("odata",onedata);
		mod.addAttribute("myself",session.getAttribute("myself"));
	return "home/home.html";
	}

}
