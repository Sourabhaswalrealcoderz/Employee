package com.realcoderz.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.realcoderz.Employee.Model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
