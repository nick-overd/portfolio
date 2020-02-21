package com.qa.fibonaccisequence;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {

	
	
	
	@Test
	public void recurssionTest() {
		FibonacciSequence run = new FibonacciSequence();
		assertEquals(102334155, run.fibonacciSequence(40));
	}
	@Test
	public void otherTest() {
		FibonacciSequence run = new FibonacciSequence();
		assertEquals(102334155, run.fibonacci(40));
	}
}
