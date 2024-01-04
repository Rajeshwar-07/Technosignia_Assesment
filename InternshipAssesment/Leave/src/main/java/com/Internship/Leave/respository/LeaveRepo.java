package com.Internship.Leave.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Internship.Leave.entity.Leave;

public interface LeaveRepo extends JpaRepository<Leave, Long> {

}
