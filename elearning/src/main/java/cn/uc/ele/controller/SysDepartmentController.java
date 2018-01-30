package cn.uc.ele.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.pojo.SysDepartment;
import cn.uc.ele.service.SysDepartmentService;

@Controller
@RequestMapping("/backend")
public class SysDepartmentController {
	@Autowired
	private SysDepartmentService departmentService;
	
	@RequestMapping("findDepartmentAll")
	@ResponseBody
	public List<SysDepartment> department(){
		List<SysDepartment> departments=null;
		try {
			departments = departmentService.findByAll();
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return departments;
		
	}
}
