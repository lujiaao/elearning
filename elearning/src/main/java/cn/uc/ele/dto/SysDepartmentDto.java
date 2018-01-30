package cn.uc.ele.dto;

import java.io.Serializable;

public class SysDepartmentDto implements Serializable {
	
	private Integer id;
	private String depttName;
	private String deptCode;
	private Integer parentId;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDepttName() {
		return depttName;
	}
	public void setDepttName(String depttName) {
		this.depttName = depttName;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	
	
}
