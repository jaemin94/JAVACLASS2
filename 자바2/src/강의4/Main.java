package 강의4;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;


public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\User\\Desktop\\자바2\\깃허브\\JAVACLASS2\\자바2\\src\\강의4\\Test");
		
		try(FileReader fileReader = new FileReader(file))
		{
			int fileContent =0;
			while((fileContent = fileReader.read())!= -1)
		{
			System.out.print((char)fileContent);
		}
		}
		catch(Exception ex)
		{
			
		}
}
}

/*
public static void 실습1_1(String[] args) {
// TODO Auto-generated method stub

try {
int[] list = new int[5];

for (int i=0 ; i<=5; i++)
	list[i] = i;

System.out.println(list);
}

catch(RuntimeException ex)
{
	System.out.println(ex);
}




}

public static void 실습1_2(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        int answer = (int) (Math.random() * 100) + 1;

       
	
        while (true) {
            try {
                System.out.print("1 ~100 사이의 값을 입력하세요: ");
                int guess = scanner.nextInt();

                if (guess == answer) {
                    System.out.println("정답입니다");
                    break;
                } else if (guess < answer) {
                    System.out.println("더 높은 수를 입력하세요");
                } else {
                    System.out.println("더 작은 수를 입력하세요");
                }
            } catch (InputMismatchException e) {
                System.out.println("비정상적인 값입니다. 다시 입력하세요");
                scanner.nextLine(); // clear the input buffer
            }
        }
        
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;
        int count = 0;
        
        do 
        {
        	count++;
        	System.out.print("1~100 사이의 값을 입력하세요 :");
        	
        	try
        	{
        		input = new Scanner(System.in).nextInt();
        	}
        	catch(java.util.InputMismatchException e)
        	{
        		System.out.println("비정상적인 값입니디ㅏ. 다시 입력하세요");
        		continue;
        	}
        	
        	if(answer > input)
        		System.out.println("더 큰 수를 입력하세요");
        	else if(answer < input)
        		System.out.println("더 작은 수를 입력하세요");
        		
        }
        while(answer!=input);
        System.out.println("정답입니다.")
        System.out.println(count +"번 만에 맞췄습니다.")
        }
}


public static void test(boolean isThrowYn) throws Exception
	{
		try
		{
			System.out.print(1);
			if(isThrowYn)
			{
				throw new NullPointerException();
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

	public static void 실습1_3(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			test(false);
			test(true);
		}
		catch(Exception ex)
		{
			System.out.println(7);
		}
        
        
}
}

public static void 실습2_2(String[] args) {
		// TODO Auto-generated method stub

		try {
		
		MyMath m = new MyMath();
		
		m.minus(10, 0);
		}
		
		catch(MyMath.CanNotMinusZeroException ex1)
		{
			
		}
		catch(Exception ex)
		{
			
		}
		
}

*/