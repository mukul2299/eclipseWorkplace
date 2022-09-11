package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	@InitBinder //trims the trailing and leading spaces. Converts to null if all spaces
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor editor= new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class,editor);
	}
	
	@RequestMapping("/showCustomerForm")
	public String showCustomerForm(Model model) {
		Customer newCustomer= new Customer();
		model.addAttribute("customer", newCustomer);
		return "show-customer-form";
	}
	
	@RequestMapping("/process-customer-form")
	public String processCustomerForm(@Valid @ModelAttribute("customer")Customer newCustomer,
			BindingResult binding) {
		System.out.println("Binding Result: "+binding+" \n\n\n\n");
		if(binding.hasErrors()) return "show-customer-form";
		
		return "customer-confirmation";	
	}
}
