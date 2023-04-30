package 강의3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user1 = new User("랭킹1위가자",100,new Gun(10,5));
		User user2 = new User("똥겜망해라",70,new Sword(15,10));
		User user3 = new User("똥겜망해라2",70,new Punch(2,1));
		
		
		
		
		user1.attack(user2);
		user1.attack(user2);
		user1.attack(user2);
		user1.attack(user2);
		user3.attack(user2);
		user3.attack(user2);
		
		System.out.println(user1.toString());
		System.out.println(user2.toString());
		System.out.println(user3.toString());
		
		BlackSmith bm = new BlackSmith();
		
		bm.repair(user1.weapon);
		System.out.println(user1.toString());
		
		bm.repair(user2.weapon);
		System.out.println(user2.toString());
		
		bm.repair(user3.weapon);
		System.out.println(user3.toString());
	}

}




/*
	public static void 실습1(String[] args) {
		// TODO Auto-generated method stub

		ShoppingBasket shopping = new ShoppingBasket();
		
		shopping.addItem(new Sofa(1,"샤넬쇼파",25000));
		shopping.addItem(new Sofa(2,"푹신한소파",25000));
		shopping.addItem(new Tv(3,"삼성 QLED",10000));
		shopping.addItem(new Bicycle(1,"빠른자전거",5000));
		
		
		System.out.println(shopping.getInfoList());
		
		System.out.println("합계 :" + shopping.getTotalPrice());
		System.out.println("예상 적립 마일리지:" + shopping.getTotalMileage());
		
	}


*/