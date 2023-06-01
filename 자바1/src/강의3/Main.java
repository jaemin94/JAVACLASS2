package 강의3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요 ");
		int Year = scan.nextInt();
		
		if(Year %4 ==0 && Year %100!=0 || Year%400==0)
		{
			System.out.println(Year + "년은 윤년입니다.");
		}
		else 
		{
			System.out.println(Year + "년은 평년입니다.");
		}
		
	}
}



/*

	실습1_1 : Scanner scan = new Scanner(System.in);
			 System.out.println("정수를 입력하세요.");
			 int number = scan.nextInt();
		
			 if(number >= 50)
			 {
				System.out.println("50이상입니다.");
			 }
			 else
			 {
				System.out.println("50미만입니다.");
			 }

	실습1_2 : Scanner scan = new Scanner(System.in);
			 System.out.println("숫잘를 입력하세요: ");
			 String input = scan.nextLine();
		
			 int number = Integer.parseInt(input);
		
			 if(number%3 == 0)
			 {
				System.out.println("3의 배수입니다.");
			 }
			 else
			 {
				System.out.println("3의 배수가 아닙니다.");
			 }


	실습1_3 : Scanner scan = new Scanner(System.in);
			 System.out.println("숫잘를 입력하세요: ");
			 String input = scan.nextLine();
		
			 int number = Integer.parseInt(input);
		
			 if(number >= 90)
			 {
				System.out.println("A 학점입니다.");
			 }
			 else if(number < 90 && number >=80)
			 {
				System.out.println("B 학점입니다.");
			 }
			 else if(number < 80 && number >=70)
			 {
				System.out.println("C 학점입니다.");
			 }
			 else if(number < 70 && number >=60)
			 {
				System.out.println("D 학점입니다.");
			 }
			 else if(number <=59 )
			 {	 
				System.out.println("F 학점입니다.");
			 }

	실습1_4 : Scanner scan = new Scanner(System.in);
			 System.out.println("숫잘를 입력하세요: ");
			 int number1 = scan.nextInt();
			 int number2 = scan.nextInt();
			 int number3 = scan.nextInt();
		
			 int max = number1;
		
			 if(max<number2)
			 {
				max = number2;
			 }
			 else if(max<number3)
			 {
				max = number3;
			 }
			 System.out.println("최대값은 "+ max + "입니다.");
		 	 }

	실습2_1 : Scanner scan = new Scanner(System.in);
			 System.out.println("숫잘를 입력하세요: ");
			 int month = scan.nextInt();
		
			 switch(month)
			 {
			 case 3, 4, 5 : System.out.println("봄입니다.");
			 break;
			 case 6, 7, 8 : System.out.println("여름 입니다.");
			 break;
			 case 9, 10, 11 : System.out.println("가을 입니다.");
			 break;
			 case 12, 1, 2 : System.out.println("겨울 입니다.");
			 break;
			 }
		

	실습2_2 : int computer = (int)(Math.random()*3)+1;
		
			 Scanner scan = new Scanner(System.in);
			 System.out.println("가위(1) 바위(2) 보 (3) 선택하세요 : ");
			 int user = scan.nextInt();
		
			 switch(user)
			 {
			 case 1 : System.out.println("당신은 가위입니다.");
			 break;
			 case 2 : System.out.println("당신은 바위입니다.");
			 break;
			 case 3 : System.out.println("당신은 보입니다.");
			 break;
			 }
		
			 switch(computer)
			 {
			 case 1 : System.out.println("컴퓨터는 가위입니다.");
		 	 break;
		 	 case 2 : System.out.println("컴퓨터는 바위입니다.");
		 	 break;
		 	 case 3 : System.out.println("컴퓨터는 보입니다.");
		 	 break;
		 	 }
		
		 	switch(user-computer)
		 	{
			case -2,-1 : System.out.println("승리");
				break;
			case 0 : System.out.println("무승부");
				break;
			case 1,2 : System.out.println("패배");
				break;
			}
	
	실습3_1 : Scanner scan = new Scanner(System.in);
			 System.out.println("정수를 입력하세요 : ");
			 int num = scan.nextInt();
		
			 if(num>0)
			 {
				System.out.println("양수입니다");
			 }
			 else if(num<0)
			 {
				System.out.println("음수입니다");
			 }
			 else if(num==0)
			 {
				System.out.println("0입니다");
			 }
	
	실습3_2 : Scanner scan = new Scanner(System.in);
			 System.out.println("정수를 입력하세요 : ");
			 int num1 = scan.nextInt();
			 int num2 = scan.nextInt();
			 int num3 = scan.nextInt();
		
			 int mid = 0;
		 
			 if(num1<=num2 && num1>=num3)
			 {
				mid = num1;
			 }
			 else if(num2<=num1 && num2>=num3)
			 {
				mid = num2;
			 }
			 else if(num3<=num1 && num3>=num2)
			 {
				mid = num3;
			 }
			 System.out.println("중간값은 "+mid+"입니다");
			 }
	
	실습3_3 : Scanner scan = new Scanner(System.in);
			 System.out.println("년도를 입력하세요 ");
			 int Year = scan.nextInt();
		
			 if((Year%4)==0  )
			 {
				System.out.println(Year + "년은 윤년입니다.");
			 }
			 else
			 {
				System.out.println(Year + "년은 평년입니다.");
			 }

*/