package com.realcoderz.Employee.Service;

import java.util.List;

import com.realcoderz.Employee.Model.Employee;

public interface EmployeeService {
	
	
	public List<Employee> showEmployee();
	public void addEmployee(Employee e);
	public void deleteEmployee(Long id);
	public void updateEmployee(Long id,Employee e);
}
