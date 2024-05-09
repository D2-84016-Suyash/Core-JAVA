package com.sunbeam;

import java.util.Comparator;
import java.util.Scanner;

public class students implements Comparable<students> {
	int rollno;
	String name;
	int marks;
	String course;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public students() {
		super();
	}

	@Override
	public String toString() {
		return "students [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}

	@Override
	public int compareTo(students o) {
		
		return this.rollno-o.rollno;
	}

	public students(int rollno, String name, int marks, String course) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}

	students accpet (Scanner sc) {
		System.out.println("enter name of students");
		name=sc.next();
		System.out.println("enter rollno of students");
		rollno=sc.nextInt();
		System.out.println("enter marks of students");
		marks=sc.nextInt();
		System.out.println("enter course of students");
		course=sc.next();
		return this;
		
	}
	

}
