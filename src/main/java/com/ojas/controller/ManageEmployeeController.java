package com.ojas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.model.LeaveType;
import com.ojas.model.ManageEmployee;
import com.ojas.service.ManageEmployeeService;

@RestController
@RequestMapping("/emp")
public class ManageEmployeeController {

	@Autowired
	private ManageEmployeeService service;

	@PostMapping("/save")
	public ResponseEntity<Object> save(@RequestBody ManageEmployee emp) {
		ManageEmployee save = service.save(emp);
		return new ResponseEntity<Object>(save, HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Object> getbyId(@PathVariable Long id) {
		Optional<ManageEmployee> emp = service.getById(id);
		if (!emp.isPresent())
			return new ResponseEntity<Object>("there is no record of this id", HttpStatus.UNPROCESSABLE_ENTITY);
		else
			return new ResponseEntity<Object>(emp, HttpStatus.OK);
	}

	@PutMapping("/edit/{id}")
	public ResponseEntity<Object> update(@RequestBody ManageEmployee manageEmployee, @PathVariable Long id) {
		ManageEmployee mp3 = service.update(manageEmployee);
		if (null == mp3)
			return new ResponseEntity<Object>("Not Found", HttpStatus.UNPROCESSABLE_ENTITY);
		else
			return new ResponseEntity<Object>(mp3, HttpStatus.OK);
	}

	@DeleteMapping("/del/{id}")
	public ResponseEntity<Object> delete(@PathVariable Long id) {
		if (id == null)
			return new ResponseEntity<Object>("there is no record from that id", HttpStatus.UNPROCESSABLE_ENTITY);
		service.deleteById(id);
		return new ResponseEntity<Object>("record is deleted", HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity<Object> getAll() {
		List<ManageEmployee> all = service.getAll();
		if (all == null)
			return new ResponseEntity<Object>(HttpStatus.UNPROCESSABLE_ENTITY);
		else
			return new ResponseEntity<Object>(all, HttpStatus.OK);
	}

}
