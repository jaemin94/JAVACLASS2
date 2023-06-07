package 강의5;

public class PracWarrior {

	String id;
	int hp;
	PracPoint pt;
	
	PracWarrior(String id, int hp, PracPoint pt)
	{
		this.id = id;
		this.hp = hp;
		this.pt = pt;
	}
	
	public PracWarrior clone()
	{
		Object result = null;		
		try
		{
			result = super.clone();
		}
		catch(CloneNotSupportedException ex)
		{
			System.out.println(ex);
		}
		return (PracWarrior)result;
	}
	
	public PracWarrior deepcopy()
	{
		PracWarrior result = this.clone();
		
		result = new PracWarrior(this.id, this.hp, this.pt);
		
		return result;
	}
	
}
