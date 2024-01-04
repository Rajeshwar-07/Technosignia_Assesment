package com.Internship.Performance.entity;

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
public class Performance {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long performanceId;

    private Long employeeId;
    private String goalsAndObjectives;
    private String metricsAndTargets;
    private double evaluationScores;
    private String overallPerformanceRating;
    private String feedbackAndComments;
}
