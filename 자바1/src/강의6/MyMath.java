package 강의6;

// 실습2_1
public class MyMath {

	int add(int x, int y)
	{
		int result = x + y;
		return result;
	}
	
	float add(float x, float y)
	{
		float result = x + y;
		return result;
	}
	double add(double x, double y)
	{
		double result = x + y;
		return result;
	}
	
	int substract(int x, int y)
	{
		int result = x - y;
		return result;
	}
	
	int multiply(int x, int y)
	{
		int result = x * y;
		return result;
	}
	
	int divide(int x, int y)
	{
		int result = x / y;
		return result;
	}
	
	int avg(int...n)
	{
		int sum =0;
		for(int i : n)
			sum +=i;
		
		return sum/n.length;
	}
	
	int max(int...n)
	{
		int max = n[0];
		
		for(int i : n)
			if(max<i)
				max=i;
		
		return max;
	}
	
	int min(int...n)
	{
		int min = n[0];
		
		for(int i : n)
			if(min>i)
				min=i;
		
		return min;
	}
	
	long power(long x , long n)
	{
		if(n ==1)			// 재귀호출
			return x;
		
		
		return x*power(x,n-1);
	}
	
}
