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
 * SysComNews entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sys_com_news", catalog = "learning")

public class SysComNews implements java.io.Serializable {

	// Fields

	private Integer id;
	private UacUser uacUser;
	private String title;
	private String content;
	private String cateCode;
	private Timestamp launchDate;
	private String atachement;
	private String imageUrl;
	private Boolean isDisplay;
	private Timestamp crateTime;
	private Timestamp modifiedTime;
	private Integer modifiedBy;

	// Constructors

	/** default constructor */
	public SysComNews() {
	}

	/** minimal constructor */
	public SysComNews(String title, String content, String cateCode, Timestamp launchDate) {
		this.title = title;
		this.content = content;
		this.cateCode = cateCode;
		this.launchDate = launchDate;
	}

	/** full constructor */
	public SysComNews(UacUser uacUser, String title, String content, String cateCode, Timestamp launchDate,
			String atachement, String imageUrl, Boolean isDisplay, Timestamp crateTime, Timestamp modifiedTime,
			Integer modifiedBy) {
		this.uacUser = uacUser;
		this.title = title;
		this.content = content;
		this.cateCode = cateCode;
		this.launchDate = launchDate;
		this.atachement = atachement;
		this.imageUrl = imageUrl;
		this.isDisplay = isDisplay;
		this.crateTime = crateTime;
		this.modifiedTime = modifiedTime;
		this.modifiedBy = modifiedBy;
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
	@JoinColumn(name = "create_by")

	public UacUser getUacUser() {
		return this.uacUser;
	}

	public void setUacUser(UacUser uacUser) {
		this.uacUser = uacUser;
	}

	@Column(name = "title", nullable = false, length = 100)

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "content", nullable = false, length = 65535)

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "cate_code", nullable = false, length = 20)

	public String getCateCode() {
		return this.cateCode;
	}

	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}

	@Column(name = "launch_date", nullable = false, length = 19)

	public Timestamp getLaunchDate() {
		return this.launchDate;
	}

	public void setLaunchDate(Timestamp launchDate) {
		this.launchDate = launchDate;
	}

	@Column(name = "atachement", length = 100)

	public String getAtachement() {
		return this.atachement;
	}

	public void setAtachement(String atachement) {
		this.atachement = atachement;
	}

	@Column(name = "image_url", length = 100)

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Column(name = "is_display")

	public Boolean getIsDisplay() {
		return this.isDisplay;
	}

	public void setIsDisplay(Boolean isDisplay) {
		this.isDisplay = isDisplay;
	}

	@Column(name = "crate_time", length = 19)

	public Timestamp getCrateTime() {
		return this.crateTime;
	}

	public void setCrateTime(Timestamp crateTime) {
		this.crateTime = crateTime;
	}

	@Column(name = "modified_time", length = 19)

	public Timestamp getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	@Column(name = "modified_by")

	public Integer getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

}