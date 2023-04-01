package com.emp.EmployeeManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.EmployeeManagementSystem.model.Employee;
import com.emp.EmployeeManagementSystem.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepo.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		
		return employeeRepo.save(employee);
	}

	@Override
	public Employee updateEmployee( Employee employee,int employeeId) {
		
		return employeeRepo.save(employee);
	}

	@Override
	public void deleteEmployee(int employeeId) {
		employeeRepo.deleteById(employeeId);
		
	}

}
