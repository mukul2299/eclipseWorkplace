package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/silly-controller")
@Controller
public class SillyController {
	@RequestMapping("/show-forms")
	public String showForm() {
		return "show-form";
	}
	@RequestMapping("/process-form")
	public String processForm() {
		return "helloworld";
	}
	@RequestMapping("/process-form-V2")
	public String processFormV2(/*HttpServletRequest request,*/@RequestParam("StudentName")
	String reqname, Model model) {
//		String name= request.getParameter("StudentName");
		String name= reqname;
		
		name=name.toUpperCase();
		String result="Yo!"+name;
		model.addAttribute("message", result);
		return "helloworld";
	}
}
