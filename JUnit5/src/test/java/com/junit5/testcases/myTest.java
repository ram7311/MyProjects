package com.junit5.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(OrderAnnotation.class)//test methods doesn't follow any order this will make to follow given order
public class myTest {
	
	@Test
	//@Order(3)
	public void t1() {
		System.out.println("t1");
		assertTrue(true);
	}
	@Test
	@Order(2)
	@Disabled("Not required now") // disabling this test case
	void t2() {
		System.out.println("t2");
		assertTrue(false);
	}
	@Test
	@Order(1)
	void t3() {
		System.out.println("t3");
		assertEquals(1,10);
	}
}
