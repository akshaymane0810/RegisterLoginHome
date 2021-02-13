package amproject.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@GetMapping
	public String helloUser() {
		
		return "Hello ,Welcome To Home Page";
	}
}
