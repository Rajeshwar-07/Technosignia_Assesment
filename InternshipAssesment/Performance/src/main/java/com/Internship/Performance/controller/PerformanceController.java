package com.Internship.Performance.controller;

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

import com.Internship.Performance.entity.Performance;
import com.Internship.Performance.service.PerformanceService;

@RestController
@RequestMapping("/performance")
public class PerformanceController {

	@Autowired
	private PerformanceService performanceService;

	@GetMapping
	public List<Performance> getAllPerformances() {
		return performanceService.getAllPerformances();
	}

	@GetMapping("/findById/{id}")
	public Performance getPerformanceById(@PathVariable Long id) {
		return performanceService.getPerformanceById(id);
	}

	@PostMapping("/save")
	public Performance createPerformance(@RequestBody Performance performance) {
		return performanceService.createPerformance(performance);
	}

	@PutMapping("/update/{id}")
	public Performance updatePerformance(@PathVariable Long id, @RequestBody Performance updatedPerformance) {
		return performanceService.updatePerformance(id, updatedPerformance);
	}

	@DeleteMapping("/delete/{id}")
	public String deletePerformance(@PathVariable Long id) {
		performanceService.deletePerformance(id);
		return "Delete Successfull";
	}

}
