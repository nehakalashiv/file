package com.emp.EmployeeManagementSystem.service;

import java.util.List;

import com.emp.EmployeeManagementSystem.model.Employee;

public interface IEmployeeService {
	public List<Employee> getAllEmployee();
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee,int employeeId);
	public void deleteEmployee(int employeeId);

}
