package com.example.controller;

import java.util.List;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.model.User;
import com.example.service.UserService;

@Controller
public class MainCotroller {
//	DriverManagerDataSource ob = new DriverManagerDataSource();
//	LocalSessionFactoryBean ob1 = new LocalSessionFactoryBean();
	
	
	
	@Autowired
	private UserService service;

	private static final Logger logger=Logger.getLogger(User.class);
	
	@GetMapping("/allusers")
	public ModelAndView listUser(ModelAndView m)
	{
		List<User> list=service.getAllUsers();
		m.addObject("listUsers",list);
		m.setViewName("home");
		return m;
	}
	
	@GetMapping("/adduser")
	 public ModelAndView userForm(ModelAndView m)
	 {
		 m.addObject("user",new User());
		 m.setViewName("register");
		 return m;
	 }
	
	
	@PostMapping("/saveuser")
	public ModelAndView saveUser(@ModelAttribute User user)
	{
		if(user.getId()==0)
		{
		service.addUser(user);
		}
		else
		{
			service.updateUser(user);
		}
	
		return new ModelAndView("redirect:/allusers");
	}
	
	@GetMapping("/deleteuser")
	public ModelAndView deleteUserByid(@RequestParam("id")Integer id)
	{
		service.deleteUser(id);
		return new ModelAndView("redirect:/allusers");
		
	}
	
	@GetMapping("/edituser")
	public ModelAndView editUser(@RequestParam("id") int id)
	{
		User u=service.getUser(id);
		ModelAndView model=new ModelAndView("register");
		model.addObject("user", u);
		return model;
	}
	
}
