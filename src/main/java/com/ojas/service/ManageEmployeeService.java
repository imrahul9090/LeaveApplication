package com.ojas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.model.LeaveType;
import com.ojas.model.ManageEmployee;
import com.ojas.repository.ManageEmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ManageEmployeeService {

	@Autowired
	private ManageEmployeeRepository repo;

	public ManageEmployee save(ManageEmployee e) {
		return repo.save(e);
	}

	public Optional<ManageEmployee> getById(Long id) {
		return repo.findById(id);
	}

	public ManageEmployee update(ManageEmployee manageEmployee) {
		return repo.save(manageEmployee);
	}

	public void deleteById(Long id) {
		repo.deleteById(id);
	}

	public List<ManageEmployee> getAll() {
		return repo.findAll();
	}
}