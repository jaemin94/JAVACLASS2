package 강의2;

public class PracMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PracPeople[] p1 = new PracPeople[5];
		
		PracTime t = new PracTime();
		
		t.setHour(30);
		System.out.println(t.hour);
		
		System.out.println(t.toString());
		
		t.setHour(20);
		System.out.println(t.toString());
		
		t.setMinute(-50);
		System.out.println(t.toString());
		
		t.setMinute(50);
		System.out.println(t.toString());
	
	}
	
	

}
/*
		PracPeople[] p1 = new PracPeople[5];
		
		p1[0] = new PracPeople("홍길동1",25,"000025-3456789","남자");
		p1[1] = new PracPeople("홍길동2",30,"950025-1456789","남자");
		p1[2] = new PracPeople("홍길동3",25,"000025-4456789","여자");
		p1[3] = new PracPeople("홍길동4",25,"000025-2456789","여자");
		p1[4] = new PracPeople("홍길동5",25,"000025-2456789","여자");

		for(PracPeople p : p1)
		{
			System.out.println(p.toString());
		}














*/