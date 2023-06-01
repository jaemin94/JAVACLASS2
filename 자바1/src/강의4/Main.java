package 강의4;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int preNumber=0;
		int fibonacci=1;
		int nextNumber=1;
		
		for(int i =0;i<12;i++)
		{
			nextNumber = preNumber+fibonacci;
			
			System.out.print(fibonacci+" ");
			
			preNumber=fibonacci;
			fibonacci = nextNumber;
		}
	
}

}

/*
  
 	실습1_1 : for(int i =0; i <=5; i++)
			 {
				System.out.print(i);
			 }
			 System.out.println();
			 	for(int i =1; i <=5; i++)
			 {
				System.out.println(i);
			 }
  
  
  	실습1_2 : int sum = 0;
		
			 for(int i =1; i <=10; i++)
			 {
				sum += i;
				System.out.println
			
			 ("1부터"+i+"까지의 합 : " + sum);
			 }
		
 	실습1_3 : int max = 10;
		
			 for(int i =0; i <=10; i++)
			 {
				System.out.println(i +" " + (max-i));	
			 }

  
  	실습1_4 : for(int i =0; i <5; i++)
			 {
			 for(int j=0;j<=i;j++) 
			 {	
				System.out.print("*");	
			 }
		
			 System.out.println();
			 }
  
  	실습1_5 : int dan = 2;
			 int sum = 0;
		
			 for(int i =1; i <=9; i++)
			 {
				sum = dan * i;
				System.out.println(dan + " x " + i + " = " + sum);
			 }
  
  
  	실습1_6 : final int max = 10;
		
			 for(int i =0; i <=max; i++)
			 {
				 for(int j = 0; j <=max ; j++)
				 {
					if(i==j || max-i==j)     	// 만약 i 가 j 와 같거나 max - i 가 j 와 같으면 별을 출력하고
						System.out.print("*");	// 그게 아니면 빈칸을 출력해라
					else
						System.out.print(" ");
				 }
				System.out.println();
			 }
  
  	실습2_1 : int i = 0;
		
			 while(i<10)
			 {
				i++;
				System.out.println(i);
			 }
  
  
  	실습2_2 : Scanner scan = new Scanner(System.in);
			 System.out.println("숫자를 입력하세요");
		
			 int num = scan.nextInt();

		
			 int sum =0;
			 while(num !=0) // num 이 0이 아니면 실행
			 {
				 sum+=num%10;  // num 을 10으로 나눠 나머지를 sum 에 입력
				 System.out.println("현재 합계 : " + sum);
			
				 num/=10; // 나머지 숫자를 나누어 1의 자리를 없엔다.
			
			 }
			 System.out.println("각 자리의 합계 : "+ sum);		
		 	 }


	실습2_3 : int i =0;
			 int sum =0;
			 while(sum <=150) // num 이 0이 아니면 실행
			 {
				 sum+=i;  // num 을 10으로 나눠 나머지를 sum 에 입력
				 i++;
				 System.out.println("누적 합계 : " + sum + " 현재 숫자 : " + i);

			 }
			 
	실습3_1 : int i =0;
			 do
			 {
				 if(i%2 ==0)
				 System.out.println(i);
				 i++;
			 }
			 while(i<=10);
			 }		 


	실습3_2 : int computer = (int)(Math.random()*100)+1;
			 Scanner scan = new Scanner(System.in);
			 int user;
			 int count = 0;
		
		
			 do
			 {
				System.out.println("1~100사이의 숫자를 입력하세요 : ");
				user=scan.nextInt();
				count++;
			
				 if(user > computer)
			 {
				
				System.out.println(user + "보다 작습니다.");
				
				
			 }
				 else if(user < computer)
			 {
				 System.out.println(user + "보다 큽니다.");
				 
				 
			 }else
				System.out.println("정답입니다. "+ count + " 번 시도하였습니다.");
			 }
			 while(user != computer);
		
			 }

	실습4_1 : int isPrimeNumber;

			 for (int i = 1 ; i <= 100 ; i++) 
			 {
				 for(isPrimeNumber=2;isPrimeNumber<i;isPrimeNumber++)
					 if(i%isPrimeNumber == 0) // 1과 자기자신외에 수가 나누어 떨어진다면 더 볼것 없이 소수가 아니다.
						break;
	
				 if(i==isPrimeNumber)
					 System.out.print(i+" ");
			 }

	실습4_2 : int dan;

			 for (dan = 2 ; dan <= 9 ; dan++) 
			 {
				 for(int j = 1; j<=3; j++)
			 {
				System.out.println(dan + "X" + j + "=" + dan*j);
			
			 }
				System.out.println();
			
			 }

	실습4_3 : int preNumber=0;
			 int fibonacci=1;
			 int nextNumber=1;
		
			 for(int i =0;i<12;i++)
			 {
				nextNumber = preNumber+fibonacci;
			
				System.out.print(fibonacci+" ");
			
				preNumber=fibonacci;
				fibonacci = nextNumber;
			 }


 */



