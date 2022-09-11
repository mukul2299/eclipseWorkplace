package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Customer {
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1, message="length must greater than one")
	private String lastName;
	
	@NotNull(message="is required")
	@Min(value=1, message="Please enter a value >= 0")
	@Max(value=10, message="Please enter a value <= 10")
	private Integer freePass;
	
	@NotNull(message="Can't be null")
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="Length must be equal to 5")
	private String postalCode;
	
	@CourseCode(value="NERD", message="Must start with NERD")
	private String courseCode;
	
	
	
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getFreePass() {
		return freePass;
	}
	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}
	
}
