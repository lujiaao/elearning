package cn.uc.ele.service.impl;

import java.io.Serializable;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.dao.BaseDao;
import cn.uc.ele.service.BaseService;

public class BaseServiceImpl<T> implements BaseService<T> {
	BaseDao<T> baseDao;
	
	@Override
	public void add(T t) throws DaoException{
		// TODO Auto-generated method stub
		baseDao.add(t);
	}

	@Override
	public void delete(T t) throws DaoException {
		// TODO Auto-generated method stub
		baseDao.delete(t);
	}

	@Override
	public void update(T t) throws DaoException {
		// TODO Auto-generated method stub
		baseDao.update(t);
	}

	@Override
	public T getById(Class<?> cls, Serializable id) throws DaoException {
		// TODO Auto-generated method stub
		return baseDao.getById(cls, id);
	}

}
