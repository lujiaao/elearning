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

/**
 * UacRole entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "uac_role", catalog = "learning")

public class UacRole implements java.io.Serializable {

	// Fields

	private Integer id;
	private String roleName;
	private String roleCode;
	private String roleType;
	private Integer disSeq;
	private Boolean isDeactive;
	private Set<UacRoleRight> uacRoleRights = new HashSet<UacRoleRight>(0);
	private Set<UacUserRole> uacUserRoles = new HashSet<UacUserRole>(0);

	// Constructors

	/** default constructor */
	public UacRole() {
	}

	/** full constructor */
	public UacRole(String roleName, String roleCode, String roleType, Integer disSeq, Boolean isDeactive,
			Set<UacRoleRight> uacRoleRights, Set<UacUserRole> uacUserRoles) {
		this.roleName = roleName;
		this.roleCode = roleCode;
		this.roleType = roleType;
		this.disSeq = disSeq;
		this.isDeactive = isDeactive;
		this.uacRoleRights = uacRoleRights;
		this.uacUserRoles = uacUserRoles;
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

	@Column(name = "role_name", length = 100)

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Column(name = "role_code", length = 100)

	public String getRoleCode() {
		return this.roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	@Column(name = "role_type", length = 100)

	public String getRoleType() {
		return this.roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	@Column(name = "dis_seq")

	public Integer getDisSeq() {
		return this.disSeq;
	}

	public void setDisSeq(Integer disSeq) {
		this.disSeq = disSeq;
	}

	@Column(name = "is_deactive")

	public Boolean getIsDeactive() {
		return this.isDeactive;
	}

	public void setIsDeactive(Boolean isDeactive) {
		this.isDeactive = isDeactive;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "uacRole")

	public Set<UacRoleRight> getUacRoleRights() {
		return this.uacRoleRights;
	}

	public void setUacRoleRights(Set<UacRoleRight> uacRoleRights) {
		this.uacRoleRights = uacRoleRights;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "uacRole")

	public Set<UacUserRole> getUacUserRoles() {
		return this.uacUserRoles;
	}

	public void setUacUserRoles(Set<UacUserRole> uacUserRoles) {
		this.uacUserRoles = uacUserRoles;
	}

}