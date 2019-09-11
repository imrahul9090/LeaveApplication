package com.ojas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Manage_Employee")
public class ManageEmployee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empId;
	@Column(name = "EmpName")
	private String empName;
	@Column(name = "Email")
	private String email;
	@Column(name = "Role")
	private String role;

	public ManageEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ManageEmployee(Long empId, String empName, String email, String role) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.role = role;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "ManageEmployee [empId=" + empId + ", empName=" + empName + ", email=" + email + ", role=" + role + "]";
	}

}
