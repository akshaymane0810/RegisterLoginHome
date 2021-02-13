package amproject.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import amproject.GetUser;
import amproject.repository.UserRepository;

@Controller
public class Login {
	@Autowired
	private UserRepository userRepository;
	
	
	
	@RequestMapping("/login")
	public String login(@RequestParam("username") String username,
			@RequestParam("password") String password , Model model) {
		GetUser u = null;
		GetUser p = null;
		try {
			u = userRepository.findByName(username);
			p = userRepository.findByName(password);
		}catch(Exception e) {
			System.out.println("user not found !!!!");
		}
		if(u!=null && p!=null) {
		model.addAttribute("Username", username);
		model.addAttribute("Password", password);

			return "home";
		}
		model.addAttribute("error","User Not Found or incorrect password ,Go to Register !!!!");
		return "login";

	}
}
