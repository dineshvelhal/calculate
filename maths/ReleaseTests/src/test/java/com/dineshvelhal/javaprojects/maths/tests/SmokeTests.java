package com.dineshvelhal.javaprojects.maths.tests;

import org.testng.annotations.Test;

import com.dineshvelhal.javaprojects.maths.Maths;

import org.testng.annotations.BeforeTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.testng.annotations.AfterTest;

public class SmokeTests {
	Maths math;
	
	@Test(description = "Addition Test")
	public void addTest() {
		System.out.println("@Test Inside addTest");
		
		assertEquals(5, math.add(2, 3));
	}
	
	@Test(description = "Subtraction Test")
	public void subtractTest() {
		System.out.println("@Test Inside subtractTest");
		
		assertEquals(5, math.subtract(7, 2));
	}
	
	@Test(description = "Multiplication Test")
	public void multiplyTest() {
		System.out.println("@Test Inside multiplyTest");
		
		assertEquals(15, math.multiply(5, 3));
	}
	
	@Test(description = "Division Test")
	public void divideTest() {
		System.out.println("@Test Inside divideTest");
		
		assertEquals(5, math.divide(20, 4));
		assertNotEquals(5.5, math.divide(11, 2)); // to check it's integer division
	}


	@BeforeTest
	public void initiate_browser() {
		System.out.println("@Before Inside setUp");
		math = new Maths();
	}

	@AfterTest
	public void close_browser() {
		System.out.println("@After Inside tearDown\n*********************************");
		math = null;
	}

}
