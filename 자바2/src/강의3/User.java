package 강의3;

public class User {
	 private String id;
	    private int hp;
	    Weapon weapon;

	    public User(String id, int hp, Weapon weapon) {
	        this.id = id;
	        this.hp = hp;
	        this.weapon = weapon;
	    }

	    public void attack(User target) {
	        System.out.println(id + "님이 " + target.getId() + "님을 공격하였습니다.");
	        if (weapon.getDurability() > 0) {
	            target.hit(weapon.getDamage());
	            weapon.hit();
	        } else {
	            System.out.println("내구도가 없어 데미지가 0이 들어갔습니다.");
	        }
	    }

	    public void hit(int damage) {
	        hp -= damage;
	    }

	    public String getId() {
	        return id;
	    }

	    public int getHp() {
	        return hp;
	    }

	    
	    public String toString() {
	        return "아이디 : " + id + "\t체력 : " + hp + "\t무기 : " + weapon.toString();
	    }
	
}
