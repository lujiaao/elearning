package cn.dao.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.dao.UacUserDao;
import cn.uc.ele.pojo.UacUser;

public class DaoTest {

	public static void main(String[] args) {

		new DaoTest().add();
		
//		new DaoTest().getById(4);
//		new DaoTest().del();
	}
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-cfg.xml");
	UacUserDao uacUserDao = context.getBean(UacUserDao.class,"uacUserDaoImpl");
	UacUser uacUser = new UacUser();
	
	
	public void del(){
		uacUser.setId(2);
		try {
			uacUserDao.delete(uacUser);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void add() {

		
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

	public void getById(int id) {
		try {
			UacUser uacUser = uacUserDao.getById(UacUser.class, id);
			System.out.println(uacUser.getUsername());
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
