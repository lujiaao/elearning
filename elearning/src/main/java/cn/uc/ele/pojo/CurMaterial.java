package cn.uc.ele.pojo;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CurMaterial entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "cur_material", catalog = "learning")

public class CurMaterial implements java.io.Serializable {

	// Fields

	private Integer id;
	private CurCourseinfor curCourseinfor;
	private String name;
	private String atachement;
	private Integer totalSize;
	private Timestamp uploadTime;
	private Integer uploadBy;

	// Constructors

	/** default constructor */
	public CurMaterial() {
	}

	/** minimal constructor */
	public CurMaterial(String name, String atachement) {
		this.name = name;
		this.atachement = atachement;
	}

	/** full constructor */
	public CurMaterial(CurCourseinfor curCourseinfor, String name, String atachement, Integer totalSize,
			Timestamp uploadTime, Integer uploadBy) {
		this.curCourseinfor = curCourseinfor;
		this.name = name;
		this.atachement = atachement;
		this.totalSize = totalSize;
		this.uploadTime = uploadTime;
		this.uploadBy = uploadBy;
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
	@JoinColumn(name = "cur_id")

	public CurCourseinfor getCurCourseinfor() {
		return this.curCourseinfor;
	}

	public void setCurCourseinfor(CurCourseinfor curCourseinfor) {
		this.curCourseinfor = curCourseinfor;
	}

	@Column(name = "name", nullable = false, length = 100)

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "atachement", nullable = false, length = 100)

	public String getAtachement() {
		return this.atachement;
	}

	public void setAtachement(String atachement) {
		this.atachement = atachement;
	}

	@Column(name = "total_size")

	public Integer getTotalSize() {
		return this.totalSize;
	}

	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}

	@Column(name = "upload_time", length = 19)

	public Timestamp getUploadTime() {
		return this.uploadTime;
	}

	public void setUploadTime(Timestamp uploadTime) {
		this.uploadTime = uploadTime;
	}

	@Column(name = "upload_by")

	public Integer getUploadBy() {
		return this.uploadBy;
	}

	public void setUploadBy(Integer uploadBy) {
		this.uploadBy = uploadBy;
	}

}