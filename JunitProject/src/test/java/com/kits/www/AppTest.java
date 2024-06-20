package com.kits.www;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testSum() {
		int result=App.sum(10,20);
		assertEquals(40, result);
	}

	@Test
	public void testConcatination() {
		String result=App.concatination("kapil","it");
		assertEquals("kapilit",result);
	}

}
