package com.demo.FirstBootProject.service;

import java.util.List;
import java.util.Optional;

import com.demo.FirstBootProject.model.Employee;

public interface EmployeeService {

	public Employee save(Employee e);

	public Employee update(Employee e);

	public Optional<Employee> findById(Integer id);

	public Employee findByName(String name);

	public List<Employee> findAll();

	public void deleteById(Integer id);

}
