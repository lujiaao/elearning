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
 * CurUserCur entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "cur_user_cur", catalog = "learning")

public class CurUserCur implements java.io.Serializable {

	// Fields

	private Integer id;
	private UacUser uacUser;
	private CurCourseinfor curCourseinfor;
	private Integer chptStatus;
	private Integer progress;
	private String totLearnTime;

	// Constructors

	/** default constructor */
	public CurUserCur() {
	}

	/** full constructor */
	public CurUserCur(UacUser uacUser, CurCourseinfor curCourseinfor, Integer chptStatus, Integer progress,
			String totLearnTime) {
		this.uacUser = uacUser;
		this.curCourseinfor = curCourseinfor;
		this.chptStatus = chptStatus;
		this.progress = progress;
		this.totLearnTime = totLearnTime;
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
	@JoinColumn(name = "user_id")

	public UacUser getUacUser() {
		return this.uacUser;
	}

	public void setUacUser(UacUser uacUser) {
		this.uacUser = uacUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cur_id")

	public CurCourseinfor getCurCourseinfor() {
		return this.curCourseinfor;
	}

	public void setCurCourseinfor(CurCourseinfor curCourseinfor) {
		this.curCourseinfor = curCourseinfor;
	}

	@Column(name = "chpt_status")

	public Integer getChptStatus() {
		return this.chptStatus;
	}

	public void setChptStatus(Integer chptStatus) {
		this.chptStatus = chptStatus;
	}

	@Column(name = "progress")

	public Integer getProgress() {
		return this.progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	@Column(name = "tot_learn_time", length = 20)

	public String getTotLearnTime() {
		return this.totLearnTime;
	}

	public void setTotLearnTime(String totLearnTime) {
		this.totLearnTime = totLearnTime;
	}

}