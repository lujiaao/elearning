package cn.uc.ele.pojo;

import java.sql.Time;
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
 * CurChptLearning entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "cur_chpt_learning", catalog = "learning")

public class CurChptLearning implements java.io.Serializable {

	// Fields

	private Integer id;
	private UacUser uacUser;
	private CurWares curWares;
	private Time totLearnTime;
	private Timestamp lastLearnTime;
	private Integer learnCount;
	private Time learnedTime;

	// Constructors

	/** default constructor */
	public CurChptLearning() {
	}

	/** full constructor */
	public CurChptLearning(UacUser uacUser, CurWares curWares, Time totLearnTime, Timestamp lastLearnTime,
			Integer learnCount, Time learnedTime) {
		this.uacUser = uacUser;
		this.curWares = curWares;
		this.totLearnTime = totLearnTime;
		this.lastLearnTime = lastLearnTime;
		this.learnCount = learnCount;
		this.learnedTime = learnedTime;
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
	@JoinColumn(name = "cur_chapt_id")

	public CurWares getCurWares() {
		return this.curWares;
	}

	public void setCurWares(CurWares curWares) {
		this.curWares = curWares;
	}

	@Column(name = "tot_learn_time", length = 8)

	public Time getTotLearnTime() {
		return this.totLearnTime;
	}

	public void setTotLearnTime(Time totLearnTime) {
		this.totLearnTime = totLearnTime;
	}

	@Column(name = "last_learn_time", length = 19)

	public Timestamp getLastLearnTime() {
		return this.lastLearnTime;
	}

	public void setLastLearnTime(Timestamp lastLearnTime) {
		this.lastLearnTime = lastLearnTime;
	}

	@Column(name = "learn_count")

	public Integer getLearnCount() {
		return this.learnCount;
	}

	public void setLearnCount(Integer learnCount) {
		this.learnCount = learnCount;
	}

	@Column(name = "learned_time", length = 8)

	public Time getLearnedTime() {
		return this.learnedTime;
	}

	public void setLearnedTime(Time learnedTime) {
		this.learnedTime = learnedTime;
	}

}