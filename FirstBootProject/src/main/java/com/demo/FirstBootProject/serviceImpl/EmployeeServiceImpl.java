package com.demo.FirstBootProject.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.FirstBootProject.model.Employee;
import com.demo.FirstBootProject.repository.EmployeeRepository;
import com.demo.FirstBootProject.repository.EmployeeRepository1;
import com.demo.FirstBootProject.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository empRepository;
	
	@Override
	public Employee save(Employee e) {

		return empRepository.save(e);
	}

	@Override
	public Employee update(Employee e) {
		Employee e1 = empRepository.findById(e.getId()).orElse(null);
		e1.setEmail(e.getEmail());
		e1.setMobileNo(e.getMobileNo());
		e1.setName(e.getName());
		e1.setSalary(e.getSalary());

		return empRepository.save(e1);
	}

	@Override
	public Optional<Employee> findById(Integer id) {

		return empRepository.findById(id);
	}

	@Override
	public List<Employee> findAll() {

		return empRepository.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		empRepository.deleteById(id);

	}

	@Override
	public Employee findByName(String name) {
		
		return empRepository.findByName(name);
	}

}
