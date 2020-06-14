package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.dto.Employee;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@PostMapping("/employee/post")
	public ResponseEntity<Object> createEmployee(@RequestBody Employee emp) {
		EmployeeEntity empSaved = empService.save(emp);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().buildAndExpand(empSaved.getEmployeeId()).toUri();
		return ResponseEntity.created(location).build();

	}
	
	@GetMapping("/employee/all")
	public ResponseEntity<Object> retrieveStudent() {
		return null;
		//return new ResponseEntity<List<EmployeeEntity>>(l,HttpStatus.OK);
	}

}
