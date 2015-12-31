package com.github.vitalliuss.helloci;


import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 * @author vitali_shulha
 */
public class AppTest {

	@Test
	public void testShoudBePassed() {
		assertTrue(true);
	}

	@Test
	public void testShouldBeFailed() {
		assertTrue(true);
	}

	@Ignore("Not implemented yet")
	@Test
	public void testShouldBeSKipped() {
		assertTrue(true);
	}
	
	@Test
	public void testAnotherMethod() {
		App.doNothing();
	}
	
	@Test
	public void testAnotherClass() {
		EmptyClass.emptyMethod();
	}
	
	@Test
	public void testBySelf() {
		assertTrue((1+1)==2);
	}
	@Test
	public void testBySelf01() {
		assertTrue((1+1)==2);
	}
	@Test
	public void testBySelf04() {
		assertTrue((1+3)==4);
	}
}
