package ro.madonia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ro.madonia.entities.User;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index";
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
