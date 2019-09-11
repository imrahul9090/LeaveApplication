package com.ojas.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "apply_leave")
public class ApplyLeave {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "fromDate")
	private String FromDate;

	@Column(name = "toDate")
	private String ToDate;

	@Column(name = "Reason")
	private String reason;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "leave_id")
	private List<LeaveType> leave;

	public ApplyLeave() {
		super();
	}

	public ApplyLeave(Long id, String fromDate, String toDate, String reason, List<LeaveType> leave) {
		super();
		this.id = id;
		FromDate = fromDate;
		ToDate = toDate;
		this.reason = reason;
		this.leave = leave;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFromDate() {
		return FromDate;
	}

	public void setFromDate(String fromDate) {
		FromDate = fromDate;
	}

	public String getToDate() {
		return ToDate;
	}

	public void setToDate(String toDate) {
		ToDate = toDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public List<LeaveType> getLeave() {
		return leave;
	}

	public void setLeave(List<LeaveType> leave) {
		this.leave = leave;
	}

	@Override
	public String toString() {
		return "ApplyLeave [id=" + id + ", FromDate=" + FromDate + ", ToDate=" + ToDate + ", reason=" + reason
				+ ", leave=" + leave + "]";
	}
}