package 강의7;

import java.util.Calendar;

public class Person {

	String name;
	String RRN;
	
	Person()
	{
		
	}
	
	void showState()
	{
		System.out.println("이름:"+ name + "\t주민번호:" + RRN + "\t성별:" + getGender()+ "\t나이:" + getAge());
	}
	String getGender()
	{
		String gender = RRN.substring(7,8);
		
		switch(gender)
		{
		case "0", "2", "4", "6", "8": gender="F";
		break;
		case "1", "3", "5", "7", "9" : gender="M";
		break;
		}
		return gender;
	}
	
	int getAge()
	{
		Calendar cal = Calendar.getInstance();
		
		int nowYear = cal.get(Calendar.YEAR);
		int nowMonth = cal.get(Calendar.MONTH)+1;
		int nowDay = cal.get(Calendar.DAY_OF_MONTH);
				
				//년도 뒷자리 2개를 가져온다.
				int year = Integer.parseInt(RRN.substring(0,2));
				
				//성별을 가져온다. 성별의 숫자에 따라 태어난 년도가 결정되기에 필요하다.
				String generation = RRN.substring(7,8);
				
				switch(generation)
				{
					case "0","9":
						year +=1800;
						break;
					case "1","2","5","6":
						year +=1900;
						break;
					case "3","4","7","8":
						year +=2000;
						break;
				}
				
				int bornMonth = Integer.parseInt(RRN.substring(2,4));
				
				int bornDay = Integer.parseInt(RRN.substring(4,6));

				int bornYear = nowYear - year-(nowMonth>= bornMonth && nowDay>= bornDay ? 0 : 1);
					
				return bornYear;
	}
}
