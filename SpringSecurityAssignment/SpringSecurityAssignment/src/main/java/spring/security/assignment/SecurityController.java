package spring.security.assignment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/admin")
	public ModelAndView admin() {
		return (new ModelAndView("admin"));
	}
	
	@RequestMapping("/user")
	public ModelAndView user() {
		return (new ModelAndView("user"));
	}
}