package cn.uc.ele.service;

import java.io.Serializable;
import java.util.List;

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
	void del(T t) throws DaoException,ServiceException;

	/**
	 * 修改业务操作
	 * @param t
	 */
	void edit(T t) throws DaoException,ServiceException;

}
