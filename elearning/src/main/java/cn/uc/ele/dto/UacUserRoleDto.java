package cn.uc.ele.dto;

import java.io.Serializable;


public class UacUserRoleDto implements Serializable{
	private Integer id;
	
	private UacUserDto uacUser;
	private UacRoleDto uacRole;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public UacUserDto getUacUser() {
		return uacUser;
	}
	public void setUacUser(UacUserDto uacUser) {
		this.uacUser = uacUser;
	}
	public UacRoleDto getUacRole() {
		return uacRole;
	}
	public void setUacRole(UacRoleDto uacRole) {
		this.uacRole = uacRole;
	}
}
