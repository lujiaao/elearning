package cn.uc.ele.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.constant.PageHelper;
import cn.uc.ele.dao.UacRoleDao;
import cn.uc.ele.dto.UacRoleDto;
import cn.uc.ele.pojo.UacRole;
import cn.uc.ele.service.UacRoleService;
import cn.uc.ele.utils.CopyObjectPropertyUtil;

@Service
public class UacRoleServiceImpl extends BaseServiceImpl<UacRole> implements UacRoleService {

	@Autowired
	UacRoleDao roleDao;
	//
	@Override
	public List<UacRoleDto> findByAll(int pageNum) throws DaoException {
		String hql = "from UacRole ur";
		List<UacRole> roles = roleDao.selectPageListByCondition(pageNum,PageHelper.PAGESIZE, hql);
		
		
		return CopyObjectPropertyUtil.copyProperties(roles, UacRoleDto.class);
	}

	@Override
	public List<UacRoleDto> findAdminRole() throws DaoException {
		String hql = "from UacRole ur where roleType = 1";
		List<UacRole> roles = roleDao.selectListByCondition(hql);
		return CopyObjectPropertyUtil.copyProperties(roles, UacRoleDto.class);
	}

	@Override
	public Long findCount() throws DaoException {
		String hql = "select count(id) from UacRole ur";
		return roleDao.selectCountsByCondition(hql);
	}

}
