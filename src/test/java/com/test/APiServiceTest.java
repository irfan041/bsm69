package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.demo.inject.ApiService;
import com.demo.inject.EmailService;
import com.demo.inject.SMSService;

@ExtendWith(MockitoExtension.class)
public class APiServiceTest {

	@Mock
	EmailService emailService;

	@Mock
	SMSService smsService;

	@InjectMocks
	ApiService apiService;

	@Test
	public void testEmail(){
		when(apiService.sendEmail("Email")).thenReturn(true);
		
		assertTrue(apiService.sendEmail("Email"));
	}

	@Test
	public void testSMS(){
		when(apiService.sendSMS(anyString())).thenReturn(true);
		
		assertTrue(apiService.sendSMS("Hello"));
		
		
	}

}

//has a relationship

//Marker interface--it is an interface which does not have any method--Clonable, Serializable , RandomAcess 
