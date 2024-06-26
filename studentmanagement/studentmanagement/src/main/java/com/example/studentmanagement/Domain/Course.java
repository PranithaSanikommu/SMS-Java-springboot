package com.example.studentmanagement.Domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="course")
public class Course 
{
	@Id
	//@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String studentname;
	private String coursename;
	private int fee;
	public Course() {
	}
	public Course(Long id, String studentname, String coursename, int fee) {
		this.id = id;
		this.studentname = studentname;
		this.coursename = coursename;
		this.fee = fee;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
}

	