package com.foo;
/**
 * @author Lingxi Zhou 
 * @Date 11/04/2013
 * @email zhou44@email.sc.edu
 * @CSCE747 MidTest Take Home
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class TimeTest {

	@Test
	public void testTimeWithNoPara() {
		Time t = new Time();
		String expected = "Mon. 0: 0";
		assertEquals(t.toString(),expected);
		System.out.println("1");
	}
	
	@Test
	public void testTimeWithPara() {
		Time t = new Time("Mon", 8, 5);
		String expected = "Mon. 8: 5";
		assertEquals(t.toString(),expected);
		System.out.println("2");
	}
	
	@Test
	public void testGetDay() {
		Time t = new Time("Mon", 3, 5);
		String expected = "Mon";
		assertEquals(t.getDay(),expected);
		System.out.println("3");
	}
	
	@Test
	public void testGetTimeOfDay() {
		Time t = new Time("Mon", 8, 5);
		int expected = 805;
		assertEquals(t.getTimeOfDay(),expected);
		System.out.println("4");
	}
}
