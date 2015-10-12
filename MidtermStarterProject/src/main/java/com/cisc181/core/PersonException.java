package com.cisc181.core;

import java.util.Calendar;
import java.util.Date;
/*
7.	Create new custom exception for ‘Person’.  Name the class ‘PersonException’.  
The new exception should extend ‘Exception’, and add ‘Person’ an attribute.
  Use ‘this’ to pass the current state of the instance to the exception.
The exception should be thrown if the DOB given is more than 100 years older than the current date.
The exception should be thrown if the phone number isn’t formatted (###)-###-####.
  Easiest way to do this is to use regular expressions (regex).
    Check out this page to learn how to use basic regex validation:
http://howtodoinjava.com/2014/11/12/java-regex-validate-and-format-north-american-phone-numbers/

 */


public class PersonException extends Exception {

	public PersonException (Date DOB){
		super("Invalid DOB (Exceeds 100 yrs. from current date): " + DOB.toString());
	}
	
	public PersonException(String phoneNum){
		super("Invalid phone number formatting: " + phoneNum.toString() + "/n"
	+ "Please format like the following:(###)-###-####");
	}
	
}
