package 강의3;

public class PracMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 PracUser user1 = new PracUser("랭킹1위가자",100,new PracGun(10,5));

		 PracUser user2 = new PracUser("똥겜망해라",70,new PracSword(15,10));
	
		 user1.attack(user2);
		 user1.attack(user2);
		 user1.attack(user2);
		 user1.attack(user2);
		 user1.attack(user2);
		 user1.attack(user2);

		 System.out.println(user1.toString());
		 System.out.println(user2.toString());
		
		
		PracBlackSmith bm = new PracBlackSmith();
		
		bm.repair(user1.weapon);
		System.out.println(user1.toString());
		
		bm.repair(user2.weapon);
		System.out.println(user2.toString());
	}

}


/*
	실습1_2 : PracShoppingBasket sb = new PracShoppingBasket();
		
			 sb.addItem(new PracTv(1,"삼성50인치",0));
			 sb.addItem(new PracSofa(2,"푹신한소파",23));
			 sb.addItem(new PracTv(3,"천리마 자전거",100));
		
			 System.out.println(sb.getInfoList());
	
	실습1_3 : PracShoppingBasket sb = new PracShoppingBasket();
		
			 sb.addItem(new PracTv(1,"삼성50인치",10000));
			 sb.addItem(new PracSofa(2,"푹신한소파",25000));
			 sb.addItem(new PracSofa(3,"샤넬소파",25000));
			 sb.addItem(new PracTv(1,"천리마 자전거",5000));
		
			 System.out.println(sb.getInfoList());
			 
			 System.out.println("합계: " + sb.getTotalPrice());
			 System.out.println("예상 적립 말일리지: " + sb.getTotalMileage());

	
	실습2_1 : PracUser user1 = new PracUser("랭킹1위가자",100,new PracGun(10,5));

			 PracUser user2 = new PracUser("똥겜망해라",70,new PracSword(15,10));
		
			 user1.attack(user2);
			 user1.attack(user2);
			 user1.attack(user2);
			 user1.attack(user2);
			 user1.attack(user2);
			 user1.attack(user2);

			 System.out.println(user1.toString());
			 System.out.println(user2.toString());









*/