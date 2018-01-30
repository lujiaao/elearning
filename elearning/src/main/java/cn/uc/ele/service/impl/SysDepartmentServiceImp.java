package cn.uc.ele.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.dao.SysDepartmentDao;
import cn.uc.ele.pojo.SysDepartment;
import cn.uc.ele.service.SysDepartmentService;

@Service
public class SysDepartmentServiceImp extends BaseServiceImpl<SysDepartment> implements SysDepartmentService {

	@Autowired
	private SysDepartmentDao departmentDao;
	
	@Override
	public List<SysDepartment> findByAll() throws DaoException {
		return departmentDao.selectByAll();
	}

	

}
