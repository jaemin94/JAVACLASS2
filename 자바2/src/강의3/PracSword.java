package 강의3;

public class PracSword extends PracWeapon implements PracRepairable{

	public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
	
	public int repair() 
	{
		return durability ++;
	}
	
	public void repair(int amount) {
    	setDurability(getDurability() + 1);
        System.out.println("칼의 내구도를 1 회복하였습니다.");
    }
	
	PracSword(int damage, int durability)
	{
		super(damage,durability);
	}
	
}
