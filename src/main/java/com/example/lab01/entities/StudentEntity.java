package com.example.lab01.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class StudentEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    
    @ManyToMany
    @JoinTable(
        name = "student_course",// tabla intermedia
        joinColumns = @JoinColumn(name = "student_id"),// columna de la tabla intermedia
        inverseJoinColumns = @JoinColumn(name = "course_id")// columna de la tabla intermedia
    )
    private List<CourseEntity> courses;
    
}
