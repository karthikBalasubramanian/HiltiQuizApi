package com.hilti.quiz.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="user_profile")
public class UserProfile {
	
	
	@Id
	@NotNull
	@Column(name="empid")
	private int empid;
	@Column(name="password")
	private String password;
	@Column(name = "display_pic")
	private String displayPic;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="middle_name")
	private String middleName;
	@Column(name="department")
	private String department;
	@Column(name="as_of_date")
	private String asOfDate;
	@Column(name="email")
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getDisplayPic() {
		return displayPic;
	}
	public void setDisplayPic(String displayPic) {
		this.displayPic = displayPic;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAsOfDate() {
		return asOfDate;
	}
	public void setAsOfDate(String asOfDate) {
		this.asOfDate = asOfDate;
	}
	
	public UserProfile() {
		super();
	}
	public UserProfile(int empid, String password, String displayPic, String firstName, String lastName,
			String middleName, String department, String asOfDate,String email) {
		super();
		this.empid = empid;
		this.password = password;
		this.displayPic = displayPic;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.department = department;
		this.asOfDate = asOfDate;
		this.email = email;
	}
	public UserProfile(int empid) {
		super();
		this.empid = empid;
	}
}
