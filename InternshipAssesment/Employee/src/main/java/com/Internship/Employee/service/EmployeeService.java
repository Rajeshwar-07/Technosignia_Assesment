package com.Internship.Employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Internship.Employee.entity.Employee;
import com.Internship.Employee.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;
	
	
	@Autowired
	RestTemplate restTemplate;
	
	
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	
	public Employee getEmployeeById(Long id) {
		return employeeRepo.findById(id).get();
	}
	
	
	public List<Employee> getAllEmployee(){
		return employeeRepo.findAll();
	}
	
	
	
	public String deleteEmployee(Long id) {
		employeeRepo.deleteById(id);
		return "Delete Successfull";
	}
			
	
	public Employee updateEmployee(Employee empNew,Long id) {
		Employee emp = new Employee();
		emp.setEmployeeId(empNew.getEmployeeId());
		emp.setEmployeeName(empNew.getEmployeeName());
		emp.setDepartment(empNew.getDepartment());
		emp.setJobTitle(empNew.getJobTitle());
		emp.setMobile(empNew.getMobile());
		emp.setEmail(empNew.getEmail());
		emp.setDob(empNew.getDob());
		emp.setGender(empNew.getGender());
		emp.setAddress(empNew.getAddress());
		
		return employeeRepo.save(emp);
	}
	
	
}
