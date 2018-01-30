package cn.uc.ele.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.pojo.UacUser;
import cn.uc.ele.service.UacUserService;

@Controller
@RequestMapping("/backend")
public class AdminLoginController {
	
	@Autowired
	UacUserService userService;
	
	public String AdminLoginBefore(){
		
		
		
		return "login";
	}
	
	@RequestMapping("/adminLogin")
	@ResponseBody
	public String AdminLogin(UacUser user,Model model,HttpServletRequest request){
//		boolean tag = false;
		if(null==user.getAccount()||user.getAccount().equals("")){
			model.addAttribute("mess", "用户名不能为空！");
			return "login";
		}
		if(null==user.getPassword()||user.getPassword().equals("")){
			model.addAttribute("mess", "密码不能为空！");
			return "login";
		}
		try {
			UacUser userlogin = userService.adminLogin(user);
			if(userlogin!=null){
				request.setAttribute("username", userlogin.getUsername());
				return "main";
			}
		} catch (DaoException e) {
			model.addAttribute("mess", e.getMessage());
			e.printStackTrace();
		}
		return "login";
	}
}
