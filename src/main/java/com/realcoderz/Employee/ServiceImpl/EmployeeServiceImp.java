package com.realcoderz.Employee.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realcoderz.Employee.Model.Employee;
import com.realcoderz.Employee.Repository.EmployeeRepo;
import com.realcoderz.Employee.Service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeRepo emprepo;
	

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(Long id, Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> showEmployee() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

}
