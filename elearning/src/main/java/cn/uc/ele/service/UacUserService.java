package cn.uc.ele.service;

import java.util.List;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.Exception.ServiceException;
import cn.uc.ele.dto.UacUserDto;
import cn.uc.ele.pojo.UacUser;

public interface UacUserService extends BaseService<UacUser> {

	public UacUserDto findById(int id) throws DaoException;
	
	public List<UacUserDto> findByAll() throws DaoException, ServiceException ;
	
	public UacUser adminLogin(UacUser user) throws DaoException;
}
