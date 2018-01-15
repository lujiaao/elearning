package cn.uc.ele.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * UacUserRole entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "uac_user_role", catalog = "learning")

public class UacUserRole implements java.io.Serializable {

	// Fields

	private Integer id;
	private UacUser uacUser;
	private UacRole uacRole;

	// Constructors

	/** default constructor */
	public UacUserRole() {
	}

	/** full constructor */
	public UacUserRole(UacUser uacUser, UacRole uacRole) {
		this.uacUser = uacUser;
		this.uacRole = uacRole;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uac_id")

	public UacUser getUacUser() {
		return this.uacUser;
	}

	public void setUacUser(UacUser uacUser) {
		this.uacUser = uacUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id")

	public UacRole getUacRole() {
		return this.uacRole;
	}

	public void setUacRole(UacRole uacRole) {
		this.uacRole = uacRole;
	}

}