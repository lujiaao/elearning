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
 * UacUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "uac_user", catalog = "learning")

public class UacUser implements java.io.Serializable {

	// Fields

	private Integer id;
	
	private SysDepartment sysDepartment;
	
	private String account;
	private String email;
	private String password;
	private String username;
	private String phone;
	private Integer gender;
	private Timestamp regTime;
	private Integer userType;
	private Set<SysComNews> sysComNewses = new HashSet<SysComNews>(0);
	private Set<SysKnowlege> sysKnowleges = new HashSet<SysKnowlege>(0);
	private Set<UacUserRole> uacUserRoles = new HashSet<UacUserRole>(0);
	private Set<CurChptLearning> curChptLearnings = new HashSet<CurChptLearning>(0);
	private Set<CurCourseinfor> curCourseinforsForTeacherId = new HashSet<CurCourseinfor>(0);
	private Set<CurCourseinfor> curCourseinforsForCurMgrId = new HashSet<CurCourseinfor>(0);
	private Set<CurUserCur> curUserCurs = new HashSet<CurUserCur>(0);
	private Set<Teacher> teachers = new HashSet<Teacher>(0);

	// Constructors

	/** default constructor */
	public UacUser() {
	}

	/** minimal constructor */
	public UacUser(String account, String email, String password) {
		this.account = account;
		this.email = email;
		this.password = password;
	}

	/** full constructor */
	public UacUser(SysDepartment sysDepartment, String account, String email, String password, String username,
			String phone, Integer gender, Timestamp regTime, Integer userType, Set<SysComNews> sysComNewses,
			Set<SysKnowlege> sysKnowleges, Set<UacUserRole> uacUserRoles, Set<CurChptLearning> curChptLearnings,
			Set<CurCourseinfor> curCourseinforsForTeacherId, Set<CurCourseinfor> curCourseinforsForCurMgrId,
			Set<CurUserCur> curUserCurs, Set<Teacher> teachers) {
		this.sysDepartment = sysDepartment;
		this.account = account;
		this.email = email;
		this.password = password;
		this.username = username;
		this.phone = phone;
		this.gender = gender;
		this.regTime = regTime;
		this.userType = userType;
		this.sysComNewses = sysComNewses;
		this.sysKnowleges = sysKnowleges;
		this.uacUserRoles = uacUserRoles;
		this.curChptLearnings = curChptLearnings;
		this.curCourseinforsForTeacherId = curCourseinforsForTeacherId;
		this.curCourseinforsForCurMgrId = curCourseinforsForCurMgrId;
		this.curUserCurs = curUserCurs;
		this.teachers = teachers;
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
	@JoinColumn(name = "dept_id")

	public SysDepartment getSysDepartment() {
		return this.sysDepartment;
	}

	public void setSysDepartment(SysDepartment sysDepartment) {
		this.sysDepartment = sysDepartment;
	}

	@Column(name = "account", nullable = false, length = 50)

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Column(name = "email", nullable = false, length = 50)

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", nullable = false, length = 50)

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "username", length = 50)

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "phone", length = 50)

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "gender")

	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	@Column(name = "reg_time", length = 19)

	public Timestamp getRegTime() {
		return this.regTime;
	}

	public void setRegTime(Timestamp regTime) {
		this.regTime = regTime;
	}

	@Column(name = "user_type")

	public Integer getUserType() {
		return this.userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "uacUser")

	public Set<SysComNews> getSysComNewses() {
		return this.sysComNewses;
	}

	public void setSysComNewses(Set<SysComNews> sysComNewses) {
		this.sysComNewses = sysComNewses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "uacUser")

	public Set<SysKnowlege> getSysKnowleges() {
		return this.sysKnowleges;
	}

	public void setSysKnowleges(Set<SysKnowlege> sysKnowleges) {
		this.sysKnowleges = sysKnowleges;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "uacUser")

	public Set<UacUserRole> getUacUserRoles() {
		return this.uacUserRoles;
	}

	public void setUacUserRoles(Set<UacUserRole> uacUserRoles) {
		this.uacUserRoles = uacUserRoles;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "uacUser")

	public Set<CurChptLearning> getCurChptLearnings() {
		return this.curChptLearnings;
	}

	public void setCurChptLearnings(Set<CurChptLearning> curChptLearnings) {
		this.curChptLearnings = curChptLearnings;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "uacUserByTeacherId")

	public Set<CurCourseinfor> getCurCourseinforsForTeacherId() {
		return this.curCourseinforsForTeacherId;
	}

	public void setCurCourseinforsForTeacherId(Set<CurCourseinfor> curCourseinforsForTeacherId) {
		this.curCourseinforsForTeacherId = curCourseinforsForTeacherId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "uacUserByCurMgrId")

	public Set<CurCourseinfor> getCurCourseinforsForCurMgrId() {
		return this.curCourseinforsForCurMgrId;
	}

	public void setCurCourseinforsForCurMgrId(Set<CurCourseinfor> curCourseinforsForCurMgrId) {
		this.curCourseinforsForCurMgrId = curCourseinforsForCurMgrId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "uacUser")

	public Set<CurUserCur> getCurUserCurs() {
		return this.curUserCurs;
	}

	public void setCurUserCurs(Set<CurUserCur> curUserCurs) {
		this.curUserCurs = curUserCurs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "uacUser")

	public Set<Teacher> getTeachers() {
		return this.teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

}