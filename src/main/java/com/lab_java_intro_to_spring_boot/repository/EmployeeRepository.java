package com.lab_java_intro_to_spring_boot.repository;

import com.lab_java_intro_to_spring_boot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface EmployeeRepository extends JpaRepository<Employee, String> {

}
