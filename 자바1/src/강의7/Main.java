package 강의7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		Person p2 = new Person();
		
		
		p1.RRN = "010512-3234567";
		
		p2.RRN = "950101-2789123";
		
		p1.showState();
		p2.showState();
		
	}

}

/*
	실습1_1 : Person p1 = new Person();
			 Person p2 = new Person();
		
			 p1.name = "홍길동";
			 p1.RRN = "750215-1234567";
		
			 p2.name = "김길동";
			 p2.RRN = "850215-1234567";
			 
			 System.out.println("이름:" + p1.name + "\t주민번호:" + p1.RRN);
			 System.out.println("이름:" + p2.name + "\t주민번호:" + p2.RRN);

	실습1_2 : Person p1 = new Person();
			 Person p2 = new Person();
		
		
			 p1.RRN = "950101-1234567";
		
			 p2.RRN = "950101-6789123";
		
			 p1.showState();
			 p2.showState();

	실습1_3 : Person p1 = new Person();
			 Person p2 = new Person();
		
		
			 p1.RRN = "010512-3234567";
		
			 p2.RRN = "950101-2789123";
			
			 p1.showState();
			 p2.showState();





*/