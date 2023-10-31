package org.jsp.springmvcdemo;

import org.jsp.springmvcdemo.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value = "/open-home")
	public String openhome(Model model) {
		model.addAttribute("username","lukman khan");
		return "home.jsp";
	}
	
	@RequestMapping(value = "/find-sum")
	public ModelAndView findsum(@RequestParam(name = "n1")int n1, @RequestParam(name = "n2")int n2) {
		String result = "sum is :" +(n1+n2);
		ModelAndView view = new ModelAndView();
		view.addObject("result",result);
		view.setViewName("print.jsp");
		return view;
	}
	
	@RequestMapping(value = "/find-diff")
	public ModelAndView finddiff(@RequestParam(name = "n1")int n1, @RequestParam(name = "n2")int n2) {
		String result = "difference is :" +(n1-n2);
		ModelAndView view = new ModelAndView();
		view.addObject("result",result);
		view.setViewName("print.jsp");
		return view;
	}
	@RequestMapping(value = "/find-div")
	public ModelAndView finddiv(@RequestParam(name = "n1")int n1,@RequestParam(name = "n2") int n2) {
		String result = "division is:"+ (n1/n2);
		ModelAndView view = new ModelAndView();
		view.addObject("result",result);
		view.setViewName("print.jsp");
		return view;
	}
	
	@RequestMapping("/find-prod")
	public ModelAndView findprod(@RequestParam(name = "n1") int n1,@RequestParam(name = "n2") int n2) {
		String result = "multiplication is:"+(n1*n2);
		ModelAndView view = new ModelAndView();
		view.addObject("result",result);
		view.setViewName("print.jsp");
		return view;
	}
	
	@RequestMapping(value = "/print")
	public ModelAndView printdetails (@ModelAttribute User u) {
		System.out.println("Name :"+u.getName());
		System.out.println("Email :"+ u.getEmail());
		System.out.println("Phone :" + u.getPhone());
		System.out.println("Age :" + u.getAge());
		System.out.println("Password" + u.getPassword());
		
		ModelAndView view = new ModelAndView();
		view.addObject("result","all the result are printed");
		view.setViewName("print.jsp");
		return view;
	}
	

}
