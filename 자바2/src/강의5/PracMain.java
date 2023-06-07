package 강의5;




public class PracMain {

	// 실습
//	public static int count(String str, String target)
//	{
//		if (target == null || target.isEmpty())
//		{ 
//			return 0;
//		}
//		
//		int count = 0;
//		int index = 0;
//		
//		while((index = str.indexOf(target,index)) != -1)
//		{
//			count ++;
//			index += target.length();
//		}
//		
//		return count;
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PracWarrior w1 = new PracWarrior("전사1",100, new PracPoint(10,20,30));
		
		PracWarrior w2 = w1.deepcopy();
		
		System.out.println(w2.pt.toString());
	}

}
