package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.demo.CaseConverter;
import com.demo.NumberCalculation;

public class CaseConverterTest {

	CaseConverter c1;

	@BeforeEach
	void init() {
		c1 = new CaseConverter();
	}

	@Test
	public void testConvertCase() {
		assertEquals(c1.convertCase("hello"), "HELLO");
	}

	@Test
	public void testConvertCase2() {
		assertEquals(c1.convertCase("Hello"), "HELLO");
	}

	@Test
	public void testConvertCase3() {
		assertEquals(c1.convertCase(""), "");
	}

	@Test
	public void testConvertCase5() {
		assertEquals(c1.convertCase(null), "");
	}

	@Test
	public void testConvertCase6() {
		assertEquals(c1.convertCase("71"), "71");
	}

}