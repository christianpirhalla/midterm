package com.cisc181.core;


import java.util.Date;
import java.util.UUID;


public class Semester {

	private UUID SemesterID = UUID.randomUUID();
	private Date StartDate;
	private Date EndDate;
	
	public UUID getSemesterID(){
		return SemesterID;
	
	}
	
	public Date getStartDate(){
		return StartDate;
		
	}
	
	public Date getEndDate(){
		return EndDate;
	}
	
	public void setStartDate(Date d){
		StartDate = d;
	}

	public void setEndDate(Date d){
		EndDate = d;
	}
	
}
