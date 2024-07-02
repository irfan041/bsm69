package com.demo.inject;

public class EmailService implements Service{
	
	@Override
	public boolean send(String msg) {
		System.out.println("Sending Email");
		return true;
	}

}
