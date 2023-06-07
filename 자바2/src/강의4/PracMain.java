package 강의4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PracMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\Administrator\\Desktop\\임베디드_이재민\\JAVACLASS\\JAVACLASS2\\자바2\\src\\강의4\\Test");
		
		try {
			FileReader fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
		

}

/*
	실습1_1 : int[] list = new int[5];
		
			 try
			 {
			 for(int i = 0; i <= 5; i ++)
			 {
				list[i] = i;
			 }
			 }
			 catch(Exception ex)
			 {
			
			 }
			 System.out.println(list);


	실습1_2 : int answer = (int)(Math.random()*100)+1;
			
			 while(true)
			 {	
			
				 try
				 {
					System.out.println("1 ~ 100 사이의 값을 입력하세요 : ");
					int input = new Scanner(System.in).nextInt();
			
				 if(input == answer)
				 {
					System.out.println("정답입니다");
					break;
			
				 }
				 else if(input > answer)
				 {
					System.out.println("더 작은수를 입력하세요.");
				
				 }
				 else
				 {
					System.out.println("더 큰수를 입력하세요.");
				
				 }
				 }
			 catch(InputMismatchException ex)
			 {
				System.out.println("비정상적인 값입니다. 다시 입력하세요");
			 }
			 }

	실습1_3 : public class PracMain {
	
		 public static void test(boolean isThrowYn)
		 {
			 try
			 {
				 System.out.print(1);
				 if(isThrowYn)
				 {
					throw new RuntimeException();
				 }
			
				 System.out.print(2);
			
				 throw new Exception();
			 }
			 catch(RuntimeException ex)
			 {
				 System.out.print(3);
			 }
			 catch(Exception ex)
			 {
				 System.out.print(4);
			 }
			 finally
			 {
				 System.out.print(5);
			 }
			 System.out.print(6);
		
		 }

	 	public static void main(String[] args) {
			 // TODO Auto-generated method stub

			 try
			 {
			 	test(false);
			 	test(true);
		 	}
		 	catch(Exception ex)
		 	{
			 	System.out.print(7);
		 	}











*/
