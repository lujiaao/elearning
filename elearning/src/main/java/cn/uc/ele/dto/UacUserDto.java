package cn.uc.ele.dto;

import java.sql.Timestamp;


@SuppressWarnings("serial")
public class UacUserDto  implements java.io.Serializable {
	
	
	private SysDepartmentDto sysDepartment;
	
	private Integer id;
	private String account;
	private String email;
	private String password;
	private String username;
	private String phone;
	private Integer gender;
	private Timestamp regTime;
	private Integer userType;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public SysDepartmentDto getSysDepartment() {
		return sysDepartment;
	}
	public void setSysDepartment(SysDepartmentDto sysDepartment) {
		this.sysDepartment = sysDepartment;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Timestamp getRegTime() {
		return regTime;
	}
	public void setRegTime(Timestamp regTime) {
		this.regTime = regTime;
	}
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	
	
	
	
}
