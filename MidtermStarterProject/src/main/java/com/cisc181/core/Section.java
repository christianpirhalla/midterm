package com.cisc181.core;
import java.util.UUID;

//3.	Create new class ‘Section’.  
//Section has the following attributes: CourseID (UUID), SemesterID (UUID), SectionID (UUID), RoomID (int).  


public class Section {
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID = UUID.randomUUID();
	private int RoomID;
	
	public UUID getSectionCourseID(){
		return CourseID;
	}
	
	public UUID getSectionSemesterID(){
		return SemesterID;
	}
	
	public UUID getSectionID(){
		return SectionID;
	}
	
	public int getRoomID(){
		return RoomID;
	}
	
	public void setSectionCourseID(UUID u){
		CourseID = u;
		
	}
	
	public void setSectionSemesterID(UUID u){
		SectionID = u;
	}

	public void setRoomID(int i){
		RoomID = i;
	}
	
	public Section(UUID c, UUID s, int i){
		this.setSectionCourseID(c);
		this.setSectionSemesterID(s);
		this.setRoomID(i);
		
	}
	
}
