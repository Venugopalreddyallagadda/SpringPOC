package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api/std")
public class StudentController {

	@Autowired
	private StudentService service;
	

	@GetMapping("/getAllStudents")
	public Iterable<Student> getAllStudents() {
		return service.getAllStudents();
	}

	// creating Student
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		return service.createName(student);
	}
	// Get at Student
		@GetMapping("/student/{StudentId}")
		public Optional<Student>displayStudent(@PathVariable int StudentId) {
			return service.getStudent(StudentId);
		}

		@DeleteMapping("/studentDelete/{StudentId}")
		public String deleteStudent(@PathVariable int StudentId) {
			return service.deleteStudent(StudentId);
		}
		
		@GetMapping("/studentsPage") 
		public Iterable<Student> getStudents(){
			return service.pagination();
		}
		

}