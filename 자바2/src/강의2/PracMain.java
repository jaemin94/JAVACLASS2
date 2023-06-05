package 강의2;

public class PracMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PracServerConnection con = PracServerConnection.getInstance();
		
		PracServerConnection con1 = PracServerConnection.getInstance();
		PracServerConnection con2 = PracServerConnection.getInstance();
		PracServerConnection con3 = PracServerConnection.getInstance();
		
		System.out.println(con);
		System.out.println(con1);
		System.out.println(con2);
		System.out.println(con3);
	
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