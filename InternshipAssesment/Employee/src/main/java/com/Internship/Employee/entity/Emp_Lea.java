package com.Internship.Employee.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emp_Lea {

	private Employee employee;
	
	private List<Leave> leave;
	
}
