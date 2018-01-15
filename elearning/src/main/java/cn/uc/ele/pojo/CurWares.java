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
 * CurWares entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "cur_wares", catalog = "learning")

public class CurWares implements java.io.Serializable {

	// Fields

	private Integer column11;
	private CurChapter curChapter;
	private String wareName;
	private String typeCode;
	private String fileUrl;
	private Integer widthPix;
	private Integer heigthPix;
	private Integer minLearnTime;
	private Integer testId;
	private Integer disSeq;
	private String digest;
	private Set<CurChptLearning> curChptLearnings = new HashSet<CurChptLearning>(0);

	// Constructors

	/** default constructor */
	public CurWares() {
	}

	/** full constructor */
	public CurWares(CurChapter curChapter, String wareName, String typeCode, String fileUrl, Integer widthPix,
			Integer heigthPix, Integer minLearnTime, Integer testId, Integer disSeq, String digest,
			Set<CurChptLearning> curChptLearnings) {
		this.curChapter = curChapter;
		this.wareName = wareName;
		this.typeCode = typeCode;
		this.fileUrl = fileUrl;
		this.widthPix = widthPix;
		this.heigthPix = heigthPix;
		this.minLearnTime = minLearnTime;
		this.testId = testId;
		this.disSeq = disSeq;
		this.digest = digest;
		this.curChptLearnings = curChptLearnings;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "Column_11", unique = true, nullable = false)

	public Integer getColumn11() {
		return this.column11;
	}

	public void setColumn11(Integer column11) {
		this.column11 = column11;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "chapt_id")

	public CurChapter getCurChapter() {
		return this.curChapter;
	}

	public void setCurChapter(CurChapter curChapter) {
		this.curChapter = curChapter;
	}

	@Column(name = "ware_name", length = 100)

	public String getWareName() {
		return this.wareName;
	}

	public void setWareName(String wareName) {
		this.wareName = wareName;
	}

	@Column(name = "type_code", length = 20)

	public String getTypeCode() {
		return this.typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	@Column(name = "file_url", length = 100)

	public String getFileUrl() {
		return this.fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	@Column(name = "width_pix")

	public Integer getWidthPix() {
		return this.widthPix;
	}

	public void setWidthPix(Integer widthPix) {
		this.widthPix = widthPix;
	}

	@Column(name = "heigth_pix")

	public Integer getHeigthPix() {
		return this.heigthPix;
	}

	public void setHeigthPix(Integer heigthPix) {
		this.heigthPix = heigthPix;
	}

	@Column(name = "min_learn_time")

	public Integer getMinLearnTime() {
		return this.minLearnTime;
	}

	public void setMinLearnTime(Integer minLearnTime) {
		this.minLearnTime = minLearnTime;
	}

	@Column(name = "test_id")

	public Integer getTestId() {
		return this.testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	@Column(name = "dis_seq")

	public Integer getDisSeq() {
		return this.disSeq;
	}

	public void setDisSeq(Integer disSeq) {
		this.disSeq = disSeq;
	}

	@Column(name = "digest", length = 200)

	public String getDigest() {
		return this.digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "curWares")

	public Set<CurChptLearning> getCurChptLearnings() {
		return this.curChptLearnings;
	}

	public void setCurChptLearnings(Set<CurChptLearning> curChptLearnings) {
		this.curChptLearnings = curChptLearnings;
	}

}