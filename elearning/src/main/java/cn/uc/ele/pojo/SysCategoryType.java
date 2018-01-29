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
 * SysCategoryType entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sys_category_type", catalog = "learning")

public class SysCategoryType implements java.io.Serializable {

	// Fields

	private Integer id;
	private String typeName;
	private String typeCode;
	private Integer sortSeq;
	private Boolean isTree;
	private Set<SysCategory> sysCategories = new HashSet<SysCategory>(0);

	// Constructors

	/** default constructor */
	public SysCategoryType() {
	}

	/** minimal constructor */
	public SysCategoryType(String typeName, String typeCode) {
		this.typeName = typeName;
		this.typeCode = typeCode;
	}

	/** full constructor */
	public SysCategoryType(String typeName, String typeCode, Integer sortSeq, Boolean isTree,
			Set<SysCategory> sysCategories) {
		this.typeName = typeName;
		this.typeCode = typeCode;
		this.sortSeq = sortSeq;
		this.isTree = isTree;
		this.sysCategories = sysCategories;
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

	@Column(name = "type_name", nullable = false, length = 50)

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Column(name = "type_code", nullable = false, length = 20)

	public String getTypeCode() {
		return this.typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	@Column(name = "sort_seq")

	public Integer getSortSeq() {
		return this.sortSeq;
	}

	public void setSortSeq(Integer sortSeq) {
		this.sortSeq = sortSeq;
	}

	@Column(name = "is_tree")

	public Boolean getIsTree() {
		return this.isTree;
	}

	public void setIsTree(Boolean isTree) {
		this.isTree = isTree;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sysCategoryType")

	public Set<SysCategory> getSysCategories() {
		return this.sysCategories;
	}

	public void setSysCategories(Set<SysCategory> sysCategories) {
		this.sysCategories = sysCategories;
	}

}