package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CourseCodeConstraintValidator.class) //Tells from where get the logics
@Target({ElementType.METHOD,ElementType.FIELD}) // Where can this annotations be applied
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	// Define default Course code
	public String value() default"luv";
	
	//Define default error message
	public String message() default"must starts with luv";
	
	// Define default groups
	public Class<?>[] groups() default {};
	
	//Define Default Payloads // Payloads provide custom details about validation failures(security lvl, error code etc.)
	public Class<? extends Payload>[] payload() default {}; 

}
