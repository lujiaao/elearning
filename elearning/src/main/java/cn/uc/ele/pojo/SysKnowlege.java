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
 * SysKnowlege entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sys_knowlege", catalog = "learning")

public class SysKnowlege implements java.io.Serializable {

	// Fields

	private Integer id;
	private UacUser uacUser;
	private String title;
	private String brief;
	private String content;
	private String cateCode;
	private Timestamp launchDate;
	private String atachement;
	private String imageUrl;
	private Integer knStatus;
	private Timestamp createTime;
	private Integer createBy;
	private Timestamp modifiedTime;
	private Boolean isOpen;
	private Integer seq;
	private Integer docType;

	// Constructors

	/** default constructor */
	public SysKnowlege() {
	}

	/** minimal constructor */
	public SysKnowlege(String title, String content, String cateCode, Timestamp launchDate) {
		this.title = title;
		this.content = content;
		this.cateCode = cateCode;
		this.launchDate = launchDate;
	}

	/** full constructor */
	public SysKnowlege(UacUser uacUser, String title, String brief, String content, String cateCode,
			Timestamp launchDate, String atachement, String imageUrl, Integer knStatus, Timestamp createTime,
			Integer createBy, Timestamp modifiedTime, Boolean isOpen, Integer seq, Integer docType) {
		this.uacUser = uacUser;
		this.title = title;
		this.brief = brief;
		this.content = content;
		this.cateCode = cateCode;
		this.launchDate = launchDate;
		this.atachement = atachement;
		this.imageUrl = imageUrl;
		this.knStatus = knStatus;
		this.createTime = createTime;
		this.createBy = createBy;
		this.modifiedTime = modifiedTime;
		this.isOpen = isOpen;
		this.seq = seq;
		this.docType = docType;
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
	@JoinColumn(name = "modified_by")

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

	@Column(name = "brief", length = 100)

	public String getBrief() {
		return this.brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
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

	@Column(name = "kn_status")

	public Integer getKnStatus() {
		return this.knStatus;
	}

	public void setKnStatus(Integer knStatus) {
		this.knStatus = knStatus;
	}

	@Column(name = "create_time", length = 19)

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Column(name = "create_by")

	public Integer getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}

	@Column(name = "modified_time", length = 19)

	public Timestamp getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	@Column(name = "is_open")

	public Boolean getIsOpen() {
		return this.isOpen;
	}

	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}

	@Column(name = "seq")

	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "doc_type")

	public Integer getDocType() {
		return this.docType;
	}

	public void setDocType(Integer docType) {
		this.docType = docType;
	}

}