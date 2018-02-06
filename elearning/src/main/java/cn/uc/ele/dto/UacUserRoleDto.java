package cn.uc.ele.dto;

import java.io.Serializable;

import cn.uc.ele.pojo.UacRole;
import cn.uc.ele.pojo.UacUser;


public class UacUserRoleDto implements Serializable{
	private Integer id;
	
	private UacUser uacUser;
	private UacRole uacRole;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public UacUser getUacUser() {
		return uacUser;
	}
	public void setUacUser(UacUser uacUser) {
		this.uacUser = uacUser;
	}
	public UacRole getUacRole() {
		return uacRole;
	}
	public void setUacRole(UacRole uacRole) {
		this.uacRole = uacRole;
	}
}
