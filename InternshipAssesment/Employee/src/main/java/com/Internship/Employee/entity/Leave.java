package com.Internship.Employee.entity;

import java.util.Date;

//import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Leave {
	
	private Long leaveRequestId;

    private Long employeeId;
    private String leaveType;
    private Date startDate;
    private Date endDate;
    private String reason;
   
}
