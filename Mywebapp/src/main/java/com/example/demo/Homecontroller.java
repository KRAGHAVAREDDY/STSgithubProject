package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// we have embedded tomcatserver 

@Controller
public class Homecontroller {

	// dipatchservlet in servlets
	// here @RequestMapping("home")is for home request

	// @ResponseBody tells that what ever returning is data

//	@RequestMapping("home")
//	public String home(HttpServletRequest req,HttpServletResponse res)
//	{
//		HttpSession session =req.getSession();
//		String name =req.getParameter("name");
//		session.setAttribute("name",name);
//
//		System.out.println("hi"+" "+name);
//	return "Home";
	// @RequestParam() if we are using a different name then we can use

	@RequestMapping("home")
	public ModelAndView home(@RequestParam("aname") String myName) {
		// if we consider data as model, and  view as view name if we want to send
		// modelandview is the best approach with out httpsession
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName);
		mv.setViewName("home");
		return mv;
		// spring boot doesnt support jsp page
		// we have to see embeded tomcat ver 9.0.39 &we have to download tomcat jasper
		// from mvn repo with same version

	}
	@RequestMapping("AlienIntro")
	public ModelAndView AlienIntro(Alien alien)	
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("Welcome");
		return mv;
	}
}
