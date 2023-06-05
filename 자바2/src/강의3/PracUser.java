package 강의3;

public class PracUser {

	PracWeapon weapon;
	String id;
	int hp;
	
	PracUser(String id, int hp, PracWeapon weapon)
	{
		this.id = id;
		this.hp = hp;
		this.weapon = weapon;
	}
	
	public String getId() {
        return id;
    }

    public int getHp() {
        return hp;
    }
	
	public void hit(int damage) {
        hp -= damage;
    }
	
	void attack(PracUser target)
	{		
		System.out.println(id + "님이 " + target.getId() + "님을 공격하였습니다.");
        if (weapon.getDurability() > 0) {
            target.hit(weapon.getDamage());
            weapon.hit();
        } else {
            System.out.println("내구도가 없어 데미지가 0이 들어갔습니다.");
        }
	}
	
	public String toString()
	{
		return "아이디: "+ id + " 체력: " + hp + weapon.toString();
	}
}
