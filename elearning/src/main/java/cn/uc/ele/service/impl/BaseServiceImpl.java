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
		baseDao.add(t);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void delete(T t) throws DaoException {
		// TODO Auto-generated method stub
		baseDao.delete(t);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void update(T t) throws DaoException {
		// TODO Auto-generated method stub
		baseDao.update(t);
	}

	@Override
	@Transactional(readOnly=true)
	public T getById(Class<?> cls, Serializable id) throws DaoException {
		// TODO Auto-generated method stub
		return baseDao.getById(cls, id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<T> findByAll(String hql, Object... params) throws DaoException, ServiceException {
		// TODO Auto-generated method stub
		return baseDao.getListByCondition(hql, params);
	}

}
