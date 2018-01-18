package cn.dao.test;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.Exception.ServiceException;
import cn.uc.ele.pojo.UacUser;
import cn.uc.ele.service.UacUserService;
import cn.uc.ele.service.impl.UacUserServiceImpl;

public class ServiceText {
	
	ApplicationContext context;
	UacUserService uacUserService;
	@Before
	public void before(){
		context=new ClassPathXmlApplicationContext("spring-cfg.xml");
		uacUserService = context.getBean(UacUserService.class,"uacUserServiceImpl");
	}
	@Ignore
	@Test
	public void getById(){
		try {
			UacUser uacUser;
			try {
				uacUser = uacUserService.getById(UacUser.class, 1);
				System.out.println(uacUser.getUsername());
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Ignore
	@Test
	public void del(){
		UacUser uacUser = new UacUser();
		uacUser.setId(4);
		try {
			uacUserService.delete(uacUser);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void findByAll(){
		try {
			String hql = "from UacUser u";
			List<UacUser> uacUsers = uacUserService.findByAll(hql);
			for(UacUser uacUser : uacUsers ){
				System.out.println(uacUser.getAccount());
			}
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
