package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import com.demo.parametrize.Parametrize;

public class ParametrizeTest {
	
	
	@ParameterizedTest
	@ValueSource(strings= {"radar","madam","tacocat","Irfan"})
	public void palindromTest(String input) {
		
		assertTrue( Parametrize.isPalindrom(input));
		
	}

}
