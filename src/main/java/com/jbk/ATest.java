package com.jbk;

import static org.junit.Assert.assertEquals;

public class ATest {

	@org.junit.Test
	public void sumTest() {
		
		System.out.println("I am in Sum Test");
		A aa=new A();
		int sumActual=aa.sum(5, 10);
		assertEquals(15, sumActual);
	}
	
	@org.junit.Test
	public void MulTest() {
			
			System.out.println("I am in Sum Test");
			A aa=new A();
			int sumActual=aa.mul(5, 10);
			assertEquals(50, sumActual);
		}
}
