package com.foo;
/**
 * @author Lingxi Zhou 
 * @Date 11/04/2013
 * @email zhou44@email.sc.edu
 * @CSCE747 MidTest Take Home
 */

/**  
 * (Method description)
 * @param
 * @return
 * etc
 */
public class Time {
	//Attributes
	public static String referencePoint = "midSundayNight";
	

	private String date;
	private int hr;
	private int min;
	
	//Constructor
	Time()
	{
		super();
		date = "Mon";
		hr = 0;
		min = 0;
	}
	
	
	public Time(String date, int hr, int min) 
	{
		super();
		this.date = date;
		this.hr = hr;
		this.min = min;
	}

	//methods
	public String getDay()
	{
		return date;
	}
	
	//time in format of 1005 == 10:05
	public int getTimeOfDay()
	{
		int time = hr*100 + min;
		return time;
	}
	
	public static String getReferencePoint() {
		return referencePoint;
	}


	public static void setReferencePoint(String referencePoint) {
		Time.referencePoint = referencePoint;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getHr() {
		return hr;
	}


	public void setHr(int hr) {
		this.hr = hr;
	}


	public int getMin() {
		return min;
	}


	public void setMin(int min) {
		this.min = min;
	}
	public String toString()
	{
		return date + ". " + hr + ": " + min;
	}
}
