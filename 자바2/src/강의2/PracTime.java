package 강의2;

public class PracTime {
	
	int hour;
	int minute;
	int second;
	
	void setHour(int hour)
	{
		this.hour = hour;
	}
	
	int getHour()
	{
		
		if(hour >= 0 && hour <= 23) 
		{
			return hour;
		}	
		return hour;		
	}
	
	void setMinute(int minute)
	{
		this.minute = minute;
	}
	
	int getMinute()
	{
		if(minute >= 0 && minute <= 59) 
		{
			return minute;
		}	
		return minute;
		
	}
	
	void setSecond(int second)
	{
		this.second = second;
	}
	
	int getSecond()
	{
		if(second >= 0 && second <= 59) 
		{
			return second;
		}	
		return second;
		
	}
	
	
	public String toString()
	{
		return "hour: " + getHour() + " minute: " + getMinute() + " second: " + getSecond();
	}
}
