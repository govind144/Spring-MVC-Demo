package com.gkn.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		Student theStudent = new Student();
		
		model.addAttribute("student", theStudent);
		
		
		return "student-form";
	}
	
	@RequestMapping("/stuform")
	public String stuForm(@ModelAttribute("student") Student
			theStudent
			 )
	{
		System.out.println(theStudent.getFirstName());
		System.out.println(theStudent.getLastName());
		return "stuform";
	}
	 
}
