package com.lab_java_intro_to_spring_boot.controller;

import com.lab_java_intro_to_spring_boot.model.Employee;
import com.lab_java_intro_to_spring_boot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee>getById(@PathVariable String id){
        Optional<Employee> employee=employeeService.getById(id);
        return employee.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());
    }

}
