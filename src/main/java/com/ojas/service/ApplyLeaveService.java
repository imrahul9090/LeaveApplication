package com.ojas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.model.ApplyLeave;
import com.ojas.repository.ApplyLeaveRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ApplyLeaveService<EmployeeEntity> {

	@Autowired
	private ApplyLeaveRepository repo2;

	public ApplyLeave save(ApplyLeave e) {
		return repo2.save(e);
	}

	public Optional<ApplyLeave> getById(Long id) {
		return repo2.findById(id);
	}

	public ApplyLeave update(ApplyLeave applyLeave) {
		return repo2.save(applyLeave);
	}

	public void deleteById(Long id) {
		repo2.deleteById(id);
	}

	public List<ApplyLeave> getAll() {
		return repo2.findAll();
	}
}
