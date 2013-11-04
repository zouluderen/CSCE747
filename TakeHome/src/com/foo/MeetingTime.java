package com.foo;
/**
 * @author Lingxi Zhou 
 * @Date 11/04/2013
 * @email zhou44@email.sc.edu
 * @CSCE747 MidTest Take Home
 */
public class MeetingTime {
	//Attributes
		public static String referencePoint = "midSundayNight";
		private Time startTime;
		private int duration;

		//Constructor
		MeetingTime()
		{
			super();
			startTime = new Time();
			duration = 0;
		}
		
		public MeetingTime(Time t1, int duration) {
			super();
			this.startTime = t1;
			this.duration = duration;
		}
		
		//methods
		public String overLap(MeetingTime mt)
		{
			if(this.startTime.getDate().endsWith(mt.startTime.getDate()))// same date
			{
				if(this.getStartTime().getTimeOfDay() + this.getDuration()/60*100 + this.getDuration()%60 >=mt.getStartTime().getTimeOfDay()&&this.getStartTime().getTimeOfDay() <= mt.getStartTime().getTimeOfDay()||
						mt.getStartTime().getTimeOfDay() + mt.getDuration()/60*100 + mt.getDuration()%60 >=this.getStartTime().getTimeOfDay()&&mt.getStartTime().getTimeOfDay() <= this.getStartTime().getTimeOfDay())
					return "IsOverLap";
				else
					return "NotOverLap";
			}
			else
			{
				return "NotOverLap";
			}
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}
		
		public Time getStartTime() {
			return startTime;
		}

		public void setStartTime(Time startTime) {
			this.startTime = startTime;
		}
}
