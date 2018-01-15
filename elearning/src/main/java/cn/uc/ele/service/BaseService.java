package cn.uc.ele.service;

import java.io.Serializable;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.Exception.ServiceException;

/**
 * 基本业务接口
 * @author ucai
 *
 * @param <T>
 */
public interface BaseService<T> {
	/**
	 * 增加业务操作
	 * @param t
	 */
	void add(T t) throws DaoException,ServiceException;

	/**
	 * 删除业务操作
	 * @param t
	 */
	void delete(T t) throws DaoException,ServiceException;

	/**
	 * 修改业务操作
	 * @param t
	 */
	void update(T t) throws DaoException,ServiceException;

	/**
	 * 根据id查询业务
	 * @param cls
	 * @param id
	 * @return
	 */
	T getById(Class<?> cls, Serializable id) throws DaoException,ServiceException;
}
