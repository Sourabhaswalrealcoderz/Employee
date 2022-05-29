package com.realcoderz.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.realcoderz.Employee.Model.Employee;
import com.realcoderz.Employee.ServiceImpl.EmployeeServiceImp;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	
	@Autowired
	public EmployeeServiceImp empsvcimpl;
	
	
	@GetMapping("/getEmp")
	public List<Employee> showEmployee() {
		return empsvcimpl.showEmployee();
		
	}

	
	
	
	
}
