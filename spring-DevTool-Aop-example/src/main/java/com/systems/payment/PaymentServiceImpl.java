package com.systems.payment;

import org.springframework.stereotype.Service;


@Service
public class PaymentServiceImpl implements PaymentService{

	
	public void makePayment() {
		//payment code 
		System.out.println("Ammount Debited");
		System.out.println("Ammount Credited");
	}
}
