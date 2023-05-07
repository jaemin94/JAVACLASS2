package 강의6;

public class MyThread implements Runnable{

	@Override
	public void run() {
		
		try
		{
			for(int i =0; i<=1000;i++)
			{
				Thread.sleep(1000);
				System.out.println(i);
			}
		}
		catch (Exception e)
		{
			
		}
	}

}
