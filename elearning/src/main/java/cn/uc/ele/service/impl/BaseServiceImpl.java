package cn.uc.ele.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.Exception.ServiceException;
import cn.uc.ele.dao.BaseDao;
import cn.uc.ele.service.BaseService;


public class BaseServiceImpl<T> implements BaseService<T> {
	@Autowired
	BaseDao<T> baseDao;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void add(T t) throws DaoException{
		// TODO Auto-generated method stub
		baseDao.insert(t);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void del(T t) throws DaoException {
		// TODO Auto-generated method stub
		baseDao.delete(t);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void edit(T t) throws DaoException {
		// TODO Auto-generated method stub
		baseDao.update(t);
	}

}
