package cn.uc.ele.pojo;

import java.sql.Timestamp;
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
 * CurCourseinfor entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "cur_courseinfor", catalog = "learning")

public class CurCourseinfor implements java.io.Serializable {

	// Fields

	private Integer id;
	private UacUser uacUserByCurMgrId;
	private UacUser uacUserByTeacherId;
	private String curName;
	private String curCode;
	private String curDesc;
	private String curTarget;
	private String curTargetPerson;
	private Float manScore;
	private Float optScore;
	private String curLabel;
	private Integer curStatus;
	private String catCode;
	private Integer cancelType;
	private Integer curTimeLength;
	private Integer standardHours;
	private Float fee;
	private Boolean passbyHours;
	private Boolean passbyAll;
	private Boolean passbyExam;
	private Integer learnDays;
	private Integer showSeq;
	private Boolean isExamAftHours;
	private Boolean isOpen;
	private Boolean isNew;
	private Boolean isRecomment;
	private Boolean isBest;
	private String curImage;
	private String curTryVideo;
	private Timestamp crateTime;
	private Integer createBy;
	private Timestamp modifiedTime;
	private Integer modifiedBy;
	private Set<CurChapter> curChapters = new HashSet<CurChapter>(0);
	private Set<CurMaterial> curMaterials = new HashSet<CurMaterial>(0);
	private Set<CurNotice> curNotices = new HashSet<CurNotice>(0);
	private Set<CurUserCur> curUserCurs = new HashSet<CurUserCur>(0);

	// Constructors

	/** default constructor */
	public CurCourseinfor() {
	}

	/** minimal constructor */
	public CurCourseinfor(UacUser uacUserByCurMgrId, String curName, String curCode, Float manScore, Float optScore,
			String catCode, Integer standardHours, Integer learnDays) {
		this.uacUserByCurMgrId = uacUserByCurMgrId;
		this.curName = curName;
		this.curCode = curCode;
		this.manScore = manScore;
		this.optScore = optScore;
		this.catCode = catCode;
		this.standardHours = standardHours;
		this.learnDays = learnDays;
	}

	/** full constructor */
	public CurCourseinfor(UacUser uacUserByCurMgrId, UacUser uacUserByTeacherId, String curName, String curCode,
			String curDesc, String curTarget, String curTargetPerson, Float manScore, Float optScore, String curLabel,
			Integer curStatus, String catCode, Integer cancelType, Integer curTimeLength, Integer standardHours,
			Float fee, Boolean passbyHours, Boolean passbyAll, Boolean passbyExam, Integer learnDays, Integer showSeq,
			Boolean isExamAftHours, Boolean isOpen, Boolean isNew, Boolean isRecomment, Boolean isBest, String curImage,
			String curTryVideo, Timestamp crateTime, Integer createBy, Timestamp modifiedTime, Integer modifiedBy,
			Set<CurChapter> curChapters, Set<CurMaterial> curMaterials, Set<CurNotice> curNotices,
			Set<CurUserCur> curUserCurs) {
		this.uacUserByCurMgrId = uacUserByCurMgrId;
		this.uacUserByTeacherId = uacUserByTeacherId;
		this.curName = curName;
		this.curCode = curCode;
		this.curDesc = curDesc;
		this.curTarget = curTarget;
		this.curTargetPerson = curTargetPerson;
		this.manScore = manScore;
		this.optScore = optScore;
		this.curLabel = curLabel;
		this.curStatus = curStatus;
		this.catCode = catCode;
		this.cancelType = cancelType;
		this.curTimeLength = curTimeLength;
		this.standardHours = standardHours;
		this.fee = fee;
		this.passbyHours = passbyHours;
		this.passbyAll = passbyAll;
		this.passbyExam = passbyExam;
		this.learnDays = learnDays;
		this.showSeq = showSeq;
		this.isExamAftHours = isExamAftHours;
		this.isOpen = isOpen;
		this.isNew = isNew;
		this.isRecomment = isRecomment;
		this.isBest = isBest;
		this.curImage = curImage;
		this.curTryVideo = curTryVideo;
		this.crateTime = crateTime;
		this.createBy = createBy;
		this.modifiedTime = modifiedTime;
		this.modifiedBy = modifiedBy;
		this.curChapters = curChapters;
		this.curMaterials = curMaterials;
		this.curNotices = curNotices;
		this.curUserCurs = curUserCurs;
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
	@JoinColumn(name = "cur_mgr_id", nullable = false)

	public UacUser getUacUserByCurMgrId() {
		return this.uacUserByCurMgrId;
	}

	public void setUacUserByCurMgrId(UacUser uacUserByCurMgrId) {
		this.uacUserByCurMgrId = uacUserByCurMgrId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "teacher_id")

	public UacUser getUacUserByTeacherId() {
		return this.uacUserByTeacherId;
	}

	public void setUacUserByTeacherId(UacUser uacUserByTeacherId) {
		this.uacUserByTeacherId = uacUserByTeacherId;
	}

	@Column(name = "cur_name", nullable = false, length = 100)

	public String getCurName() {
		return this.curName;
	}

	public void setCurName(String curName) {
		this.curName = curName;
	}

	@Column(name = "cur_code", nullable = false, length = 50)

	public String getCurCode() {
		return this.curCode;
	}

	public void setCurCode(String curCode) {
		this.curCode = curCode;
	}

	@Column(name = "cur_desc", length = 65535)

	public String getCurDesc() {
		return this.curDesc;
	}

	public void setCurDesc(String curDesc) {
		this.curDesc = curDesc;
	}

	@Column(name = "cur_target", length = 100)

	public String getCurTarget() {
		return this.curTarget;
	}

	public void setCurTarget(String curTarget) {
		this.curTarget = curTarget;
	}

	@Column(name = "cur_target_person", length = 100)

	public String getCurTargetPerson() {
		return this.curTargetPerson;
	}

	public void setCurTargetPerson(String curTargetPerson) {
		this.curTargetPerson = curTargetPerson;
	}

	@Column(name = "man_score", nullable = false, precision = 12, scale = 0)

	public Float getManScore() {
		return this.manScore;
	}

	public void setManScore(Float manScore) {
		this.manScore = manScore;
	}

	@Column(name = "opt_score", nullable = false, precision = 12, scale = 0)

	public Float getOptScore() {
		return this.optScore;
	}

	public void setOptScore(Float optScore) {
		this.optScore = optScore;
	}

	@Column(name = "cur_label", length = 100)

	public String getCurLabel() {
		return this.curLabel;
	}

	public void setCurLabel(String curLabel) {
		this.curLabel = curLabel;
	}

	@Column(name = "cur_status")

	public Integer getCurStatus() {
		return this.curStatus;
	}

	public void setCurStatus(Integer curStatus) {
		this.curStatus = curStatus;
	}

	@Column(name = "cat_code", nullable = false, length = 20)

	public String getCatCode() {
		return this.catCode;
	}

	public void setCatCode(String catCode) {
		this.catCode = catCode;
	}

	@Column(name = "cancel_type")

	public Integer getCancelType() {
		return this.cancelType;
	}

	public void setCancelType(Integer cancelType) {
		this.cancelType = cancelType;
	}

	@Column(name = "cur_time_length")

	public Integer getCurTimeLength() {
		return this.curTimeLength;
	}

	public void setCurTimeLength(Integer curTimeLength) {
		this.curTimeLength = curTimeLength;
	}

	@Column(name = "standard_hours", nullable = false)

	public Integer getStandardHours() {
		return this.standardHours;
	}

	public void setStandardHours(Integer standardHours) {
		this.standardHours = standardHours;
	}

	@Column(name = "fee", precision = 12, scale = 0)

	public Float getFee() {
		return this.fee;
	}

	public void setFee(Float fee) {
		this.fee = fee;
	}

	@Column(name = "passby_hours")

	public Boolean getPassbyHours() {
		return this.passbyHours;
	}

	public void setPassbyHours(Boolean passbyHours) {
		this.passbyHours = passbyHours;
	}

	@Column(name = "passby_all")

	public Boolean getPassbyAll() {
		return this.passbyAll;
	}

	public void setPassbyAll(Boolean passbyAll) {
		this.passbyAll = passbyAll;
	}

	@Column(name = "passby_exam")

	public Boolean getPassbyExam() {
		return this.passbyExam;
	}

	public void setPassbyExam(Boolean passbyExam) {
		this.passbyExam = passbyExam;
	}

	@Column(name = "learn_days", nullable = false)

	public Integer getLearnDays() {
		return this.learnDays;
	}

	public void setLearnDays(Integer learnDays) {
		this.learnDays = learnDays;
	}

	@Column(name = "show_seq")

	public Integer getShowSeq() {
		return this.showSeq;
	}

	public void setShowSeq(Integer showSeq) {
		this.showSeq = showSeq;
	}

	@Column(name = "is_exam_aft_hours")

	public Boolean getIsExamAftHours() {
		return this.isExamAftHours;
	}

	public void setIsExamAftHours(Boolean isExamAftHours) {
		this.isExamAftHours = isExamAftHours;
	}

	@Column(name = "is_open")

	public Boolean getIsOpen() {
		return this.isOpen;
	}

	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}

	@Column(name = "is_new")

	public Boolean getIsNew() {
		return this.isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	@Column(name = "is_recomment")

	public Boolean getIsRecomment() {
		return this.isRecomment;
	}

	public void setIsRecomment(Boolean isRecomment) {
		this.isRecomment = isRecomment;
	}

	@Column(name = "is_best")

	public Boolean getIsBest() {
		return this.isBest;
	}

	public void setIsBest(Boolean isBest) {
		this.isBest = isBest;
	}

	@Column(name = "cur_image", length = 100)

	public String getCurImage() {
		return this.curImage;
	}

	public void setCurImage(String curImage) {
		this.curImage = curImage;
	}

	@Column(name = "cur_try_video", length = 100)

	public String getCurTryVideo() {
		return this.curTryVideo;
	}

	public void setCurTryVideo(String curTryVideo) {
		this.curTryVideo = curTryVideo;
	}

	@Column(name = "crate_time", length = 19)

	public Timestamp getCrateTime() {
		return this.crateTime;
	}

	public void setCrateTime(Timestamp crateTime) {
		this.crateTime = crateTime;
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

	@Column(name = "modified_by")

	public Integer getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "curCourseinfor")

	public Set<CurChapter> getCurChapters() {
		return this.curChapters;
	}

	public void setCurChapters(Set<CurChapter> curChapters) {
		this.curChapters = curChapters;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "curCourseinfor")

	public Set<CurMaterial> getCurMaterials() {
		return this.curMaterials;
	}

	public void setCurMaterials(Set<CurMaterial> curMaterials) {
		this.curMaterials = curMaterials;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "curCourseinfor")

	public Set<CurNotice> getCurNotices() {
		return this.curNotices;
	}

	public void setCurNotices(Set<CurNotice> curNotices) {
		this.curNotices = curNotices;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "curCourseinfor")

	public Set<CurUserCur> getCurUserCurs() {
		return this.curUserCurs;
	}

	public void setCurUserCurs(Set<CurUserCur> curUserCurs) {
		this.curUserCurs = curUserCurs;
	}

}