package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {
	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix=courseCode.value();
	}

	@Override
	public boolean isValid(String inputCode, ConstraintValidatorContext additionalErrorMessages) {
		// You can add your own custom business logic
		boolean result;
		if(inputCode!=null) {
			result =inputCode.startsWith(coursePrefix);
		}
		else {
			result= true;
		}
		
		return result;
	}
	
}
