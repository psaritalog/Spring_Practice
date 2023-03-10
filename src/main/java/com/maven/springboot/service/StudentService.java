package com.maven.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.springboot.entity.Student;
import com.maven.springboot.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;

	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	public List<Student> saveStudents(List<Student> students) {

		return studentRepo.saveAll(students);
	}

	public List<Student> getStudents() {
		return studentRepo.findAll();
	}

	public Student getStudentById(int student_id) {

		return studentRepo.findById(student_id).orElse(null);
	}

	public Student updateStudent(Student student) {
		Student existingStudent = studentRepo.findById(student.getStudent_id()).orElse(null);
		existingStudent.setStudent_Name(student.getStudent_Name());
		existingStudent.setStudent_address(student.getStudent_address());
		existingStudent.setStudent_email(student.getStudent_email());
		return studentRepo.save(existingStudent);
	}

	public String deleteStudent(int student_id) {
		studentRepo.deleteById(student_id);
		return "student is removed !! " + student_id;
	}

}
