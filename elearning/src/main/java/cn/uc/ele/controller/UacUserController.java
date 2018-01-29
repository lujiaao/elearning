package cn.uc.ele.controller;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.Exception.ServiceException;
import cn.uc.ele.dto.UacUserDto;
import cn.uc.ele.pojo.SysDepartment;
import cn.uc.ele.pojo.UacUser;
import cn.uc.ele.service.SysDepartmentService;
import cn.uc.ele.service.UacUserService;

/**
 * 用户的操作
 * @author ucai
 *
 */
@Controller
@RequestMapping("/backend")
public class UacUserController {
	
	@Autowired
	private UacUserService uacUserService;
	@Autowired
	private SysDepartmentService departmentService;
	
	String mess;
	
	/**
	 * 添加用户之前查询所有的部门
	 * @param model
	 * @return
	 */
	@RequestMapping("/userAddBefore")
	public String userAddBefore(Model model){
		List<SysDepartment> departments = null;
		try {
			departments = departmentService.findByAll();
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("departments", departments);
		return "user/user_add";
	}
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	@RequestMapping("/userAdd")
	public String addUacUser(UacUser user,Model model){
		try {
			Timestamp timestamp = new Timestamp(new Date().getTime());
			user.setRegTime(timestamp);
			uacUserService.add(user);
			mess = "添加成功!";
		} catch (DaoException e) {
			mess="添加失败！"+e.getMessage();
		} catch (ServiceException e) {
			mess="添加失败！"+e.getMessage();
		}
		model.addAttribute("mess",mess);
		return "message";
	}
	
	/**
	 * 查询所有用户信息
	 * @return
	 */
	@RequestMapping("userFindByAll")
	public ModelAndView getUacUserByAll(){
		List<UacUserDto> uacUsers = null;
		try {
			uacUsers = uacUserService.findByAll();
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("user/user_main").addObject("uacUserAll", uacUsers);
	}
	
	/**
	 * 修改用户之前，查询需修改的用户信息。
	 * @param id
	 * @return
	 */
	@RequestMapping("/userEditBefore")
	public ModelAndView editAfter(int id){
		UacUserDto uacUser=null;
		List<SysDepartment> departments=null;
		try {
			uacUser = uacUserService.findById(id);
			departments = departmentService.findByAll();
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(uacUser.getRegTime());
		System.out.println(uacUser.getUsername());
		return new ModelAndView("user/user_edit").addObject("uacUser", uacUser).addObject("departments", departments);
	}
	
	/**
	 * 修改用户
	 * @param uacUser
	 * @return
	 */
	@RequestMapping("/userEdit")
	public ModelAndView edit(UacUser uacUser){
		try {
			uacUserService.edit(uacUser);
			mess = "修改成功！";
		} catch (DaoException e) {
			mess="修改失败！"+e.getMessage()+"。";
			e.printStackTrace();
		} catch (ServiceException e) {
			mess="修改失败！"+e.getMessage()+"。";
			e.printStackTrace();
		}
		return new ModelAndView("message").addObject("mess", mess);
	}
	
	@RequestMapping("/userDel")
	public String del(UacUser user,Model model){
		
		try {
			uacUserService.del(user);
			mess ="删除成功";
		} catch (DaoException e) {
			mess="删除失败！"+e.getMessage()+"。";
			e.printStackTrace();
		} catch (ServiceException e) {
			mess="删除失败！"+e.getMessage()+"。";
			e.printStackTrace();
		}
		model.addAttribute("mess",mess);
		return "message";
	}
	
	
}
