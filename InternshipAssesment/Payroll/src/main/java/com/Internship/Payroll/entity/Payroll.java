package com.Internship.Payroll.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Payroll {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long payrollId;

    private Long employeeId;
    private double basicSalary;
    private double allowances;
    private double deductions;
    private double netSalary;
    private String payrollPeriod;
    private String paymentMethod;
}
