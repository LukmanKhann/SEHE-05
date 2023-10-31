package org.jsp.tutorialspring.controller;

import javax.servlet.http.HttpServletRequest;

import org.jsp.tutorialspring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("head","men are brave");
		m.addAttribute("desc","do you bleed");
		
		System.out.println("adding data");
	}
	
   
	@RequestMapping(value = "/contact")
	public String showform( Model m) {
		return "contact";
		
	}
	
	@RequestMapping(value = "/processform",method = RequestMethod.POST )
	public String handleform(@ModelAttribute User u,Model model){
		System.out.println(u);
		
//		model.addAttribute("user",u);
		return "sucess";
	}
	
}
