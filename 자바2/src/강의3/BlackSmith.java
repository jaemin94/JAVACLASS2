package 강의3;

public class BlackSmith {
	
	 public void repair(Repairable repairable) {
	     repairable.repair();
	        }



	public void repair(Weapon weapon) {
		// TODO Auto-generated method stub
		if(weapon instanceof Repairable)
			weapon.durability+=5;
		else
			System.out.println("수리가 불가능한 무기입니다");
	}
}

/*
	
public void repair(Repairable repairable)
{
	repairable.repaired();


}



*/