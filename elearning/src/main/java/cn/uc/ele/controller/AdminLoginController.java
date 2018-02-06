package cn.uc.ele.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.dto.UacRoleDto;
import cn.uc.ele.pojo.UacUser;
import cn.uc.ele.service.UacRoleService;
import cn.uc.ele.service.UacUserService;

@Controller
@RequestMapping("/backend")
public class AdminLoginController {
	
	@Autowired
	UacUserService userService;
	@Autowired
	UacRoleService roleService;
	
	@RequestMapping("/loginBefore")
	public String AdminLoginBefore(Model model){
		try {
			List<UacRoleDto> adminRoles = roleService.findAdminRole();
			model.addAttribute("adminRoles", adminRoles);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "login";
	}
	
	@RequestMapping("/adminLogin")
	public String AdminLogin(UacUser user,int roleId, Model model,HttpServletRequest request){
//		boolean tag = false;
		if(null==user.getAccount()||user.getAccount().equals("")){
			System.out.println("==009-=0990-");
			request.getSession().setAttribute("mess","用户名不能为空！");
//			model.addAttribute("mess", "用户名不能为空！");
//			return "redirect:/backend/loginBefore";
			return "login";
		}
		if(null==user.getPassword()||user.getPassword().equals("")){
			model.addAttribute("mess", "密码不能为空！");
			return "login";
		}
		System.out.println("---------");
		try {
			UacUser userlogin = userService.adminLogin(user);
			if(userlogin!=null){
//				request.getSession().setAttribute("tipTv","用户名或者密码错误");
				request.setAttribute("username", userlogin.getUsername());
				return "main";
			}
		} catch (DaoException e) {
			model.addAttribute("mess", e.getMessage());
			e.printStackTrace();
		}
		model.addAttribute("mess", "登录失败");
		return "login";
	}
}
