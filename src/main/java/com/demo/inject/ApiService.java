package com.demo.inject;

public class ApiService {
	//has a relationship

	private EmailService emailService;// has a dependencies
	private SMSService smsService;

	public ApiService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApiService(EmailService emailService, SMSService smsService) {
		super();
		this.emailService = emailService;
		this.smsService = smsService;
	}

	public boolean sendSMS(String msg) {
		return smsService.send(msg);

	}

	public boolean sendEmail(String msg) {
		return emailService.send(msg);
	}

}
