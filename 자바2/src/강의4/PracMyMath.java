package 강의4;

public class PracMyMath {

		class CanNotAddZeroException extends RuntimeException{}
		
	int add(int a, int b)
	{
		if(a == 0 || b == 0 )
		{
			throw new CanNotAddZeroException();
		}
		return a+b;
	}
	
	
}
