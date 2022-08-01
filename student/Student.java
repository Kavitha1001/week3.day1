package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student name:Kavitha");

	}

	public void studentDept() {
		System.out.println("ECE");

	}


	public void studentId() {
		System.out.println("045");

	}


	public static void main(String[] args) {

		Department s=new Department();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		

	}

}
