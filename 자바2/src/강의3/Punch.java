package 강의3;

public class Punch extends Weapon{

	 public Punch(int damage, int durability) {
	        super(damage, durability);
	    }

	    public void attack() {
	        System.out.println("Punching with " + getDamage() + " damage");
	    }
	
}
