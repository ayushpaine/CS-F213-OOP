import java.util.*;

public class Lab08 {

	public static void main(String[] args) {
		

		int arr[]= {1,2,3};
		
		IntStack obj1=new IntStackImplementation(arr);
		IntStack obj2=new IntStackImplementation();
		
		for (int i=1;i<=10;i++) obj1.push(i+3);
		
		myAssert("13 12 11 10 9 8 7 6 5 4 3 2 1",obj1.toString());
		myAssert(13,obj1.size());
		
		
		for (int i=1;i<=5;i++) obj2.push(i);
	
		for (int i=5;i>=1;i--)
			myAssert(i,obj2.pop());
		
		myAssert(-9999,obj2.pop());
		
		myAssert(0,obj2.size());
	}
	
	 private static void myAssert(String expected, String actual)
		{
			   if (expected.equals(actual)) print("PASS");
			   else print("ERROR! expected: " + expected + ", actual: " + actual);
		}
	 
	 private static void myAssert(int expected, int actual)
		{
			   if (expected==actual) print("PASS");
			   else print("ERROR! expected: " + expected + ", actual: " + actual);
		}
	 
	 
	private static void print(String stringToPrint) 
	 {
			   System.out.println(stringToPrint);
	}

}

interface IntStack {
	public void push(int e);
	public int pop();
	public int size();
}

class IntStackImplementation implements IntStack {

	Stack<Integer> stack;
	
	public IntStackImplementation() {
		stack = new Stack<>();
	}
	
	public IntStackImplementation(int[] arr) {
		stack = new Stack<>();
		addElements(arr);
	}

	private void addElements(int[] arr) {
		for(int e : arr) {
			stack.push(e);
		}
	}

	@Override
	public void push(int e) {
		stack.push(e);	
	}

	@Override
	public int pop() {
		return (size() <= 0) ? -9999 : stack.pop();
	}

	@Override
	public int size() {
		return stack.size();
	}
	
	@Override
	public String toString() {
		String str = "";
		
		Iterator<Integer> itr = stack.listIterator();

		while(itr.hasNext())
			str = itr.next() + " " + str;
		
		return str.trim();
	}
	
}