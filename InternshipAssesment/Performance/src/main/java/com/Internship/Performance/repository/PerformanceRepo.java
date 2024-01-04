package com.Internship.Performance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Internship.Performance.entity.Performance;

public interface PerformanceRepo extends JpaRepository<Performance, Long>{

}
