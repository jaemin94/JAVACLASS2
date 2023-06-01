package 강의2;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fahr = 100;
		float cel = (float)((5.0 / 9.0) * (fahr -32));
		
		System.out.println(cel);
	}

}


/*

	실습1_1 : final float PI = (float) 3.14;
			 float result = (float) (2*1.5*PI);
		
			 System.out.println(result);


	실습1_2 : int a = 1000000;
			 int b = 2000000;
			 long c = (long)a*b;
			
			 System.out.println(c);
			 
	실습1_3 : char a = '3';
			 int b = a-48;
		
			 System.out.println(b);
			 
			 
	실습1_4 : char ch;
		
			 Scanner scan = new Scanner(System.in);
			 System.out.println("값을 입력하세요 : ");
			 String answer = scan.nextLine();
			 ch = answer.charAt(0);
						
			 System.out.println(ch>='A' && ch<='Z');

	실습1_5 : int people = 65;
			 int carPassengers =4;
		
			 System.out.println(people%4 == 0 ? people/4 : people/4+1 );


	실습2_1 : int num = 4556;
		
			System.out.println((num/100)*100);
			
			
	실습2_2 : int num = 30;
		
			 if(num%2==0)
			 {
				System.out.println(num + "은 짝수입니다.");
			 }
			 else
			 {
				System.out.println(num + "은 홀수입니다.");
			 }		


	실습2_3 : char ch;
		
			 Scanner scan = new Scanner(System.in);
			 System.out.println("값을 입력하세요 :");
			 String input = scan.nextLine();
			 ch = input.charAt(0);
		
			 System.out.println(ch>='A' && ch<='Z' ? (char)(ch+('a'-'A')):ch);
			 
			 
	실습2_4 : int fahr = 100;
			 float cel = (float)((5.0 / 9.0) * (fahr -32));
		
			 System.out.println(cel);
	}
	
	
*/