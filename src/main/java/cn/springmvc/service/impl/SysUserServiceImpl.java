package cn.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.SysUserMapper;
import cn.springmvc.model.SysUser;
import cn.springmvc.service.SysUserService;
@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public int addSysUser(SysUser sysUser) {
		return sysUserMapper.insert(sysUser);
	}

	@Override
	public int updateSysUser(SysUser sysUser) {
		sysUserMapper.updateByPrimaryKey(sysUser);
		return 0;
	}
	
	

}
