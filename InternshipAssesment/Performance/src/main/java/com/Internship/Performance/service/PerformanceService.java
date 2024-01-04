package com.Internship.Performance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Internship.Performance.entity.Performance;
import com.Internship.Performance.repository.PerformanceRepo;

@Service
public class PerformanceService {

	@Autowired
	private PerformanceRepo performanceRepository;

	public Performance createPerformance(Performance performance) {
		return performanceRepository.save(performance);
	}

	public Performance getPerformanceById(Long id) {
		return performanceRepository.findById(id).get();
	}

	public List<Performance> getAllPerformances() {
		return performanceRepository.findAll();
	}

	public Performance updatePerformance(Long id, Performance updatedPerformance) {
		Performance existingPerformance = performanceRepository.findById(id).get();

		existingPerformance.setEmployeeId(updatedPerformance.getEmployeeId());
		existingPerformance.setGoalsAndObjectives(updatedPerformance.getGoalsAndObjectives());
		existingPerformance.setMetricsAndTargets(updatedPerformance.getMetricsAndTargets());
		existingPerformance.setEvaluationScores(updatedPerformance.getEvaluationScores());
		existingPerformance.setOverallPerformanceRating(updatedPerformance.getOverallPerformanceRating());
		existingPerformance.setFeedbackAndComments(updatedPerformance.getFeedbackAndComments());

		return performanceRepository.save(existingPerformance);
	}

	public String deletePerformance(Long performanceId) {
		performanceRepository.deleteById(performanceId);
		return "Delete Successfull";
	}

}
