package cn.uc.ele.pojo;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SysNotice entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sys_notice", catalog = "learning")

public class SysNotice implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String content;
	private Timestamp lauchTime;
	private Integer isDis;

	// Constructors

	/** default constructor */
	public SysNotice() {
	}

	/** minimal constructor */
	public SysNotice(String title) {
		this.title = title;
	}

	/** full constructor */
	public SysNotice(String title, String content, Timestamp lauchTime, Integer isDis) {
		this.title = title;
		this.content = content;
		this.lauchTime = lauchTime;
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

	@Column(name = "title", nullable = false, length = 100)

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "content", length = 65535)

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "lauch_time", length = 19)

	public Timestamp getLauchTime() {
		return this.lauchTime;
	}

	public void setLauchTime(Timestamp lauchTime) {
		this.lauchTime = lauchTime;
	}

	@Column(name = "is_dis")

	public Integer getIsDis() {
		return this.isDis;
	}

	public void setIsDis(Integer isDis) {
		this.isDis = isDis;
	}

}