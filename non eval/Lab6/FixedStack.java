interface StackLab9 {

	public void push(int val);
	public int pop();
	public int view();

}


public class FixedStack implements StackLab9 {
	
	private int[] arr;
	private int view;
	private boolean ok;
	
	public FixedStack(int ArraySize) {
		arr = new int[ArraySize];
		view = -1;
		ok = false;
	}
	
	public void push(int val) {
		if(view == arr.length-1) {
			ok=false;
		}
		else {
			ok=true;
			arr[++view] = val;
		}
	}
	
	public int pop() {
		if(view == -1) {
			ok=false;
			return -1;
		}
		ok=true;
		return arr[view--];
	}
	
	public int view() {
		if(view == -1) {
			ok=false;
			return -1;
		}
		ok=true;
		return arr[view];
	}
	
	public boolean returnOk() {
		return ok;
	}
	
}
