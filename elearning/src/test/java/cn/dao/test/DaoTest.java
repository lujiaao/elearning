package cn.dao.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.dao.CurCourseinforDao;
import cn.uc.ele.dao.UacUserDao;
import cn.uc.ele.pojo.CurCourseinfor;
import cn.uc.ele.pojo.UacUser;
import cn.uc.ele.service.CityAndWeatherService;

public class DaoTest {

	public static void main(String[] args) {
		//测试user表
//		new DaoTest().addUser();
//		new DaoTest().getByIdUser(4);
//		new DaoTest().delUser();
		//测试webService获取天气
//		new DaoTest().getWeather();
		//测试课程表curcourseinfo
//		new DaoTest().getByIdCourseinfo();
		
		
	}
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-cfg.xml");
	UacUserDao uacUserDao = context.getBean(UacUserDao.class,"uacUserDaoImpl");
	UacUser uacUser = new UacUser();
	
	
	
	public void getByIdCourseinfo() {
		CurCourseinforDao courseinforDao = context.getBean(CurCourseinforDao.class);
		CurCourseinfor courseinfor=null;
		try {
			courseinfor = courseinforDao.selectById(1);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(courseinfor.getCurName());
	}
	
	public void getWeather(){
		CityAndWeatherService cityAndWeatherService = context.getBean(CityAndWeatherService.class);
		List<String> weather = cityAndWeatherService.getWeather("长沙");
		System.out.println(weather);
	}
	
	public void delUser(){
		uacUser.setId(2);
		try {
			uacUserDao.delete(uacUser);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addUser() {

		
		uacUser.setAccount("小卢");
		uacUser.setUsername("xiao_lu");
		uacUser.setEmail("15575174195@163.com");
		uacUser.setPassword("123666");

		try {
			uacUserDao.insert(uacUser);
			System.out.println("添加成功");
		} catch (DaoException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public void getByIdUser(int id) {
		try {
			UacUser uacUser = uacUserDao.selectById(id);
			System.out.println(uacUser.getUsername());
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
