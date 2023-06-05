package 강의3;

public class PracGun extends PracWeapon implements PracRepairable{

	public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
    
    public void repair(int amount) {
    	setDurability(getDurability() + 1);
        System.out.println("칼의 내구도를 1 회복하였습니다.");
    }
	
	public int repair() 
	{
		return durability ++;
	}
	
	PracGun(int damage, int durability)
	{
		super(damage,durability);
	}
	
	
}
