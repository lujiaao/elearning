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
 * SysCategory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sys_category", catalog = "learning")

public class SysCategory implements java.io.Serializable {

	// Fields

	private Integer id;
	private SysCategoryType sysCategoryType;
	private String catName;
	private String catCode;
	private Integer parentId;

	// Constructors

	/** default constructor */
	public SysCategory() {
	}

	/** minimal constructor */
	public SysCategory(String catName, String catCode) {
		this.catName = catName;
		this.catCode = catCode;
	}

	/** full constructor */
	public SysCategory(SysCategoryType sysCategoryType, String catName, String catCode, Integer parentId) {
		this.sysCategoryType = sysCategoryType;
		this.catName = catName;
		this.catCode = catCode;
		this.parentId = parentId;
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
	@JoinColumn(name = "cat_type")

	public SysCategoryType getSysCategoryType() {
		return this.sysCategoryType;
	}

	public void setSysCategoryType(SysCategoryType sysCategoryType) {
		this.sysCategoryType = sysCategoryType;
	}

	@Column(name = "cat_name", nullable = false, length = 50)

	public String getCatName() {
		return this.catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	@Column(name = "cat_code", nullable = false, length = 20)

	public String getCatCode() {
		return this.catCode;
	}

	public void setCatCode(String catCode) {
		this.catCode = catCode;
	}

	@Column(name = "parent_id")

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

}