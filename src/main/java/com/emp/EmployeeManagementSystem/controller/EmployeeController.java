package com.emp.EmployeeManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.EmployeeManagementSystem.model.Employee;
import com.emp.EmployeeManagementSystem.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	@PutMapping("/addEmployee/{employeeId}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable ("employeeId") int employeeId) {
		return employeeService.updateEmployee(employee, employeeId);
		
	}
	@DeleteMapping("/addEmployee/{employeeId}")
	public String deleteEmployee(@PathVariable ("employeeId") int employeeId) {
		employeeService.deleteEmployee(employeeId);
		return "Deleted";
	}

}
