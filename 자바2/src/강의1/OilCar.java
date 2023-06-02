package 강의1;

public class OilCar extends Car{
	
	int oil;
	
	
	void go(int speed)
	{
		this.speed = speed;
	}
	
	void stop()
	{
		this.speed = 0;
	}
	
}
