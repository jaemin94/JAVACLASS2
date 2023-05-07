package 강의6;

import javax.swing.JOptionPane;

public class Main {

	
	
	public static void main(String[] args){
		
		
		Thread th = new Thread(new MyThread());
		th.setDaemon(true);
		th.start();
		String input = JOptionPane.showInputDialog("값을 입력하세요");
		
	
}
}



/*
  	public class Main {

	public static void 실습1_1(String[] args) {
		// TODO Auto-generated method stub

		People p1 = new People();
		
		p1.hobby = People.HOBBY.baseball;
		
		System.out.println(p1.hobby);
	}

}

public class Main {

	public static void 실습1_2(String[] args) {
		// TODO Auto-generated method stub

		MyStack<String> stack = new MyStack<>();
		
		stack.push("1번");
		stack.push("2번");
		stack.push("3번");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}

public class Main {

	
	
	public static void 실습 2_1(String[] args) throws Exception {
		
		new Thread(new Runnable()
		{
		try
		{
			for(int i =0; i<=10;i++)
			{
				Thread.sleep(10);
				System.out.println(i);
			}
		}
		catch (Exception e)
		{
			
		}
		
		
		Thread th = new Thread(new MyThread());
		th.start();
		String input = JOptionPane.showInputDialog("값을 입력하세요");
		
	}

}


public class Main {

	
	
	public static void 실습2_2(String[] args){
		
		
		Thread th = new Thread(new MyThread());
		th.setDaemon(true);
		th.start();
		String input = JOptionPane.showInputDialog("값을 입력하세요");
		
	
}
}
 
 */
