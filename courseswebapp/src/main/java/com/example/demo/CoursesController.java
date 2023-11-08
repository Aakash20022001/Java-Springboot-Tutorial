package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CoursesController {
	
	@RequestMapping("courses")
//	public String courses(HttpServletRequest req) {
////	System.out.println("Welcome to THE New World of SpringBoot");
//		HttpSession session=req.getSession();
//		String cname=req.getParameter("cname");
////		System.out.println("Course Name is: "+cname);
//		session.setAttribute("cname", cname);
//	return "course";
//	}
//	public String courses(@RequestParam("cname")String coursename, HttpSession session) {
	public ModelAndView courses(@RequestParam("cname")String coursename){
//		session.setAttribute("cname",coursename);
		ModelAndView mv=new ModelAndView();
		mv.addObject("cname",coursename);
		mv.setViewName("course");
//		return "course";
		return mv;
	}
	
}
