package com.ojas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Leave_Type")
public class LeaveType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String leaveReason1;

	private String leaveReason2;

	private String leaveReason3;

	private String leaveReason4;

	public LeaveType() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLeaveReason1() {
		return leaveReason1;
	}

	public void setLeaveReason1(String leaveReason1) {
		this.leaveReason1 = leaveReason1;
	}

	public String getLeaveReason2() {
		return leaveReason2;
	}

	public void setLeaveReason2(String leaveReason2) {
		this.leaveReason2 = leaveReason2;
	}

	public String getLeaveReason3() {
		return leaveReason3;
	}

	public void setLeaveReason3(String leaveReason3) {
		this.leaveReason3 = leaveReason3;
	}

	public String getLeaveReason4() {
		return leaveReason4;
	}

	public void setLeaveReason4(String leaveReason4) {
		this.leaveReason4 = leaveReason4;
	}

	@Override
	public String toString() {
		return "LeaveType [id=" + id + ", leaveReason1=" + leaveReason1 + ", leaveReason2=" + leaveReason2
				+ ", leaveReason3=" + leaveReason3 + ", leaveReason4=" + leaveReason4 + "]";
	}

}