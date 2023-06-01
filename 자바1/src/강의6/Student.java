package 강의6;

// 실습2_2
public class Student {

	String name;
	int kor;
	int eng;
	int math;
	
	int getTotal()
	{
		return kor + eng + math;
	}
	
	int getAverage()
	{
		return getTotal()/3;
	}
	
}
