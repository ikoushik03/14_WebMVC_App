package com.koushik;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
		
	
		@GetMapping("/date")
		public ModelAndView getTodayDate()
		{
			ModelAndView mav = new ModelAndView();
			LocalDate now = LocalDate.now();
			String msgTxt = "Today Date is ::"+now;
			mav.addObject("msg", msgTxt);
			mav.setViewName("index");
			return mav;
		}
		
		@GetMapping("/msg")
		public ModelAndView getMsg(@RequestParam String name)
		{
			String str = "Hello"+" "+name;
			ModelAndView mav = new ModelAndView();
			mav.addObject("msg", str);
			mav.setViewName("index");
			return mav;
		}
		
		@GetMapping("/book")
		public ModelAndView getBookData(@RequestParam String name,String author)
		{
			System.out.println("Name:"+name);
			System.out.println("Author:"+author);
			String str = "Hello"+" "+name+" " +author;
			ModelAndView mav = new ModelAndView();
			mav.addObject("msg", str);
			mav.setViewName("index");
			return mav;
		}
}
