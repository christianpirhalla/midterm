package com.cisc181.core;

import java.util.UUID;

public class Course {

	private UUID CourseID = UUID.randomUUID();
	private String CourseName;
	private int GradePoints;
	
	public Course(){
		
	}
	
	public UUID getCourseID(){
		return CourseID;
		
	}
	
	public String getCourseName(){
		return CourseName;
	}
	
	public int getGradePoints(){
		return GradePoints;
	}
	
	public void setCourseName(String n){
		CourseName = n;
	}
	
	public void setGradePoints(int g){
		GradePoints = g;
	}
	
	public Course(String n, int g){
		this.setCourseName(n);
		this.setGradePoints(g);
		
	}
	
}
