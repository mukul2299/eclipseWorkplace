package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello-world-controller")
public class HelloWorldController {
	@RequestMapping("/show-form")
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
		String name= reqname.toUpperCase();
		String result="Yo!"+name;
		model.addAttribute("message", result);
		model.addAttribute("name",reqname);
		return "helloworld";
	}
}
