package junits;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import practice.UniqueCharecters;

public class UniqueTestCase {

	@Test
	public void unique_condition() {
		UniqueCharecters uttils= new UniqueCharecters();
		assertEquals(false,uttils.uniqueUttility("elephant"));
		
	}
	@Test
	public void unique_condition1() {
		UniqueCharecters uttils= new UniqueCharecters();
		assertEquals(true,uttils.uniqueUttility("ant"));
		
	}
	@Test
	public void unique_condition2() {
		UniqueCharecters uttils= new UniqueCharecters();
		assertEquals(false,uttils.uniqueUttility("2236"));
		
	}
	@Test
	public void unique_condition3() {
		UniqueCharecters uttils= new UniqueCharecters();
		assertEquals(false,uttils.uniqueUttility("-235-"));
		
	}

}
