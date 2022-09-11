package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {
	@RequestMapping("/show-student-form")
	public String studentForm(Model model) {
		Student newStudent= new Student();
		model.addAttribute("student",newStudent);
		return "show-student-form";
	}
	@RequestMapping("/process-student-form")
	public String processStudentForm(@ModelAttribute("student")Student newStudent) {
		System.out.println(newStudent.getFirstName()+" "+newStudent.getLastName()+
				"\n Country:"+newStudent.getCountry()+"\nFavourite language: "+newStudent.getFavouriteLanguage());
		return "student-confirmation";
	}
}
