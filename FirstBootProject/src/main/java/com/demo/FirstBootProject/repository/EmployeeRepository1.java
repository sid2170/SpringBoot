package com.demo.FirstBootProject.repository;

import com.demo.FirstBootProject.model.Employee;

public interface EmployeeRepository1 {
	Employee findByName(String name);
}
