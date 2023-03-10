package com.maven.springboot.entity;


import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue
	@Column(name="student_id")
	private int student_id;
	@Column(name="student_name")
	private String student_Name;
	@Column(name="student_address")
	private String student_address;
	@Column(name="student_mail")
	private String student_email;
	@Column(name="student_mobile_no")
	private BigInteger student_mobile_no;
  
}
