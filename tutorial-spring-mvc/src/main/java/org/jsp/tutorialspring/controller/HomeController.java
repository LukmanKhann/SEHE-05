package org.jsp.tutorialspring.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "first")
public class HomeController {
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home (Model model) {
		System.out.println("this is home url");
		model.addAttribute("name","mohammad lukman khan");
		model.addAttribute("id",3463);
		
		
		List<String> friends = new ArrayList<String>();
		friends.add("khan");
		friends.add("saif");
		friends.add("kaif");
		
		model.addAttribute("f",friends);
		return "index";
	}
	
	
	@RequestMapping("/about")
 public String about() {
	 System.out.println("this is about controller");
	 return "about";
 }
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
//		creating model and view object
		ModelAndView modelandview = new ModelAndView();
//		setting the data
		modelandview.addObject("name","dragon ball");
		modelandview.addObject("number",5645646);
		LocalDateTime time = LocalDateTime.now();
		modelandview.addObject("time",time);
		
//		array list
		List<Integer> list =  new ArrayList<Integer>();
		list.add(45);
		list.add(87);
		list.add(25);
		list.add(65);
		modelandview.addObject("marks",list);
	
//		setting view name
		modelandview.setViewName("help");
		
		return modelandview;
	}
}
