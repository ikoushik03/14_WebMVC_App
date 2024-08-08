package com.koushik;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@GetMapping("/come")
	public ModelAndView getWelcomeMsg(@RequestParam String name)
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","My name is : "+name);
		mav.setViewName("index");
		return mav;
		
	}
	
	
	@GetMapping("/hemant")
	public String getGreetMsg(@RequestParam String name, Model model)
	{
		model.addAttribute("msg", "my name is :"+name);
		return "index";
	}
	
	@GetMapping("/koushik")
	public String fun(Model m)
	{
		m.addAttribute("msg","Hii ,Good Morning");
		return "index";
	}
}
