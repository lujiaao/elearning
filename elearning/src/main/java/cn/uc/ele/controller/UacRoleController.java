package cn.uc.ele.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.constant.PageHelper;
import cn.uc.ele.dto.UacRoleDto;
import cn.uc.ele.service.UacRoleService;

@Controller
@RequestMapping("/backend")
public class UacRoleController {
	
	@Autowired
	UacRoleService roleService;
	
	@RequestMapping("/getByAll")
	public String getRoleByAll(Model model,int pageNum){
		
		
		try {
			List<UacRoleDto> roles = roleService.findByAll(pageNum-1);
			Long count = roleService.findCount();
			double pages = count%PageHelper.PAGESIZE;
//			System.out.println("roles");
//			System.out.println("pages："+pages);
			//总记录数
			model.addAttribute("count",count);
			
			//当前页面返回的角色列表
			model.addAttribute("roles", roles);
			System.out.println("roles:"+roles);
			//当前页面号
			model.addAttribute("pageNum",pageNum);
			//总页面数
			model.addAttribute("pages",(pages==0)?count/PageHelper.PAGESIZE:(count/PageHelper.PAGESIZE)+1);
			//每页显示的条数
			model.addAttribute("pageSize",PageHelper.PAGESIZE);
		} catch (DaoException e) {
			e.printStackTrace();
		}
		return "user/role/role_main";
	}
}
