package com.ojas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.model.ManageEmployee;
import com.ojas.model.ManageLeave;
import com.ojas.repository.ManageLeaveRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ManageLeaveService {

	@Autowired
	private ManageLeaveRepository repo1;

	public ManageLeave save(ManageLeave e) {
		return repo1.save(e);
	}

	public Optional<ManageLeave> getById(Long id) {
		return repo1.findById(id);
	}

	public ManageLeave update(ManageLeave manageLeave) {
		return repo1.save(manageLeave);
	}

	public void deleteById(Long id) {
		repo1.deleteById(id);
	}

	public List<ManageLeave> getAll() {
		return repo1.findAll();
	}
}