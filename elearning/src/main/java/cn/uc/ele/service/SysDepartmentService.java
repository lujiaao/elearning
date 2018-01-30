package cn.uc.ele.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.pojo.SysDepartment;

@Service
public interface SysDepartmentService extends BaseService<SysDepartment> {

	List<SysDepartment> findByAll() throws DaoException;
}
