package 강의2;

public class PracPeople {

	public String name;
	public int age;
	protected String RRN;
	public String gender;
	
	
	PracPeople(String name,int age, String RRN, String gender)
	{
		this.name = name;
		this.age = age;
		this.RRN = RRN;
		this.gender = gender;
		
	}
	
	public String toString()
	{
		return "이름: " + name + " 나이: " + age + " 주민번호: " + RRN + " 성별: " + gender;	
	}
}
