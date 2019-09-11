package com.ojas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.model.ManageEmployee;

@Repository
public interface ManageEmployeeRepository extends JpaRepository<ManageEmployee, Long> {

}
