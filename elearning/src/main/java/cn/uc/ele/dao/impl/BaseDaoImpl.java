package cn.uc.ele.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.dao.BaseDao;

//spring中提供了一个对hibernate的dao方法实现的一个基类，可以通过继承该基类，轻松实现相关dao方法
@SuppressWarnings("all")
public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {

	Class<T> clst;

	/**
	 * 获取泛型的具体类型
	 * 
	 * @param index第几个泛型
	 * @return 泛型对应的类
	 */
	public Class getGenericity(int index) {
		Class currentClass = this.getClass();
		ParameterizedType parentClass = (ParameterizedType) currentClass.getGenericSuperclass();
		Type[] parameter = parentClass.getActualTypeArguments();
		return (Class) parameter[index];
	}

	public BaseDaoImpl() {
		clst = getGenericity(0);
	}

	@Resource(name = "sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory) {
		this.setSessionFactory(sessionFactory);
		this.getHibernateTemplate().setCheckWriteOperations(false);
	}

	@Override
	public void insert(T t) throws DaoException {
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
		try {
			this.getHibernateTemplate().update(t);
		} catch (Exception e) {
			throw new DaoException("更新数据失败");
		}

	}

	@Override
	public T selectById(Serializable id) throws DaoException {
		T t = null;
		try {
			t = (T) this.getHibernateTemplate().get(clst, id);
		} catch (Exception e) {
			throw new DaoException("根据id未查到记录");
		}
		return t;
	}

	@Override
	public T selectByCondition(String hql, Object... params) throws DaoException {
		return (T) this.getHibernateTemplate().execute(new HibernateCallback<T>() {
			@Override
			public T doInHibernate(Session session) throws HibernateException {
				T t = null;
				Query query = session.createQuery(hql);
				if (params != null) {
					for (int i = 0; i < params.length; i++) {
						query.setParameter(i, params[i]);
					}
				}
				t = (T) query.uniqueResult();
				return t;
			}
		});
	}

	@Override
	public List<T> selectListByCondition(String hql, Object... params) throws DaoException {
		return (List<T>) this.getHibernateTemplate().execute(new HibernateCallback<List<T>>() {
			@Override
			public List<T> doInHibernate(Session session) throws HibernateException {
				List<T> ts = null;
				Query query = session.createQuery(hql);
				if (params != null) {
					for (int i = 0; i < params.length; i++) {
						query.setParameter(i, params[i]);
					}
				}
				return query.list();
			}
		});
	}

	@Override
	public List<T> selectByAll() throws DaoException {
		// System.out.println("获取类名T==SimpleName："+clst.getSimpleName());
		String hql = "from " + clst.getSimpleName() + " t";
		return this.selectListByCondition(hql);
	}

	@Override
	public List<T> selectPageListByCondition(int pageIndex, int PageSize, String hql, Object... params)
			throws DaoException {
		return (List<T>)this.getHibernateTemplate().execute(new HibernateCallback<List<T>>() {

			@Override
			public List<T> doInHibernate(Session session) throws HibernateException {
				Query query = session.createQuery(hql);
				if (params != null) {
					for (int i = 0; i < params.length; i++) {
						query.setParameter(i, params[i]);
					}
				}
				// 开始的行索引
				query.setFirstResult(pageIndex);
				// 查询条数
				query.setMaxResults(PageSize);
				return query.list();
			}
		});
	}

	@Override
	public long selectCountsByCondition(String hql, Object... params) throws DaoException {
		return (long) this.getHibernateTemplate().execute(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session) throws HibernateException {
				Query query = session.createQuery(hql);
				if (params != null) {
					for (int i = 0; i < params.length; i++) {
						query.setParameter(i, params[i]);
					}
				}
				return (long) query.uniqueResult();
			}
		});
	}

}
