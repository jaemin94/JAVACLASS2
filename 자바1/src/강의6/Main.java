package 강의6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HanoiTower ht = new HanoiTower();
		
		ht.resolve(5, 'A', 'B', 'C');
		
		
		}
		
	}



/*
	실습1_1 : Tv t = new Tv();
			 System.out.println("채널변경전 :" + t.channel);
		
			 t.channel=30;
			 System.out.println("채널변경후 :" + t.channel);
 
 	실습2_1 : MyMath math = new MyMath();
		
			 int result = math.divide(500,5)+math.add(1, 2)*math.multiply(3, 9)-math.substract(6,1);
			 System.out.println(result);
			 System.out.println(500/5+3*27-5);
 
 
 	실습2_2 : Student[] students = new Student[5];
		
			 students[0]= new Student();
			 students[1]= new Student();
			 students[2]= new Student();
			 students[3]= new Student();
			 students[4]= new Student();
		
			 System.out.println("국어 \t" + "영어 \t" + "수학 \t" + "합계 \t" + "평균");
		
			 for(Student student : students) // 향상된 for 문으로 각 객체에 값 입력
			 {
				 student.kor = (int)(Math.random()*100)+1;
				 student.eng = (int)(Math.random()*100)+1;
				 student.math= (int)(Math.random()*100)+1;
			
				 System.out.println(student.kor 
								+ "\t" +student.eng
								+ "\t" +student.math
								+ "\t" +student.getTotal()
								+ "\t" +student.getAverage());
			
			 }
 
 	실습3_1 : MyMath math = new MyMath();
		
			 float result = math.add(30.5f, 25.5f);
			
			 System.out.println(result);
		
			 double result1 = math.add(30.5, 25.5);
			 System.out.println(result1);
		
 
 	실습3_2 : MyMath math = new MyMath();
		
			 System.out.println(math.avg(32,10,320,40,10,-5,3));
			 System.out.println(math.max(32,10,320,40,10,-5,3));
			 System.out.println(math.min(32,10,320,40,10,-5,3));
 
 	실습3_3 : MyMath math = new MyMath();
		
			 long result = math.power(3, 2);
		
			 System.out.println(result);
 
 
 	
 
 
 */

