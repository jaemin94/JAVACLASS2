package 강의3;

public class Sword extends Weapon implements Repairable{
	
	
	public Sword(int damage, int durability) {
        super(damage, durability);
       
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void attack() {
        System.out.println("Swinging sword with " + getDamage() + " damage");
        durability--;
    }

    public void repair(int amount) {
    	setDurability(getDurability() + 1);
        System.out.println("칼의 내구도를 1 회복하였습니다.");
    }
    
    public int repair() {
        durability += 10;
        return durability;
    }
}

