package 강의6;

import java.util.List;
import java.util.ArrayList;


public class MyStack<T> {
	private List<T> stack;

	public MyStack()
	{
		this.stack = new ArrayList<>();
	}
	
	
	public void push(T value)
	{
		stack.add(value);
	}
	
	public T pop()
	{
		if(stack.isEmpty())
		{
			throw new RuntimeException();
		}
		//T value = stack.get(stack.size()-1;
		return stack.remove(stack.size() - 1);
	}
	
}

//if(stack.isEmpty())
//{
//	throw new EmptyStackException();
//}