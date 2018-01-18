package cn.uc.ele.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.dao.BaseDao;

//spring中提供了一个对hibernate的dao方法实现的一个基类，可以通过继承该基类，轻松实现相关dao方法
@SuppressWarnings("all")
public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {

	@Resource(name = "sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory) {
			this.setSessionFactory(sessionFactory);
	}
	
	@Override
	//@Transactional(propagation =Propagation.REQUIRED)
	public void add(T t) throws DaoException {
		try {
			this.getHibernateTemplate().save(t);
		} catch (Exception e) {
			throw new DaoException("添加数据失败");
		}
		
	}

	@Override
	public void delete(T t) throws DaoException {
		try {
			this.getHibernateTemplate().delete(t);
		} catch (Exception e) {
			throw new DaoException("删除数据失败");
		}
		
	}

	@Override
	public void update(T t) throws DaoException {
//		try {
			this.getHibernateTemplate().update(t);
//		} catch (Exception e) {
//			throw new DaoException("更新数据失败");
//		}
		
	}

	@Override
	public T getById(Class<?> cls, Serializable id) throws DaoException {
		T t = null;
		try {
			t = (T) this.getHibernateTemplate().get(cls, id);
		} catch (Exception e) {
			throw new DaoException("根据id未查到记录");
		}
		return t;
	}

	@Override
	public T getByCondition(String hql, Object... params) throws DaoException {
		Session session = null;
		T t = null;
		try {
			session = this.getSessionFactory().openSession();
			try {
				Query query = session.createQuery(hql);
				if(params!=null){
					for(int i=0;i<params.length;i++){
						query.setParameter(i, params[i]);
					}
				}
				t = (T) query.uniqueResult();
			} catch (Exception e) {
				throw new DaoException("根据hql语句未查询到记录");
			}
		} catch (Exception e) {
			throw new DaoException("session获取失败");
		}finally {
			if(session!=null)
				session.close();
		}
		return t;
	}

	@Override
	public List<T> getListByCondition(String hql, Object... params) throws DaoException {
		Session session = null;
		List<T> ts = null;
		try {
			session = this.getSessionFactory().openSession();
			try {
				Query query = session.createQuery(hql);
				if(params!=null){
					for(int i=0;i<params.length;i++){
						query.setParameter(i, params[i]);
					}
				}
				ts = query.list();
			} catch (Exception e) {
				throw new DaoException("查询所有记录失败");
			}
		} catch (Exception e) {
			throw new DaoException("session获取失败");
		}finally {
			if(session!=null)
				session.close();
		}
		return ts;
	}

	@Override
	public List<T> getPageListByCondition(int pageIndex, int PageSize, String hql, Object... params) throws DaoException {
		List<T> ts = null;
		Session session = null;
		try {
			session = this.getSessionFactory().openSession();
			try {
				Query query = session.createQuery(hql);
				if(params!=null){
					for(int i=0;i<params.length;i++){
						query.setParameter(i, params[i]);
					}
				}
				// 开始的行索引
				query.setFirstResult(pageIndex);
				// 查询条数
				query.setMaxResults(pageIndex);
				ts = query.list();
			} catch (Exception e) {
				throw new DaoException("分页查询失败");
			}
		} catch (Exception e) {
			throw new DaoException("session获取失败");
		}finally {
			if(session!=null)
				session.close();
		}
		return ts;
	}

	@Override
	public long getCountsByCondition(String hql, Object... params) throws DaoException {
		Session session = null;
		long counts = 0;
		try {
			session = this.getSessionFactory().openSession();
			try {
				Query query = session.createQuery(hql);
				if(params!=null){
					for(int i=0;i<params.length;i++){
						query.setParameter(i, params[i]);
					}
				}
				counts = (long) query.uniqueResult();
			} catch (Exception e) {
				throw new DaoException("查询所记录失败");
			}
		} catch (Exception e) {
			throw new DaoException("session获取失败");
		}finally {
			if(session!=null)
				session.close();
		}
		return counts;
	}


}
