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
 * SysRefCode entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sys_ref_code", catalog = "learning")

public class SysRefCode implements java.io.Serializable {

	// Fields

	private Integer id;
	private SysCodeType sysCodeType;
	private String code;
	private String codeDesc;
	private Integer despSeq;

	// Constructors

	/** default constructor */
	public SysRefCode() {
	}

	/** minimal constructor */
	public SysRefCode(String code) {
		this.code = code;
	}

	/** full constructor */
	public SysRefCode(SysCodeType sysCodeType, String code, String codeDesc, Integer despSeq) {
		this.sysCodeType = sysCodeType;
		this.code = code;
		this.codeDesc = codeDesc;
		this.despSeq = despSeq;
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
	@JoinColumn(name = "code_type_id")

	public SysCodeType getSysCodeType() {
		return this.sysCodeType;
	}

	public void setSysCodeType(SysCodeType sysCodeType) {
		this.sysCodeType = sysCodeType;
	}

	@Column(name = "code", nullable = false, length = 20)

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "code_desc", length = 200)

	public String getCodeDesc() {
		return this.codeDesc;
	}

	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}

	@Column(name = "desp_seq")

	public Integer getDespSeq() {
		return this.despSeq;
	}

	public void setDespSeq(Integer despSeq) {
		this.despSeq = despSeq;
	}

}