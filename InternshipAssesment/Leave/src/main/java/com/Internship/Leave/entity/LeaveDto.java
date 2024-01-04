package com.Internship.Leave.entity;

import java.util.Date;

import lombok.Data;


@Data
public class LeaveDto {
	
	
	private Long leaveRequestId;

    private Long employeeId;
    private String leaveType;
    private Date startDate;
    private Date endDate;
    private String reason;
}
