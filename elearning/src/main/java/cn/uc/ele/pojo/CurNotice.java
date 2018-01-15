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
 * CurNotice entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "cur_notice", catalog = "learning")

public class CurNotice implements java.io.Serializable {

	// Fields

	private Integer id;
	private CurCourseinfor curCourseinfor;
	private String title;
	private Timestamp lauchTime;
	private String content;
	private Boolean isDis;

	// Constructors

	/** default constructor */
	public CurNotice() {
	}

	/** minimal constructor */
	public CurNotice(String title) {
		this.title = title;
	}

	/** full constructor */
	public CurNotice(CurCourseinfor curCourseinfor, String title, Timestamp lauchTime, String content, Boolean isDis) {
		this.curCourseinfor = curCourseinfor;
		this.title = title;
		this.lauchTime = lauchTime;
		this.content = content;
		this.isDis = isDis;
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

	@Column(name = "title", nullable = false, length = 100)

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "lauch_time", length = 19)

	public Timestamp getLauchTime() {
		return this.lauchTime;
	}

	public void setLauchTime(Timestamp lauchTime) {
		this.lauchTime = lauchTime;
	}

	@Column(name = "content", length = 65535)

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "is_dis")

	public Boolean getIsDis() {
		return this.isDis;
	}

	public void setIsDis(Boolean isDis) {
		this.isDis = isDis;
	}

}