package cn.uc.ele.service;

import java.util.List;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.dto.CurCourseinforDto;
import cn.uc.ele.pojo.CurCourseinfor;

public interface CurCourseinforService extends BaseService<CurCourseinfor> {

	List<CurCourseinforDto> findByAll() throws DaoException;
	
	CurCourseinforDto findById(int id) throws DaoException;
}
