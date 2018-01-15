package cn.dao.test;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.dao.UacUserDao;
import cn.uc.ele.dao.impl.UacUserDaoImpl;
import cn.uc.ele.pojo.UacUser;

public class DaoTest {
	
	UacUserDao uacUserDao;
	ApplicationContext context;
	@Before
	public void before(){
		context=new ClassPathXmlApplicationContext("spring-cfg.xml");
		uacUserDao = context.getBean(UacUserDao.class,uacUserDao);
	}

	//@Ignore
	@Test
	public void add() {

		UacUser uacUser = new UacUser();
		uacUser.setAccount("小卢");
		uacUser.setUsername("xiao_lu");
		uacUser.setEmail("15575174195@163.com");
		uacUser.setPassword("123666");
		
		try {
			uacUserDao.add(uacUser);
			System.out.println("添加成功");
		} catch (DaoException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	@Ignore
	@Test
	public void getById(){
		try {
			UacUser uacUser = uacUserDao.getById(UacUser.class, 1);
			System.out.println(uacUser.getUsername());
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
