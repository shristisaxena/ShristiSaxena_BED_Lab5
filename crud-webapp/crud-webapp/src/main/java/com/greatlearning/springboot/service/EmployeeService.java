package com.greatlearning.springboot.service;

import java.util.List;

import com.greatlearning.springboot.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	public Employee getEmployeeById(long id);
	
	void deleteEmployeeById(long id);

}	
