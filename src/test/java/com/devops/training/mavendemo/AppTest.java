package com.devops.training.mavendemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest
{
	@Test
	
	public void testGreeting() {
		App obj = new App();
		assertNotNull(obj.getGreeting());
	}
	
}