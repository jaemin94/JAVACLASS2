package 강의3;

public abstract class Weapon {

	
	 	int damage;
	    int durability;
	    

	    public Weapon(int damage, int durability) {
	        this.damage = damage;
	        this.durability = durability;
	    }

	    public void hit() {
	        durability--;
	    }

	    public int getDamage() {
	        return damage;
	    }

	    public int getDurability() {
	        return durability;
	    }
	    
	    public void decreaseDurability() {
	        if (durability > 0) {
	            durability--;
	        } else {
	            System.out.println("내구도가 없어 데미지가 0이 들어갔습니다.");
	        }
	    }

	    @Override
	    public String toString() {
	        return "{데미지 : " + damage + " 내구도 : " + durability + "}";
	    }
	    public void repairDurability(int amount) {
	        this.durability += amount;
	    }

		public int repair() {
			// TODO Auto-generated method stub
			return 0;
		}
	}
	

