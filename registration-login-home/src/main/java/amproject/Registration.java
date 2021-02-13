package amproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Registration {

		
		@RequestMapping("/register")
		public String register() {
				return "registration";
		}
	/*	@RequestMapping("/userDetails")
		public String userInfo(GetUser gu) {
				System.out.println("In userInfo ..."+gu.getUsername());
				return "login";
		}*/

		
		
}
