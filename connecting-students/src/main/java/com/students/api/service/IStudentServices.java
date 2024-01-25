package com.students.api.service;
import java.util.List;
import com.students.api.entity.Student;

public interface IStudentServices {

	// create student

	public Student createStudent(Student student);

	// update student

	public Student updateStudent(Long studentId, Student updatedStudent);

	// delete student

	public String deleteStudent(Long studentId);

	// get student by id

	public Student getStudentById(Long studentId);

	// get all students

	public List<Student> getAllStudentsList();

}
