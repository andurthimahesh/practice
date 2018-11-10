package junits;

import static org.junit.Assert.*;

import org.junit.Test;

import practice.ReverseAnumber;

public class ReverseTestCases {
	ReverseAnumber reverse = new ReverseAnumber();

	@Test
	public void reverseAnumber_condition() {

		int output = reverse.reverseAnumber(679);
		assertEquals(976, output);
	}

	/*@Test
	public void reverseAnumber_condition2() {

		assertEquals("mahesh", reverse.reverseAnumber(156));
	}

	@Test
	public void reverseAnumber_condition3() {

		assertEquals(0651, reverse.reverseAnumber(156 * 10));
	}*/

}
