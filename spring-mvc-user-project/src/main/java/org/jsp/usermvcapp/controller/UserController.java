package org.jsp.usermvcapp.controller;

import org.jsp.usermvcapp.dao.Userdao;
import org.jsp.usermvcapp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

@Controller
public class UserController {
      @Autowired
	private Userdao dao ;
      
      @RequestMapping("/open")
      public String operView (String view) {
    	  return view;
      }
      
      @PostMapping(value = "/register")
      public ModelAndView saveUser(@ModelAttribute User u,ModelAndView view) {
    	  u = dao.saveUser(u);
    	  view.addObject("msg","user is saved with the id :"+u.getId());
    	  view.setViewName("print");
    	  return view;
      }
      
      @RequestMapping(value = "/edit")
      public ModelAndView edit(@RequestParam int id, ModelAndView view) {
    	  User u = dao.findById(id);
    	  if(u!=null) {
    		  view.addObject("u",u);
    		  view.setViewName("update");
    		  return view;
    	  }
    	  else {
    		  view.addObject("msg","invalid id ");
    		  view.setViewName("print");
    		  return view;
    	  }
      }
      
      @RequestMapping(value="/update")
     public ModelAndView updateuser(@ModelAttribute User u,ModelAndView view ) {
    	  dao.updateUser(u);
    	 view.addObject("msg", "user updated");
    	 view.setViewName("print");
    	 return view;
     }
      
      @RequestMapping(value = "/verify-phone")
      public ModelAndView verifyByPhone(@RequestParam long phone,@RequestParam String password, ModelAndView view) {
    	  User u = dao.verifyUser(phone, password);
    	  if(u!=null) {
    		  view.addObject("u",u);
    		  view.setViewName("view");
    		  return view;
    	  }
    	  else {
    		  view.addObject("msg","invalid phone and password ");
    		  view.setViewName("print");
    		  return view;
    	  }
    	  
      }
      
      
      @RequestMapping(value = "/verify-email")
      public ModelAndView verifyByEmail(@RequestParam String  email,@RequestParam String password, ModelAndView view) {
    	  User u = dao.verifyUser(email, password);
    	  if(u!=null) {
    		  view.addObject("u",u);
    		  view.setViewName("view");
    		  return view;
    	  }
    	  else {
    		  view.addObject("msg","invalid email and password ");
    		  view.setViewName("print");
    		  return view;
    	  }
    	  
      }
      
      @RequestMapping(value = "/verify-id")
      public ModelAndView verifyById(@RequestParam int  id,@RequestParam String password, ModelAndView view) {
    	  User u = dao.verifyUser(id, password);
    	  if(u!=null) {
    		  view.addObject("u",u);
    		  view.setViewName("view");
    		  return view;
    	  }
    	  else {
    		  view.addObject("msg","invalid Id and password ");
    		  view.setViewName("print");
    		  return view;
    	  }
    	  
      }
      
      @RequestMapping(value = "/deleteuser")
      public ModelAndView deleteuser(@RequestParam int id,ModelAndView view,User u) {
    	  
    	  u = dao.findById(id);
    	  if(u!=null) {
    		  dao.deleteUser(id);
    		  view.addObject("msg","user deleted successfully");
    		  view.setViewName("print");
    		  return view;
    	  }
    	  else {
    		  view.addObject("msg","no record is present with this is");
    		  view.setViewName("print");
    		  return view;
    	  }
    	  
    	  
    	  
    	  
    	  
    	  
    	  
      }
}
