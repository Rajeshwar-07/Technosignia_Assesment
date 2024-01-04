package com.Internship.Leave.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Internship.Leave.entity.Leave;
import com.Internship.Leave.entity.LeaveDto;
import com.Internship.Leave.respository.LeaveRepo;

@Service
public class LeaveService {

	@Autowired
	LeaveRepo leaveRepo;
	
	public Leave saveLeave(Leave leave) {
		return leaveRepo.save(leave);
	}
	
	
	public Leave getLeaveById(Long id) {
		return leaveRepo.findById(id).get();
	}
	
	public List<Leave> getAllLeave(){
		return leaveRepo.findAll(); 
	}
	
	
	public Leave updateLeavee(Leave updateLeave ,Long id) {
		Leave le = new Leave();
		
		le.setLeaveRequestId(updateLeave.getLeaveRequestId());
		le.setEmployeeId(updateLeave.getEmployeeId());
		le.setLeaveType(updateLeave.getLeaveType());
		le.setStartDate(updateLeave.getStartDate());
		le.setEndDate(updateLeave.getEndDate());
		le.setReason(updateLeave.getReason());
		
		return leaveRepo.save(le);
	}
	
	
	
	public String deleteLeave(Long id) {
		leaveRepo.deleteById(id);
		return "Delete Successfull";
	}
		
	
	
	public List<LeaveDto> getAllLeaveDto(Long id){
		List<LeaveDto> dtolist = new ArrayList<>();
		List<Leave> allLeave = leaveRepo.findAll();
		for(Leave leave : allLeave) {
			if(leave.getEmployeeId().equals(id)) {
				LeaveDto leaveDto = new LeaveDto();
				leaveDto.setEmployeeId(leave.getEmployeeId());
	            leaveDto.setLeaveRequestId(leave.getLeaveRequestId());
	            leaveDto.setLeaveType(leave.getLeaveType());
	            leaveDto.setReason(leave.getReason());
	            leaveDto.setStartDate(leave.getStartDate());
	            leaveDto.setEndDate(leave.getEndDate());
	            dtolist.add(leaveDto);
			}
		}	
		return dtolist;
	}
}
