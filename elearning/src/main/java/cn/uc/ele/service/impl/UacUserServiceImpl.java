package cn.uc.ele.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.Exception.ServiceException;
import cn.uc.ele.dao.UacUserDao;
import cn.uc.ele.dto.SysDepartmentDto;
import cn.uc.ele.dto.UacUserDto;
import cn.uc.ele.pojo.UacUser;
import cn.uc.ele.service.UacUserService;
import cn.uc.ele.utils.CopyPropertyUtil;

@Service
public class UacUserServiceImpl extends BaseServiceImpl<UacUser> implements UacUserService {

	@Autowired
	private UacUserDao userDao;
	
	@Transactional(readOnly=true)
	public UacUserDto findById(int id) throws DaoException{
		UacUser user = userDao.selectById(id);
		
//		UacUserDto userDto = new UacUserDto();
//		BeanUtils.copyProperties(user, userDto);
//		userDto.setSysDepartment(new SysDepartmentDto());
//		BeanUtils.copyProperties(user.getSysDepartment(), userDto.getSysDepartment());
		
		return (UacUserDto) CopyPropertyUtil.copyProperty(user, UacUserDto.class);
		
//		System.out.println(userDto.getSysDepartment().getDepttName());
		
//		return userDto;
		
		//return (UacUserDto) CopyPropertyUtil.copyProperty(user, UacUserDto.class);
	}
	
	
	@SuppressWarnings({ "unchecked", "null" })
	@Transactional(readOnly=true)
	public List<UacUserDto> findByAll() throws DaoException, ServiceException {
		List<UacUser> users = userDao.selectByAll();
		
		return CopyPropertyUtil.copyProperties(users, UacUserDto.class);
		
//		List<UacUserDto> userDtos = new ArrayList<UacUserDto>();
//		for(UacUser user: users){
//			UacUserDto userDto = new UacUserDto();
//			BeanUtils.copyProperties(user, userDto);
//			userDto.setSysDepartment(new SysDepartmentDto());
//			BeanUtils.copyProperties(user.getSysDepartment(), userDto.getSysDepartment());
//			userDtos.add(userDto);
//		}
//		
//		return userDtos;
		
//		return CopyPropertyUtil.copyProperty(users, UacUserDto.class);
	}

	@Override
	public UacUser adminLogin(UacUser user) throws DaoException {
		String hql = "select u from UacUser u where u.account=? and password=?";
		UacUser user2 = userDao.selectByCondition(hql, user.getAccount(),user.getPassword());
		return user2;
	}

	

}
