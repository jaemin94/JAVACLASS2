package 강의6;

import java.util.ArrayList;
import java.util.List;

public class PracMyStack<T> {

	private List<T> stack;

	public PracMyStack()
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
