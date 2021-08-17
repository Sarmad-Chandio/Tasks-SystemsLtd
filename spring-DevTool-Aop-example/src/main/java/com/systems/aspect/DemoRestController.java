package com.systems.aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.systems.payment.PaymentService;

@RestController
public class DemoRestController {

	@Value("${email}")
	String email;

	@Value("${content}")
	String content;

	
	@Autowired
	PaymentService p;

	
	@GetMapping("/email")
	public String sendingEmail() {
		p.makePayment();
		//System.out.println("");
		return email + "<br>" + content+"<br>"+"After pyment complition ,email send Succesfull";
	}

}