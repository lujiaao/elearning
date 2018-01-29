package cn.dao.test;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.Exception.ServiceException;
import cn.uc.ele.dto.UacUserDto;
import cn.uc.ele.pojo.CurCourseinfor;
import cn.uc.ele.pojo.UacUser;
import cn.uc.ele.service.CityAndWeatherService;
import cn.uc.ele.service.CurCourseinforService;
import cn.uc.ele.service.UacUserService;

public class ServiceText {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-cfg.xml");
		
		
		CityAndWeatherService cityAndWeatherService = context.getBean(CityAndWeatherService.class);
		List<String> weather = cityAndWeatherService.getWeather("长沙");
		System.out.println("weather:"+weather);
	}
	
	ApplicationContext context;
	UacUserService uacUserService;
	@Before
	public void before(){
		context=new ClassPathXmlApplicationContext("spring-cfg.xml");
		uacUserService = context.getBean(UacUserService.class,"uacUserServiceImpl");
	}
	
	@Ignore
	@Test
	public void getByIdCourseinfo(){
		CurCourseinforService courseinforService = context.getBean(CurCourseinforService.class);
		try {
			CurCourseinfor courseinfor = courseinforService.findById(CurCourseinfor.class, 1);
			System.out.println(courseinfor.getCurName());
		} catch (DaoException | ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	@Ignore
	@Test
	public void getWeather(){
		CityAndWeatherService cityAndWeatherService = context.getBean(CityAndWeatherService.class);
		List<String> weather = cityAndWeatherService.getWeather("长沙");
		System.out.println(weather);
	}
	
	//@Ignore
	@Test
	public void getById(){
		try {
			UacUser uacUser;
			try {
				uacUser = uacUserService.findById(UacUser.class, 1);
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
			uacUserService.del(uacUser);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Ignore
	@Test
	public void findByAll(){
		try {
			String hql = "from UacUser u";
			List<UacUserDto> uacUsers = uacUserService.findByAll();
			for(UacUserDto uacUser : uacUsers ){
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
