package ro.madonia.WebZ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ro.madonia.WebZ.entities.User;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/shows")
	public String shows() {
		return "shows";
	}
	
	@RequestMapping("/art")
	public String art() {
		return "art";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping("/presa")
	public String presa() {
		return "presa";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	// @RequestParam("username") User username,
	// @RequestParam("password") String password

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(User user) {
		// User u = new User();
		// u.setUsername(username);
		// u.setPassword(password);
		return new ModelAndView("dashboard", "user", user);
	}

}
