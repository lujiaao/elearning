package cn.uc.ele.pojo;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * SysDepartment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sys_department", catalog = "learning")

public class SysDepartment implements java.io.Serializable {

	// Fields

	private Integer id;
	private String depttName;
	private String deptCode;
	private Integer parentId;
	@JsonIgnore
	private Set<UacUser> uacUsers = new HashSet<UacUser>(0);

	// Constructors

	/** default constructor */
	public SysDepartment() {
	}

	/** minimal constructor */
	public SysDepartment(String depttName, String deptCode) {
		this.depttName = depttName;
		this.deptCode = deptCode;
	}

	/** full constructor */
	public SysDepartment(String depttName, String deptCode, Integer parentId, Set<UacUser> uacUsers) {
		this.depttName = depttName;
		this.deptCode = deptCode;
		this.parentId = parentId;
		this.uacUsers = uacUsers;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "id", unique = true, nullable = false)

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "deptt_name", nullable = false, length = 50)

	public String getDepttName() {
		return this.depttName;
	}

	public void setDepttName(String depttName) {
		this.depttName = depttName;
	}

	@Column(name = "dept_code", nullable = false, length = 20)

	public String getDeptCode() {
		return this.deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	@Column(name = "parent_id")

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sysDepartment")

	public Set<UacUser> getUacUsers() {
		return this.uacUsers;
	}

	public void setUacUsers(Set<UacUser> uacUsers) {
		this.uacUsers = uacUsers;
	}

}