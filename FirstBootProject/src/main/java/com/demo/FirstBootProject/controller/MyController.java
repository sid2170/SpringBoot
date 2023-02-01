package com.demo.FirstBootProject.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.FirstBootProject.dto.EmployeeRequest;
import com.demo.FirstBootProject.model.Employee;
import com.demo.FirstBootProject.service.EmployeeService;

//@Controller
@RestController
@RequestMapping("/employee")
public class MyController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = { "/register/save" }, method = RequestMethod.GET)
	public String test5() {
		return "Hello Spring boot with request Mapping";
	}

	@PostMapping("/save")
	public Employee test1(@RequestBody Employee emp) {
		System.out.println("Id=" + emp.getId() + " Email=" + emp.getEmail());
		employeeService.save(emp);
		return emp;
	}

	@PutMapping("/update")
	public Employee updateData(@RequestBody Employee emp) {

		return employeeService.update(emp);
	}

	@GetMapping("/find/{id}")
	public Optional<Employee> findById(@PathVariable Integer id) {
		return employeeService.findById(id);
	}

	@GetMapping("/findByName/{name}")
	public Employee findByName(@PathVariable String name) {
		return employeeService.findByName(name);
	}

	@GetMapping("/findAll")
	public List<Employee> findAll() {
		return employeeService.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable Integer id) {
		employeeService.deleteById(id);
		return "deleted=" + id + " successfully";
	}
	
	@PostMapping("/save/valid")
	public EmployeeRequest saveValidation(@RequestBody @Valid EmployeeRequest emp) {
		
		//employeeService.save(emp);
		return emp;
	}

}
