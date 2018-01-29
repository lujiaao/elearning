package cn.uc.ele.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.Exception.ServiceException;
import cn.uc.ele.dao.UacUserDao;
import cn.uc.ele.dto.UacUserDto;
import cn.uc.ele.pojo.UacUser;
import cn.uc.ele.service.UacUserService;
import cn.uc.ele.utils.CopyObjectPropertyUtil;

@Service
public class UacUserServiceImpl extends BaseServiceImpl<UacUser> implements UacUserService {

	@Autowired
	private UacUserDao userDao;
	
	public UacUserDto findById(int id) throws DaoException{
		UacUser user = userDao.selectById(id);
		
		return (UacUserDto) CopyObjectPropertyUtil.copyProperty(user, UacUserDto.class);
	}
	
	
	public List<UacUserDto> findByAll() throws DaoException, ServiceException {
		List<UacUser> users = userDao.selectByAll();
		@SuppressWarnings("unchecked")
		List<UacUserDto> userDtos = CopyObjectPropertyUtil.copyProperties(users, UacUserDto.class);
		
		return userDtos;
	}

	@Override
	public UacUser adminLogin(UacUser user) throws DaoException {
		String hql = "select u from UacUser u where u.account=? and password=?";
		UacUser user2 = userDao.selectByCondition(hql, user.getAccount(),user.getPassword());
		return user2;
	}

	

}
