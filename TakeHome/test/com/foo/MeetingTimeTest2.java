package com.foo;
/**
 * @author Lingxi Zhou 
 * @Date 11/04/2013
 * @email zhou44@email.sc.edu
 * @CSCE747 MidTest Take Home
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class MeetingTimeTest2 {

	@Test
	public void testMeetingTime1() {
		Time t1 = new Time("mon",9, 15);
		int duration1 = 75;
		MeetingTime mt1 = new MeetingTime(t1,duration1);
		
		Time t2 = new Time("Tue",9, 15);
		int duration2 = 75;
		MeetingTime mt2 = new MeetingTime(t2,duration2);
		
		String expected = "NotOverLap";
		assertEquals(mt1.overLap(mt2),expected);
		System.out.println("2mt1");
	}
	@Test
	public void testMeetingTime2() {
		Time t1 = new Time("mon",9, 15);
		int duration1 = 75;
		MeetingTime mt1 = new MeetingTime(t1,duration1);
		
		Time t2 = new Time("wed",9, 15);
		int duration2 = 75;
		MeetingTime mt2 = new MeetingTime(t2,duration2);
		
		String expected = "NotOverLap";
		assertEquals(mt1.overLap(mt2),expected);
		System.out.println("2mt2");
	}
	@Test
	public void testMeetingTime3() {
		Time t1 = new Time("mon",9, 15);
		int duration1 = 75;
		MeetingTime mt1 = new MeetingTime(t1,duration1);
		
		Time t2 = new Time("thr",9, 15);
		int duration2 = 75;
		MeetingTime mt2 = new MeetingTime(t2,duration2);
		
		String expected = "NotOverLap";
		assertEquals(mt1.overLap(mt2),expected);
		System.out.println("2mt3");
	}
	@Test
	public void testMeetingTime4() {
		Time t1 = new Time("mon",9, 15);
		int duration1 = 75;
		MeetingTime mt1 = new MeetingTime(t1,duration1);
		
		Time t2 = new Time("fri",9, 15);
		int duration2 = 75;
		MeetingTime mt2 = new MeetingTime(t2,duration2);
		
		String expected = "NotOverLap";
		assertEquals(mt1.overLap(mt2),expected);
		System.out.println("2mt4");
	}
	@Test
	public void testMeetingTime5() {
		Time t1 = new Time("mon",9, 15);
		int duration1 = 75;
		MeetingTime mt1 = new MeetingTime(t1,duration1);
		
		Time t2 = new Time("sat",9, 15);
		int duration2 = 75;
		MeetingTime mt2 = new MeetingTime(t2,duration2);
		
		String expected = "NotOverLap";
		assertEquals(mt1.overLap(mt2),expected);
		System.out.println("2mt5");
	}
}
