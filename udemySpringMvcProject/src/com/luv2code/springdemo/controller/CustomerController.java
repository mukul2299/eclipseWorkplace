package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.dao.CustomerDao;
import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@RequestMapping(value="/customer")
@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping(value="/list")
	public String listCustomers(Model theModel) {
		List<Customer> theCustomers=customerService.getCustomers();
		theModel.addAttribute("customers",theCustomers);
		return "list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showCustomerForm(Model theModel) {
		Customer theCustomer= new Customer();
		theModel.addAttribute("customer",theCustomer);
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer, Model theModel) {
		customerService.saveCustomer(customer);
		
		return "redirect:/customer/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showUpdateForm(@RequestParam("customerId") int id , Model theModel) {
		System.out.println("--------------Inside---------------show form for update ");
		Customer theCustomer= customerService.getCustomer(id);
		System.out.println("--------------Customer---------------show form for update : "+theCustomer);
		
		theModel.addAttribute("customer",theCustomer);
		return "customer-form";
	}
	
	
	
	
}
