
package cn.uc.ele.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.uc.ele.Exception.DaoException;

/**
 * model层对数据库的（增、删、改、按id查询、查询全部）基本操作封装
 * 
 * @author ucai
 *
 * @param <T> 具体操作的实体对象（类）
 */
@Repository
public interface BaseDao<T> {

	/**
	 * 向数据库中添加一条新的记录
	 * 
	 * @param t 表示要添加记录对应的实体对象
	 * @throws DaoException 抛出数据持久化异常信息
	 */
	void add(T t) throws DaoException ;

	/**
	 * 对数据库进行删除一条记录操作
	 * @param t 表示要删除记录对应的实体对象
	 * @throws DaoException 抛出数据持久化异常信息
	 */
	void delete(T t) throws DaoException ;

	/**
	 * 对数据库进行更新一条记录操作
	 * @param t 表示要删除记录对应的实体对象
	 * @throws DaoException 抛出数据持久化异常信息
	 */
	void update(T t) throws DaoException ;

	/**
	 * 根据ID查询数据库中对应的一条记录,返回单个实体对象
	 * @param cls ORM中的实体类对象
	 * @param id id值
	 * @return 单个实体对象
	 * @throws DaoException 抛出数据持久化异常信息
	 */
	T getById(Class<?> cls, Serializable id) throws DaoException ;

	/**
	 * 根据条件查询单个对象
	 * @param hql hql查询语句
	 * @param params 查询语句中的参数
	 * Object表示类型不定,
	 * ...表示个数不固定，params形参的名称，它的使用和数组类似
	 * @return 单个实体对象
	 * @throws DaoException 抛出数据持久化异常信息
	 */
	T getByCondition(String hql, Object... params) throws DaoException ;// hql

	/**
	 * 根据条件查询多个对象
	 * @param hql hql查询语句
	 * @param params 查询语句中的参数
	 * Object表示类型不定,
	 * ...表示个数不固定，params形参的名称，它的使用和数组类似
	 * @return 具体实体对象的list集合
	 * @throws DaoException 抛出数据持久化异常信息
	 */
	List<T> getListByCondition(String hql, Object... params) throws DaoException ;

	/**
	 * 根据分页条件查询多个对象
	 * @param pageIndex 第几页
	 * @param PageSize 每一页的大小
	 * @param hql hql查询语句
	 * @param params 查询语句中的参数
	 * Object表示类型不定,
	 * ...表示个数不固定，params形参的名称，它的使用和数组类似
	 * @return 具体实体对象分页后的list集合
	 * @throws DaoException 抛出数据持久化异常信息
	 */
	List<T> getPageListByCondition(int pageIndex, int PageSize, String hql, Object... params) throws DaoException ;

	/**
	 * 查询数据条数
	 * @param hql
	 * @param params
	 * @return 数据库中记录的条数
	 * @throws DaoException 抛出数据持久化异常信息
	 */
	long getCountsByCondition(String hql, Object... params) throws DaoException ;
}
