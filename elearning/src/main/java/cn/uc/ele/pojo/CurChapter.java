package cn.uc.ele.pojo;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CurChapter entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "cur_chapter", catalog = "learning")

public class CurChapter implements java.io.Serializable {

	// Fields

	private Integer id;
	private CurCourseinfor curCourseinfor;
	private String chaName;
	private Integer disSeq;
	private Set<CurWares> curWareses = new HashSet<CurWares>(0);

	// Constructors

	/** default constructor */
	public CurChapter() {
	}

	/** minimal constructor */
	public CurChapter(CurCourseinfor curCourseinfor) {
		this.curCourseinfor = curCourseinfor;
	}

	/** full constructor */
	public CurChapter(CurCourseinfor curCourseinfor, String chaName, Integer disSeq, Set<CurWares> curWareses) {
		this.curCourseinfor = curCourseinfor;
		this.chaName = chaName;
		this.disSeq = disSeq;
		this.curWareses = curWareses;
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
	@JoinColumn(name = "cur_id", nullable = false)

	public CurCourseinfor getCurCourseinfor() {
		return this.curCourseinfor;
	}

	public void setCurCourseinfor(CurCourseinfor curCourseinfor) {
		this.curCourseinfor = curCourseinfor;
	}

	@Column(name = "cha_name", length = 50)

	public String getChaName() {
		return this.chaName;
	}

	public void setChaName(String chaName) {
		this.chaName = chaName;
	}

	@Column(name = "dis_seq")

	public Integer getDisSeq() {
		return this.disSeq;
	}

	public void setDisSeq(Integer disSeq) {
		this.disSeq = disSeq;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "curChapter")

	public Set<CurWares> getCurWareses() {
		return this.curWareses;
	}

	public void setCurWareses(Set<CurWares> curWareses) {
		this.curWareses = curWareses;
	}

}