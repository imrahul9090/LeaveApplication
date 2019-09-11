package com.ojas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Manage_Leave")
public class ManageLeave {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "EmpName")
	private String name;
	@Column(name = "FromDate")
	private String fromDate;
	@Column(name = "presentDay")
	private String today;
	@Column(name = "NoOfDays")
	private String noOfDays;
	@Column(name = "LeaveType")
	private String leaveType;

	public ManageLeave() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToday() {
		return today;
	}

	public void setToday(String today) {
		this.today = today;
	}

	public String getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(String noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	@Override
	public String toString() {
		return "ManageLeave [id=" + id + ", name=" + name + ", fromDate=" + fromDate + ", today=" + today
				+ ", noOfDays=" + noOfDays + ", leaveType=" + leaveType + "]";
	}

}