package com.gkn.springmvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		
		return "helloworld";
	}
	
	@RequestMapping("/newForm")
	public String NewData(HttpServletRequest request, Model model)
	{
		String theName = request.getParameter("studentName");
		
		theName = theName.toUpperCase();
		
		String res = "Name is : " + theName;
		 
		model.addAttribute("message", res);
		return "helloworld";

		
	}
	
	@RequestMapping("/newForm2")
	public String NewData2(
			@RequestParam("studentName") String theName
			, Model model)
	{
		//String theName = request.getParameter("studentName");
		
		theName = theName.toUpperCase();
		
		String res = "Hello: " + theName;
		 
		model.addAttribute("message", res);
		return "helloworld";

		
	}
	
	
}
