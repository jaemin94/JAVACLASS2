package 강의1;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		retest
	}

}


/*
//Car 클래스 정의
class Car {
 int speed;

 void go(int speed) {
     this.speed = speed;
 }

 void stop() {
     this.speed = 0;
 }
}

//OilCar 클래스 정의 (Car 클래스를 상속받음)
class OilCar extends Car {
 int oil;
public Door[] doors;

 // 생성자
 public OilCar() {
     this.oil = 100; // 초기값으로 100으로 설정
 }
}


}

public class 실습1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OilCar car = new OilCar();
		car.go(100);
		System.out.println(car.speed); // 100 출력
		car.stop();
		System.out.println(car.speed); // 0 출력
	}

}

//Car 클래스 정의
class Car {
int speed;
Door[] doors;

void go(int speed) {
   this.speed = speed;
}

void stop() {
   this.speed = 0;
}
}

//OilCar 클래스 정의 (Car 클래스를 상속받음)
class OilCar extends Car {
int oil;



// 생성자
public OilCar() {
   this.oil = 100; // 초기값으로 100으로 설정
}
}

//Door 클래스 정의
class Door {
String name;
boolean isOpen;

Door(String name) {
   this.name = name;
   this.isOpen = false; // 초기값으로 닫힌 상태로 설정
}

void open() {
   this.isOpen = true;
   
}

void close() {
   this.isOpen = false;
  
}
}


public class 실습1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OilCar car = new OilCar();

      // Door 객체 생성 및 차량과 연결
      Door[] doors = new Door[4];
      doors[0] = new Door("운전석");
      doors[1] = new Door("조수석");
      doors[2] = new Door("운전석 뒷문");
      doors[3] = new Door("조수석 뒷문");
      car.doors = doors;

      car.doors[2].open(); // 운전석 뒷문이 열려있습니다 출력
      
      for(Door door : car.doors)
    	  if(door.isOpen)
    		  System.out.println(door.name+"이 열려있습니다");
		
		
	}

}

//Car 클래스 정의
class Car {
int speed;

void go(int speed) {
   this.speed = speed;
}

void stop() {
   this.speed = 0;
}
}

//OilCar 클래스 정의 (Car 클래스를 상속받음)
class OilCar extends Car {
int oil;
public Door[] doors;

// 생성자
public OilCar() {
   this.oil = 100; // 초기값으로 100으로 설정
}
}

//Door 클래스 정의
class Door {
String name;
boolean isOpen;

Door(String name) {
   this.name = name;
   this.isOpen = false; // 초기값으로 닫힌 상태로 설정
}

void open() {
   this.isOpen = true;
   System.out.println(this.name + "이(가) 열려있습니다.");
}

void close() {
   this.isOpen = false;
   System.out.println(this.name + "이(가) 닫혔습니다.");
}
}

//ElectricCar 클래스 정의
class ElectricCar extends Car {
int battery;
void charge(int power) {
  this.battery += power;
}
}

//HybridCar 클래스 정의
class HybridCar extends Car {
int battery;
void charge(int power) {
  this.battery += power;
}
}

public class 실습1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 테스트 코드
		ElectricCar car = new ElectricCar();
		HybridCar car2 = new HybridCar();

		car.charge(30);
		car2.charge(50);

		System.out.println("현재 배터리량 : " + car.battery);
		System.out.println("현재 배터리량 : " + car2.battery);
		
	}

}

*/