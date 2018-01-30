package cn.uc.ele.dto;

import java.io.Serializable;
import java.sql.Timestamp;

import cn.uc.ele.pojo.UacUser;

public class CurCourseinforDto implements Serializable {
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public UacUser getUacUserByCurMgrId() {
		return uacUserByCurMgrId;
	}
	public void setUacUserByCurMgrId(UacUser uacUserByCurMgrId) {
		this.uacUserByCurMgrId = uacUserByCurMgrId;
	}
	public UacUser getUacUserByTeacherId() {
		return uacUserByTeacherId;
	}
	public void setUacUserByTeacherId(UacUser uacUserByTeacherId) {
		this.uacUserByTeacherId = uacUserByTeacherId;
	}
	public String getCurName() {
		return curName;
	}
	public void setCurName(String curName) {
		this.curName = curName;
	}
	public String getCurCode() {
		return curCode;
	}
	public void setCurCode(String curCode) {
		this.curCode = curCode;
	}
	public String getCurDesc() {
		return curDesc;
	}
	public void setCurDesc(String curDesc) {
		this.curDesc = curDesc;
	}
	public String getCurTarget() {
		return curTarget;
	}
	public void setCurTarget(String curTarget) {
		this.curTarget = curTarget;
	}
	public String getCurTargetPerson() {
		return curTargetPerson;
	}
	public void setCurTargetPerson(String curTargetPerson) {
		this.curTargetPerson = curTargetPerson;
	}
	public Float getManScore() {
		return manScore;
	}
	public void setManScore(Float manScore) {
		this.manScore = manScore;
	}
	public Float getOptScore() {
		return optScore;
	}
	public void setOptScore(Float optScore) {
		this.optScore = optScore;
	}
	public String getCurLabel() {
		return curLabel;
	}
	public void setCurLabel(String curLabel) {
		this.curLabel = curLabel;
	}
	public Integer getCurStatus() {
		return curStatus;
	}
	public void setCurStatus(Integer curStatus) {
		this.curStatus = curStatus;
	}
	public String getCatCode() {
		return catCode;
	}
	public void setCatCode(String catCode) {
		this.catCode = catCode;
	}
	public Integer getCancelType() {
		return cancelType;
	}
	public void setCancelType(Integer cancelType) {
		this.cancelType = cancelType;
	}
	public Integer getCurTimeLength() {
		return curTimeLength;
	}
	public void setCurTimeLength(Integer curTimeLength) {
		this.curTimeLength = curTimeLength;
	}
	public Integer getStandardHours() {
		return standardHours;
	}
	public void setStandardHours(Integer standardHours) {
		this.standardHours = standardHours;
	}
	public Float getFee() {
		return fee;
	}
	public void setFee(Float fee) {
		this.fee = fee;
	}
	public Boolean getPassbyHours() {
		return passbyHours;
	}
	public void setPassbyHours(Boolean passbyHours) {
		this.passbyHours = passbyHours;
	}
	public Boolean getPassbyAll() {
		return passbyAll;
	}
	public void setPassbyAll(Boolean passbyAll) {
		this.passbyAll = passbyAll;
	}
	public Boolean getPassbyExam() {
		return passbyExam;
	}
	public void setPassbyExam(Boolean passbyExam) {
		this.passbyExam = passbyExam;
	}
	public Integer getLearnDays() {
		return learnDays;
	}
	public void setLearnDays(Integer learnDays) {
		this.learnDays = learnDays;
	}
	public Integer getShowSeq() {
		return showSeq;
	}
	public void setShowSeq(Integer showSeq) {
		this.showSeq = showSeq;
	}
	public Boolean getIsExamAftHours() {
		return isExamAftHours;
	}
	public void setIsExamAftHours(Boolean isExamAftHours) {
		this.isExamAftHours = isExamAftHours;
	}
	public Boolean getIsOpen() {
		return isOpen;
	}
	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}
	public Boolean getIsNew() {
		return isNew;
	}
	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}
	public Boolean getIsRecomment() {
		return isRecomment;
	}
	public void setIsRecomment(Boolean isRecomment) {
		this.isRecomment = isRecomment;
	}
	public Boolean getIsBest() {
		return isBest;
	}
	public void setIsBest(Boolean isBest) {
		this.isBest = isBest;
	}
	public String getCurImage() {
		return curImage;
	}
	public void setCurImage(String curImage) {
		this.curImage = curImage;
	}
	public String getCurTryVideo() {
		return curTryVideo;
	}
	public void setCurTryVideo(String curTryVideo) {
		this.curTryVideo = curTryVideo;
	}
	public Timestamp getCrateTime() {
		return crateTime;
	}
	public void setCrateTime(Timestamp crateTime) {
		this.crateTime = crateTime;
	}
	public Integer getCreateBy() {
		return createBy;
	}
	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}
	public Timestamp getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	public Integer getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	
}
