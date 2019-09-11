package com.ojas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.model.ApplyLeave;
@Repository
public interface ApplyLeaveRepository extends JpaRepository<ApplyLeave, Long> {

}
