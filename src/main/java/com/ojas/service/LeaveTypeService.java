package com.ojas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.model.ApplyLeave;
import com.ojas.model.LeaveType;
import com.ojas.repository.LeaveTypeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LeaveTypeService {

	@Autowired
	private LeaveTypeRepository repo4;

	public LeaveType save(LeaveType lt) {
		return repo4.save(lt);
	}

	public Optional<LeaveType> getById(Long id) {
		return repo4.findById(id);
	}

	public LeaveType update(LeaveType leaveType) {
		return repo4.save(leaveType);
	}

	public void deleteById(Long id) {
		repo4.deleteById(id);
	}

	public List<LeaveType> getAll() {
		return repo4.findAll();
	}
}
