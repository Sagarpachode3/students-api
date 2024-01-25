package com.students.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.students.api.entity.Student;
import com.students.api.service.IStudentServices;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	@Autowired
	private IStudentServices studentsServices;
	
	//create student
	
	@PostMapping("/")
	public ResponseEntity<Student> createStudent(@RequestBody Student student){
		Student createdStudent = this.studentsServices.createStudent(student);
		return new ResponseEntity<Student>(createdStudent, HttpStatus.CREATED);
	}
	
	//update Student
	@PutMapping("/{studentId}")
	public ResponseEntity<Student> updateStudent( @PathVariable Long studentId, @RequestBody Student student){
		Student updateStudent = this.studentsServices.updateStudent(studentId, student);
		return ResponseEntity.ok(updateStudent);
	}
	//delete Student
	@DeleteMapping("/{studentId}")
	public ResponseEntity<String> deleteStudent(@PathVariable Long studentId) {
		//Student studentToBeDeleted = this.studentsServices.getStudentById(studentId);
		String deleteStudentMessage = this.studentsServices.deleteStudent(studentId);
		return ResponseEntity.ok(deleteStudentMessage);
	}
	
	//getSingleStudent
	@GetMapping("/{studentId}")
	public ResponseEntity<Student> getSingleStudent(@PathVariable Long studentId){
		Student studentById = this.studentsServices.getStudentById(studentId);
		return ResponseEntity.ok(studentById);
		
	}
	
	//get All Students List
	@GetMapping("/")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> allStudentsList = this.studentsServices.getAllStudentsList();
		return ResponseEntity.ok(allStudentsList);
		
	}
	
	
	
	
}
