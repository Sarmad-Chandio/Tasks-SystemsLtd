package com.systems;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoRestController {

	@Value("${email}")
	String email;
	
	@Value("${content}")
	String content;
	
	
	@GetMapping("/email")
	public String sendingEmail() 
	{
		return email+"<br>"+content;
	}
}
