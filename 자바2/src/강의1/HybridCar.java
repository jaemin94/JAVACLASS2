package 강의1;

public class HybridCar extends Car{

	void go(int speed)
	{
		this.speed = speed;
	}
	
	void stop()
	{
		this.speed =0;
	}
	
	void Charge(int power)
	{
		this.battery = power + battery;
		
	}
	
}
