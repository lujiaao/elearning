package cn.uc.ele.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.Exception.ServiceException;
import cn.uc.ele.constant.PageHelper;
import cn.uc.ele.dto.UacRoleDto;
import cn.uc.ele.pojo.UacRole;
import cn.uc.ele.service.UacRoleService;

@Controller
@RequestMapping("/backend")
public class UacRoleController {
	
	@Autowired
	UacRoleService roleService;
	
	String mess;
	
	/**
	 * 分页查询所有角色
	 * @param model
	 * @param pageNum
	 * @return
	 */
	@RequestMapping("/getByAll")
	public String getRoleByAll(Model model,int pageNum){
		try {
			
			List<UacRoleDto> roles = roleService.findByAll((pageNum-1)*PageHelper.PAGESIZE);
			Long count = roleService.findCount();
			double pages = count%PageHelper.PAGESIZE;
			//总记录数
			model.addAttribute("count",count);
			//当前页面返回的角色列表
			model.addAttribute("roles", roles);
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
	
	@RequestMapping("/addRole")
	public String addRole(UacRole role,Model model){
		try {
			roleService.add(role);
			model.addAttribute("mess", "添加成功！");
		} catch (DaoException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return "message";
	}
	
	@RequestMapping("/delRole")
	public String delRole(UacRole role,Model model){
		
		try {
			roleService.del(role);
			model.addAttribute("mess", "删除成功");
		} catch (DaoException e) {
			mess = "删除失败！";
			e.printStackTrace();
		} catch (ServiceException e) {
			mess = "删除失败！";
			e.printStackTrace();
		}
		return "message";
	}
	
	@RequestMapping("/editRoleBefore")
	public String editRoleBefore(UacRole role,Model model){
		
		try {
			roleService.edit(role);
			return "";
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	
}
