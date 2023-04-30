package 강의3;

public class Gun extends Weapon implements Repairable{

	
	
	 public Gun(int damage, int durability) {
	        super(damage, durability);
	        
	    }

	    public int getdurability() {
	        return durability;
	    }

	    public void setdurability(int durability) {
	        this.durability = durability;
	    }

	    public void attack() {
	        if (durability > 0) {
	            System.out.println("Firing gun with " + getDamage() + " damage");
	            durability--;
	        } else {
	            System.out.println("Out of ammo!");
	        }
	    }

	    public void repair(int amount) {
	    	setdurability(getDurability() + 1);
	        System.out.println("총의 내구도를 1 회복하였습니다.");
	    }
	    public int repair() {
	        durability += 10;
	        return durability;
	    }
	 
}

