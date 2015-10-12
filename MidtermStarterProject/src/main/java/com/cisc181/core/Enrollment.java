package com.cisc181.core;

import java.util.UUID;

/*
 * 6.	Create new class ‘Enrollment’.  
Enrollment has the following attributes: SectionID(UUID), 
StudentID (UUID), EnrollmentID(UUID) and Grade (double).  
Enrollment should have its no-arg constructor private.
Enrollment should have a two-arg constructor, with StudentID and SectionID as input parameters.
EnrollmentID should be set in the constructor.
SetGrade(double grade) should be defined as a procedure.
15 points.

 */

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	public UUID getEnrollmentSectionID(){
		return SectionID;
	}
	
	public UUID getEnrollmentStudentID(){
		return StudentID;
	}
	
	public UUID getEnrollmentID(){
		return EnrollmentID;
	}
	
	public double getGrade(){
		return Grade;
	}
	
	public void setGrade(double g){
		Grade = g;
	}
	
	
	public Enrollment(UUID stu, UUID sec){
		this.SectionID = sec;
		this.StudentID = stu;
		this.EnrollmentID = UUID.randomUUID();
	}
	
	private Enrollment(){
		
	}
	
	
	
}
