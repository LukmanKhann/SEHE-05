package org.jsp.practice.controller;

import org.jsp.practice.dao.UserDao;
import org.jsp.practice.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
     @Autowired
	public UserDao dao;
     
     @RequestMapping("/open")
     public String operView (String view) {
   	  return view;
     }
     
     
     @RequestMapping(value = "/register", method = RequestMethod.POST)
     public ModelAndView saveUser(@ModelAttribute User u ,ModelAndView view) {
    	 u = dao.saveUser(u);
    	 view.addObject("msg", "user saved with id :"+u.getId());
    	 view.setViewName("result");
    	 return view;
     }
     
     @RequestMapping(value = "/edit")
     public ModelAndView editUser(@RequestParam int id,ModelAndView view,User u) {
    	 u = dao.findUser(id);
    	 if(u!=null) {
    		 view.addObject("u",u);
    		 view.setViewName("update");
    		 return view;
    	 }
    	 else {
    		 view.addObject("msg","user is not present with this id");
    		view.setViewName("result");
    		return view;
    	 }
    	 	 
     }
     
     @RequestMapping(value = "/update")
     public ModelAndView updateUser(@ModelAttribute User u ,ModelAndView view) {
    	 u = dao.updateUser(u);
    	 view.addObject("msg","user successfully updated");
    	 view.setViewName("result");
    	 return view;
     }
     @RequestMapping(value = "/find")
     public ModelAndView findUser(@RequestParam int id,ModelAndView view,User u) {
    	 u = dao.findUser(id);
    	 if(u!=null) {
    		 view.addObject("u",u);
    		 view.setViewName("view");
    		 return view;
    	 }
    	 else {
    		 view.addObject("msg","no user found with this id");
    		 view.setViewName("result");
    		 return view;
    	 }
     }
     @RequestMapping(value = "/delete")
     public ModelAndView deleteUser(@RequestParam int id,ModelAndView view,User u) {
    	  u = dao.findUser(id);
    	  if(u!=null) {
    		  dao.deleteUser(id);
    		  view.addObject("msg","user deleted successfull");
    		  view.setViewName("result");
    		  return view;
    	  }
    	  else {
    		  view.addObject("msg","no record found");
    		  view.setViewName("result");
    		  return view;
    	  }
     }
}
