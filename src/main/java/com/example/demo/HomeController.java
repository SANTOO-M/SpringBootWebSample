package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	public HomeController() {
		System.out.println("Front-Controller Object Created..");
	}
	
	@RequestMapping("/home")
	public String homePage(@RequestParam("name") String myname, HttpSession session){//HttpServletRequest request) {
		//String myname=request.getParameter("name");
		//HttpSession session=request.getSession();
		session.setAttribute("n", myname);
		return "Home";
	}

}
