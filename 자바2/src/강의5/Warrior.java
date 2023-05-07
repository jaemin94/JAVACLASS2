package 강의5;

public class Warrior implements Cloneable{

	String id;
	int hp;
	Point pt;
	
	
	Warrior(String id, int hp, Point pt)
	{
		this.id = id;
		this.hp = hp;
		this.pt = pt;
	}

	public Warrior clone()
	{
		Object result = null;
		try
		{ 
			result = (Warrior)super.clone();
		}
		catch(CloneNotSupportedException ex)
		{
			System.out.println(ex);
		}
		return (Warrior)result;
	}
	
	public Warrior deepCopy()
	{
		Warrior result = this.clone();
		
		result.pt = new Point(pt.x,pt.y,pt.z);
		
		return result;
	}
	
	
}
