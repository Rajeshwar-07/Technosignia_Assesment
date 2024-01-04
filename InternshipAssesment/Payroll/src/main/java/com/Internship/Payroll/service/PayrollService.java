package com.Internship.Payroll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Internship.Payroll.entity.Payroll;
import com.Internship.Payroll.repository.PayrollRepo;

@Service
public class PayrollService {

	@Autowired
	private PayrollRepo payrollRepo;

	public Payroll createPayroll(Payroll payroll) {
		double netSalary = calculateNetSalary(payroll.getBasicSalary(), payroll.getAllowances(),
				payroll.getDeductions());
		payroll.setNetSalary(netSalary);

		return payrollRepo.save(payroll);
	}

	public List<Payroll> getAllPayrolls() {
		return payrollRepo.findAll();
	}

	public Payroll getPayrollById(Long id) {
		return payrollRepo.findById(id).get();
	}

	public Payroll updatePayroll(Long id, Payroll updatedPayroll) {
		Payroll existingPayroll = payrollRepo.findById(id).get();
		existingPayroll.setEmployeeId(updatedPayroll.getEmployeeId());
		existingPayroll.setBasicSalary(updatedPayroll.getBasicSalary());
		existingPayroll.setAllowances(updatedPayroll.getAllowances());
		existingPayroll.setDeductions(updatedPayroll.getDeductions());
		existingPayroll.setNetSalary(calculateNetSalary(updatedPayroll.getBasicSalary(), updatedPayroll.getAllowances(),
				updatedPayroll.getDeductions()));
		existingPayroll.setPayrollPeriod(updatedPayroll.getPayrollPeriod());
		existingPayroll.setPaymentMethod(updatedPayroll.getPaymentMethod());

		return payrollRepo.save(existingPayroll);
	}

	public String deletePayroll(Long id) {
		payrollRepo.deleteById(id);
		return "Delete Successful";
	}

	private double calculateNetSalary(double basicSalary, double allowances, double deductions) {
		return basicSalary + allowances - deductions;
	}
}
