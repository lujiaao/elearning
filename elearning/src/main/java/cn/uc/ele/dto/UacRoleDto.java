package cn.uc.ele.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import cn.uc.ele.pojo.UacRoleRight;
import cn.uc.ele.pojo.UacUserRole;

public class UacRoleDto implements Serializable{
	private Integer id;
	private String roleName;
	private String roleCode;
	private String roleType;
	private Integer disSeq;
	private Boolean isDeactive;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public Integer getDisSeq() {
		return disSeq;
	}
	public void setDisSeq(Integer disSeq) {
		this.disSeq = disSeq;
	}
	public Boolean getIsDeactive() {
		return isDeactive;
	}
	public void setIsDeactive(Boolean isDeactive) {
		this.isDeactive = isDeactive;
	}
}
