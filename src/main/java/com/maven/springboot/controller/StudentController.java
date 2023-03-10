package com.maven.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maven.springboot.entity.Student;
import com.maven.springboot.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService serviceStudent;

	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return serviceStudent.saveStudent(student);

	}

	@PostMapping("/addStudents")
	public List<Student> addStudents(@RequestBody List<Student> students) {
		return serviceStudent.saveStudents(students);
	}

	@GetMapping("/students")
	public List<Student> findAllStudents() {
		return serviceStudent.getStudents();
	}

	@GetMapping("/student/(student_id")
	public Student findStudentById(@PathVariable int student_id) {
		return serviceStudent.getStudentById(student_id);
	}

	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return serviceStudent.updateStudent(student);
	}

	@DeleteMapping("/delete/(student_id)")
	public String deleteStudent(@PathVariable("delete")int student_id) {
		return serviceStudent.deleteStudent(student_id);
	}

}
