package com.Internship.Payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Internship.Payroll.entity.Payroll;

@Repository
public interface PayrollRepo extends JpaRepository<Payroll, Long>{

}
