package com.lab_java_intro_to_spring_boot.service;

import com.lab_java_intro_to_spring_boot.model.Employee;
import com.lab_java_intro_to_spring_boot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAll(){return employeeRepository.findAll();}

    public Optional<Employee> getById(String id){
        return employeeRepository.findById(id);
    }
}
