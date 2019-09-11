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
import com.ojas.service.LeaveTypeService;

@RestController
@RequestMapping("/LeaveType")
public class LeaveTypeController {

	@Autowired
	private LeaveTypeService lts;

	@PostMapping("/save")
	public ResponseEntity<Object> save(@RequestBody LeaveType lt) {
		LeaveType save = lts.save(lt);
		return new ResponseEntity<Object>(save, HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Object> getById(@PathVariable Long id) {
		Optional<LeaveType> lt = lts.getById(id);
		if (!lt.isPresent())
			return new ResponseEntity<Object>("Record not found", HttpStatus.UNPROCESSABLE_ENTITY);
		else
			return new ResponseEntity<Object>(lt, HttpStatus.OK);
	}

	@PutMapping("/edit/{id}")
	public ResponseEntity<Object> update(@RequestBody LeaveType leaveType, @PathVariable Long id) {
		LeaveType emp4 = lts.update(leaveType);
		if (null == emp4)
			return new ResponseEntity<Object>("Not Found", HttpStatus.UNPROCESSABLE_ENTITY);
		else
			return new ResponseEntity<Object>(emp4, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> delete(@PathVariable Long id) {
		if (id == null)
			return new ResponseEntity<Object>("Record not found ", HttpStatus.UNPROCESSABLE_ENTITY);
		lts.deleteById(id);
		return new ResponseEntity<Object>("Record is deleted", HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity<Object> getAll() {
		List<LeaveType> all = lts.getAll();
		if (all == null)
			return new ResponseEntity<Object>(HttpStatus.UNPROCESSABLE_ENTITY);
		else
			return new ResponseEntity<Object>(all, HttpStatus.OK);
	}
}
