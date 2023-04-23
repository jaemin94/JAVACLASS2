package 강의2;

public class Time {

	int hour;
	int minute;
	int second;
	
	void setHour(int hour)
	{
		if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
	}
	int getHour()
	{
		return hour;
		
	}
	void setMinute(int minute)
	{
		if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
	}
	int getMinute()
	{
		return minute;
		
	}
	void setSecond(int second)
	{
		if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            this.second = 0;
        }
	}
	int getSecond()
	{
		return second;
		
	}
	
	public String toString()
	{
		return "hour:" + hour + "minute:" + minute + "second:" + second;
		
	}
	

}


