package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeConroller {
	
	/*
	 *Instead of using the @RequestParam we can use the class Object in the Spring
	 * 
	*/
	
	@RequestMapping("/home")
	public ModelAndView home(Alien alien) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("index");
		
		return mv;
	}
	
	/*using the modelAndView instead of 
	 * 
	 * 	public String home(HttpServletRequest req) {
		String name = req.getParameter("name");
		System.out.println("inside the home controller"+name);
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		return "index";
	}
	*/
}
