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
 * SysCodeType entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sys_code_type", catalog = "learning")

public class SysCodeType implements java.io.Serializable {

	// Fields

	private Integer id;
	private String typeCode;
	private String typeCodeDesc;
	private Set<SysRefCode> sysRefCodes = new HashSet<SysRefCode>(0);

	// Constructors

	/** default constructor */
	public SysCodeType() {
	}

	/** minimal constructor */
	public SysCodeType(String typeCode) {
		this.typeCode = typeCode;
	}

	/** full constructor */
	public SysCodeType(String typeCode, String typeCodeDesc, Set<SysRefCode> sysRefCodes) {
		this.typeCode = typeCode;
		this.typeCodeDesc = typeCodeDesc;
		this.sysRefCodes = sysRefCodes;
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

	@Column(name = "type_code", nullable = false, length = 20)

	public String getTypeCode() {
		return this.typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	@Column(name = "type_code_desc", length = 100)

	public String getTypeCodeDesc() {
		return this.typeCodeDesc;
	}

	public void setTypeCodeDesc(String typeCodeDesc) {
		this.typeCodeDesc = typeCodeDesc;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sysCodeType")

	public Set<SysRefCode> getSysRefCodes() {
		return this.sysRefCodes;
	}

	public void setSysRefCodes(Set<SysRefCode> sysRefCodes) {
		this.sysRefCodes = sysRefCodes;
	}

}