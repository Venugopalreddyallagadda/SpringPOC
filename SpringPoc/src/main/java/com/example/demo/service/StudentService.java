package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;



@Service
public class StudentService {
	
	@Autowired
	public StudentDao studentdao;

	public Student createName(Student name) {
		return studentdao.save(name);
	}
	
	public Iterable<Student> getAllStudents() {
		return studentdao.findAll();
	}
	public Optional<Student> getStudent(Integer studentId) {

		return studentdao.findById(studentId);
	}
	public String deleteStudent(int studentId) {
		
	 studentdao.deleteById(studentId);
	return "deleted" +studentId;
	
	}
	
	public Iterable<Student> pagination() {
		return studentdao.findAll(PageRequest.of(4, 2));
	}
	

	
}
