package cn.uc.ele.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Flavor entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "flavor", catalog = "learning")

public class Flavor implements java.io.Serializable {

	// Fields

	private Integer id;
	private String path;
	private String bg;

	// Constructors

	/** default constructor */
	public Flavor() {
	}

	/** full constructor */
	public Flavor(String path, String bg) {
		this.path = path;
		this.bg = bg;
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

	@Column(name = "path", length = 65535)

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Column(name = "bg", length = 65535)

	public String getBg() {
		return this.bg;
	}

	public void setBg(String bg) {
		this.bg = bg;
	}

}