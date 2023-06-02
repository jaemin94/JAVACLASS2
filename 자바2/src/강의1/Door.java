package 강의1;

public class Door{

	String name;
	boolean isOpen = false;
	
	void open()
	{
		if(isOpen == true)
			System.out.println(name + "이 열려 있습니다.");
		else
		this.isOpen = true;
		System.out.println(name + "이 열습니다.");
	}
	
	void close()
	{
		if(isOpen == false)
			System.out.println(name + "이 닫혀 있습니다.");
		else
			this.isOpen = false;
		System.out.println(name + "이 닫혀습니다.");
	}
}
