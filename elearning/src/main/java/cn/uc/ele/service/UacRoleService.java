package cn.uc.ele.service;

import java.util.List;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.dto.UacRoleDto;
import cn.uc.ele.pojo.UacRole;

public interface UacRoleService extends BaseService<UacRole> {
	
	/**
	 * 查询所有的角色
	 * @return
	 * @throws DaoException
	 */
	public List<UacRoleDto> findByAll(int pageNum) throws DaoException; 
	
	/**
	 * 查询后端管理角色
	 * @return
	 * @throws DaoException
	 */
	public List<UacRoleDto> findAdminRole() throws DaoException;
	
	Long findCount() throws DaoException;

}
