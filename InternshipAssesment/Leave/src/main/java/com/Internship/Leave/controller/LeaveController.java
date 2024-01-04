package com.Internship.Leave.controller;

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

import com.Internship.Leave.entity.Leave;
import com.Internship.Leave.entity.LeaveDto;
import com.Internship.Leave.service.LeaveService;


@RestController
@RequestMapping("/leaveModule")
public class LeaveController {

	
	@Autowired
	LeaveService leaveService;
	
	
	
	@PostMapping("/save")
	public Leave saveLeave(@RequestBody Leave leave) {
		return leaveService.saveLeave(leave);
	}
	
	
	@GetMapping("/findById/{id}")
	public Leave getLeaveById(@PathVariable Long id) {
		return leaveService.getLeaveById(id);
	}
	
	@GetMapping("/findAll")
	public List<Leave> getAllLeave(){
		return leaveService.getAllLeave();
	}
	
	@PutMapping("/update/{id}")
	public Leave updateLeave(@RequestBody Leave leave,@PathVariable Long id) {
		return leaveService.updateLeavee(leave, id);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteLeave(@PathVariable Long id) {
		leaveService.deleteLeave(id);
		return "Delete Successful";
	}
	
		
	@GetMapping("/getAllLeaveDto/{id}")
	public List<LeaveDto> getAllLeaveDto(@PathVariable Long id) {
		return leaveService.getAllLeaveDto(id);
	}
	
	
}
