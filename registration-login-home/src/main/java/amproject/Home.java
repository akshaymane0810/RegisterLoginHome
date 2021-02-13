package amproject;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import amproject.services.UserFun;
@Controller
public class Home {
	
	@Autowired
	private UserFun userFun;
	
	
	@RequestMapping("/")
	public String home() {
			return "login";
	}
	
	@RequestMapping("/save-user")
	public String saveUser(@RequestParam String username ,
			@RequestParam String name, @RequestParam String email ,
			@RequestParam String password, @RequestParam String city) {
		GetUser user = new GetUser(username,name,email,password,city);
		userFun.myUser(user);
	
		return "login";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	
	@RequestMapping("/show-users")
	public String showAllUsers(HttpServletRequest request) {
		request.setAttribute("users", userFun.showAllUsers() );
		request.setAttribute("mode", "ALL_USERS");
		return "home";
	
		
	}
	
	
}
