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

import com.ojas.model.ApplyLeave;
import com.ojas.service.ApplyLeaveService;

@RestController
@RequestMapping("/applyleave")
public class ApplyLeaveController {

	@Autowired
	private ApplyLeaveService<?> ser;

	@PostMapping("/save")
	public ResponseEntity<Object> save(@RequestBody ApplyLeave emp3) {
		ApplyLeave save = ser.save(emp3);
		return new ResponseEntity<Object>(save, HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Object> getById(@PathVariable Long id) {
		Optional<ApplyLeave> emp3 = ser.getById(id);
		if (!emp3.isPresent())
			return new ResponseEntity<Object>("Record not Found", HttpStatus.UNPROCESSABLE_ENTITY);
		else
			return new ResponseEntity<Object>(emp3, HttpStatus.OK);
	}

	@PutMapping("/edit/{id}")
	public ResponseEntity<Object> update(@RequestBody ApplyLeave applyLeave, @PathVariable Long id) {
		ApplyLeave emp3 = ser.update(applyLeave);
		if (null == emp3)
			return new ResponseEntity<Object>("Not Found", HttpStatus.UNPROCESSABLE_ENTITY);
		else
			return new ResponseEntity<Object>(emp3, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> delete(@PathVariable Long id) {
		if (id == null)
			return new ResponseEntity<Object>("Record not Found", HttpStatus.NOT_FOUND);
		ser.deleteById(id);
		return new ResponseEntity<Object>("Record is Deleted", HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity<Object> getAll() {
		List<ApplyLeave> all = ser.getAll();
		if (all == null)
			return new ResponseEntity<Object>(HttpStatus.UNPROCESSABLE_ENTITY);
		else
			return new ResponseEntity<Object>(all, HttpStatus.OK);

	}

}
