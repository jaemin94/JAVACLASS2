package 강의6;

public class PracMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PracMyStack<String> stack = new PracMyStack<>();
		
		stack.push("1번");
		stack.push("2번");
		stack.push("3번");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}


/*
	실습1_1 : PracPeople p1 = new PracPeople();
		
			 p1.hobby = PracPeople.Hobby.Baseball;
		
			 System.out.println(p1.hobby);
	 

















*/