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
 * Teacher entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "teacher", catalog = "learning")

public class Teacher implements java.io.Serializable {

	// Fields

	private Integer id;
	private UacUser uacUser;
	private String code;
	private String name;
	private String title;
	private String photo;
	private String intro;

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(String code, String name) {
		this.code = code;
		this.name = name;
	}

	/** full constructor */
	public Teacher(UacUser uacUser, String code, String name, String title, String photo, String intro) {
		this.uacUser = uacUser;
		this.code = code;
		this.name = name;
		this.title = title;
		this.photo = photo;
		this.intro = intro;
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

	@Column(name = "code", nullable = false, length = 20)

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "name", nullable = false, length = 50)

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "title", length = 50)

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "photo", length = 100)

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Column(name = "intro", length = 65535)

	public String getIntro() {
		return this.intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

}