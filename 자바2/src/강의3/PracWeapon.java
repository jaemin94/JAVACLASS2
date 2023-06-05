package 강의3;

public abstract class PracWeapon {
	
	int damage;
	int durability;
	
	
	PracWeapon(int damage, int durability)
	{
		this.damage = damage;
		this.durability = durability;
	}
	
	public int getDamage() {
        return damage;
    }
	
	public void hit()
	{
		durability--;
	}
	
	public int getDurability()
	{
		return durability;
	}
	
	public void repairDurability(int amount) {
        this.durability += amount;
    }
	
	public void decreaseDurability() {
        if (durability > 0) {
            durability--;
        } else {
            System.out.println("내구도가 없어 데미지가 0이 들어갔습니다.");
        }
    }
	
	public int increaseDurability()
	{
		durability++;
		return durability;
	}
	
	public String toString()
	{
		return " 무기: { 데미지: " + damage + " 내구도: " + durability + "}" ; 
	}
	
}
