package cn.uc.ele.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.uc.ele.Exception.DaoException;
import cn.uc.ele.dao.CurCourseinforDao;
import cn.uc.ele.dto.CurCourseinforDto;
import cn.uc.ele.pojo.CurCourseinfor;
import cn.uc.ele.service.CurCourseinforService;
import cn.uc.ele.utils.CopyObjectPropertyUtil;

@Service
public class CurCourseinforServiceImpl extends BaseServiceImpl<CurCourseinfor> implements CurCourseinforService {

	@Autowired
	private CurCourseinforDao courseinforDao;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CurCourseinforDto> findByAll() throws DaoException {
		return CopyObjectPropertyUtil.copyProperties(courseinforDao.selectByAll(), CurCourseinforDto.class) ;
	}

	@Override
	public CurCourseinforDto findById(int id) throws DaoException {
		
		return (CurCourseinforDto) CopyObjectPropertyUtil.copyProperty(courseinforDao.selectById(id), CurCourseinforDto.class);
	}
	
	

}
