package 강의1;

public class Car{

	int speed;
	public Door doors[] = new Door[4];
	int power;
	int battery = 0;
	
	Car()
	 {
		 
		//문 4개를 생성한다.
		 for(int i =0;i<doors.length;i++)
			 doors[i] = new Door();
	 }
	
	void Charge(int power)
	{
		
		this.power = battery + power;
		
	}
	
	
	
	void go(int speed)
	{
		this.speed = speed;
	}
	
	void stop()
	{
		this.speed =0;
	}

}
