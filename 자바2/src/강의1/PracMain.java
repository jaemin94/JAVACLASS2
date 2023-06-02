package 강의1;

public class PracMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ElectricCar car1 = new ElectricCar();
		HybridCar car2 = new HybridCar();
		
		car1.battery= 50;
		car1.Charge(30);
		
		car2.battery = 20;
		car2.Charge(50);
		
		System.out.println("현재 배터리량: " + car1.battery);
		System.out.println("현재 배터리량: " + car2.battery);
	}

}

/*
	실습1_1 : OilCar car = new OilCar();
		
			 car.go(100);
			 System.out.println(car.speed);
			 car.stop();
			 System.out.println(car.speed);

	실습1_2 : OilCar car = new OilCar();
		
			 car.doors[0].name = "운전석";
			 car.doors[1].name = "조수석";
			 car.doors[2].name = "운전석 뒷문";
			 car.doors[3].name = "조수석 뒷문";
		
			 car.doors[2].open();

	실습1_3 : ElectricCar car1 = new ElectricCar();
			 HybridCar car2 = new HybridCar();
		
			 car1.battery= 50;
			 car1.Charge(30);
		
			 car2.battery = 20;
			 car2.Charge(50);
		
			 System.out.println("현재 배터리량: " + car1.battery);
			 System.out.println("현재 배터리량: " + car2.battery);





*/