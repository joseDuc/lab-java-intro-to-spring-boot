package com.lab_java_intro_to_spring_boot.model;

import com.lab_java_intro_to_spring_boot.Enums.Department;
import com.lab_java_intro_to_spring_boot.Enums.EmployeeStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Data
@Entity
public class Employee {
    @Id
    String id;
    @Enumerated(EnumType.STRING)
    Department department;
    String name;
    @Enumerated(EnumType.STRING)
    EmployeeStatus status;

}
