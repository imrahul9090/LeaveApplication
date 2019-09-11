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

import com.ojas.model.ManageEmployee;
import com.ojas.model.ManageLeave;
import com.ojas.service.ManageLeaveService;

@RestController
@RequestMapping("/leave")
public class ManageLeaveController {

	@Autowired
	private ManageLeaveService serv;

	@PostMapping("/save")
	public ResponseEntity<Object> save(@RequestBody ManageLeave emp2) {
		ManageLeave save = serv.save(emp2);
		return new ResponseEntity<Object>(save, HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Object> getById(@PathVariable Long id) {
		Optional<ManageLeave> emp2 = serv.getById(id);
		if (!emp2.isPresent())
			return new ResponseEntity<Object>("There is no record exist for this Id", HttpStatus.UNPROCESSABLE_ENTITY);
		else
			return new ResponseEntity<Object>(emp2, HttpStatus.OK);
	}

	@PutMapping("/edit/{id}")
	public ResponseEntity<Object> update(@RequestBody ManageLeave manageLeave, @PathVariable Long id) {
		ManageLeave mp3 = serv.update(manageLeave);
		if (null == mp3)
			return new ResponseEntity<Object>("Not Found", HttpStatus.UNPROCESSABLE_ENTITY);
		else
			return new ResponseEntity<Object>(mp3, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> delete(@PathVariable Long id) {
		if (id == null)
			return new ResponseEntity<Object>("No record found", HttpStatus.UNPROCESSABLE_ENTITY);
		serv.deleteById(id);
		return new ResponseEntity<Object>("Record is deleted", HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity<Object> getAll() {
		List<ManageLeave> all = serv.getAll();
		if (all == null)
			return new ResponseEntity<Object>(HttpStatus.UNPROCESSABLE_ENTITY);
		else
			return new ResponseEntity<Object>(all, HttpStatus.OK);

	}

}
