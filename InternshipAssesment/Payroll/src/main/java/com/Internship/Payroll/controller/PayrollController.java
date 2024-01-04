package com.Internship.Payroll.controller;

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

import com.Internship.Payroll.entity.Payroll;
import com.Internship.Payroll.service.PayrollService;

@RestController
@RequestMapping("/payroll")
public class PayrollController {

	@Autowired
	private PayrollService payrollService;

	@PostMapping("/save")
	public Payroll createPayroll(@RequestBody Payroll payroll) {
		return payrollService.createPayroll(payroll);
	}

	@GetMapping("/findById/{id}")
	public Payroll getPayrollById(@PathVariable Long id) {
		return payrollService.getPayrollById(id);
	}

	@GetMapping("/findAll")
	public List<Payroll> getAllPayrolls() {
		return payrollService.getAllPayrolls();
	}

	@PutMapping("/update/{id}")
	public Payroll updatePayroll(@PathVariable Long id, @RequestBody Payroll updatedPayroll) {
		return payrollService.updatePayroll(id, updatedPayroll);
	}

	@DeleteMapping("/delete/{id}")
	public String deletePayroll(@PathVariable Long id) {
		payrollService.deletePayroll(id);
		return "Delete Successfull";
	}

}
