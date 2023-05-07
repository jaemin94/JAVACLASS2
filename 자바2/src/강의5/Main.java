package 강의5;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box<String> box = new Box<>();
		Box<Integer> box2 = new Box<>();
		
		box.setItem("가나다라");
		 
		 System.out.println(box.getItem());
		 

		
		
	}


	}




/*
 * public class Main {

	public static void 실습1_1(String[] args) {
		// TODO Auto-generated method stub

		
		Point pt1 = new Point(10,20,30);
		
		Point pt2 = new Point(10,20,40);
		
		System.out.println(pt1.equals(pt2));
		
		System.out.println(pt1.toString());
	}

}

public static int count(String str, String target)
	{
		if (target == null || target.isEmpty())
		{ 
			return 0;
		}
		
		int count = 0;
		int index = 0;
		
		while((index = str.indexOf(target,index)) != -1)
		{
			count ++;
			index += target.length();
		}
		
		return count;
	}
	

	public static void 실습1_2(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcdefgab";
		
		System.out.println(count(str,"ab"));
		
	}


	}

public static void 실습1_3(String[] args) {
		// TODO Auto-generated method stub

		Warrior w1 = new Warrior("전사1", 100, new Point(10,20,30));
		
		Warrior w2 = w1.deepCopy();
		
		System.out.println(w2.pt.toString());
		
		
	}


	}

public static void 실습2_1(String[] args) {
		// TODO Auto-generated method stub

		String date = "20190311";
		
		Calendar cal = Calendar.getInstance();
		cal.set(2019,Calendar.MARCH,11);
		System.out.print(cal.get(Calendar.YEAR)+"-");
		System.out.print(cal.get(Calendar.MONTH)+1+"-");
		System.out.print(cal.get(Calendar.DATE));
		
		cal.set(Integer.parseInt(date.substring(0,4))
				,(Integer.parseInt(date.substring(4,6))-1
				,(Integer.parseInt(date.substring(6,8)));
				
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()));
	}


	}


	public class Main {
	
	
	 public static int getRandom(int from, int to)
	 {
		 return (int)(Math.random()
				 *(Math.abs(to-from)+1))
				 + Math.min(from, to);
	 }
	

	public static void 실습2_2(String[] args) {
		// TODO Auto-generated method stub

		 for(int i=0; i<10;i++)
			 System.out.print(getRandom(-5,10)+",");

		
		
	}


	}

*/
