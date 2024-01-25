package com.students.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.students.api.entity.Student;

public interface IStudentsRepo extends JpaRepository<Student, Long>{

}
