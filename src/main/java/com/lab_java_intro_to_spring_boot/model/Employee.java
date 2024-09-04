package com.lab_java_intro_to_spring_boot.model;

import com.lab_java_intro_to_spring_boot.model.Enums.Department;
import com.lab_java_intro_to_spring_boot.model.Enums.EmployeeStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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
