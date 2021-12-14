import java.lang.reflect.Array;

public class CustomStack<E> {
	int size;
	int top = -1;
	
	E[] arr;
	
//	@SuppressWarnings("unchecked")
	public CustomStack(int size) {
		this.size = size;
		arr = null;
	}
	
	@SuppressWarnings("unchecked")
	public boolean push(E element) {
		if(arr == null)
			arr = (E[]) Array.newInstance(element.getClass(), size);
		if(top == arr.length-1) {
			System.out.println("Stack full");
			return false;
		}
		arr[++top] = element;
		return true;
	}
	
	public boolean pop() {
		if(size() == 0) {
			System.out.println("Stack underflow");
			return false;
		}
		top--;
		return true;
	}
	
	public E top() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public int size() {
		return top+1;
	}
	
	public void display() {
		System.out.println("Stack contents:");
		for(int i=0;i<size();i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		CustomStack<Integer> s = new CustomStack<>(5);
		s.push(10);
		s.push(20);
		
		s.display();
		s.pop();
		s.display();
		s.pop();
		s.pop();
		s.display();
	}
	
}
