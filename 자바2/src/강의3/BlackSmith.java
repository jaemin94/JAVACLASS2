package 강의3;

public class BlackSmith {
	
	 public void repair(Repairable repairable) {
	        if (repairable instanceof Weapon) {
	            Weapon weapon = (Weapon) repairable;
	            int durability = weapon.repair();
	            System.out.println(weapon.toString() + " 내구도가 " + durability + "로 수리되었습니다.");
	        } else {
	            System.out.println("수리할 수 없는 무기입니다.");
	        }

}

	public void repair(Weapon weapon) {
		// TODO Auto-generated method stub
		
	}
}
