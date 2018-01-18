package cn.uc.ele.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.Exception.ServiceException;
import cn.uc.ele.pojo.UacUser;
import cn.uc.ele.service.UacUserService;

@Controller
@RequestMapping("/backend")
public class UacUserController {
	
	@Autowired
	private UacUserService uacUserService;
	String mess;
	
	@RequestMapping("/addUacUser")
	public String addUacUser(/*UacUser user*/){
//		try {
//			uacUserService.add(user);
//		} catch (DaoException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ServiceException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		return "main";
	}
	
	/**
	 * 查询所有用户信息控制器
	 * @return
	 */
	@RequestMapping("/findUacUserByAll")
	public ModelAndView getUacUserByAll(){
		
		String hql = "from UacUser u";
		List<UacUser> uacUsers = null;
		try {
			uacUsers = uacUserService.findByAll(hql);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("user/user_main").addObject("uacUserAll", uacUsers);
	}
	
	@RequestMapping("/editUacUserAfter")
	public ModelAndView editAfter(int id){
		UacUser uacUser=null;
		try {
			uacUser = uacUserService.getById(UacUser.class, id);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("user/user_edit").addObject("uacUser", uacUser);
	}
	
	@RequestMapping("/editUacUser")
	public ModelAndView edit(UacUser uacUser){
		System.out.println(uacUser.getId());
		System.out.println(uacUser.getAccount());
		System.out.println(uacUser.getEmail());
		try {
			uacUserService.update(uacUser);
			mess = "修改成功！";
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("message").addObject("mess", mess);
	}
}
