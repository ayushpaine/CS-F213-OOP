interface StackLab9{

	public void push(int val);
	public int pop();
	public int view();

}
public class FixedStack implements StackLab9{
	private int arr[];
	private int view;
	private boolean ok;
	
	public FixedStack(int ArraySize){
		view=-1;
		arr=new int[ArraySize];
	}
	
 @Override
	public void push(int val){
		view++;
		if(view == arr.length){
			ok=false;
		}
		else{
			ok=true;
			arr[view]=val;
		}
	}

 @Override
	public int pop(){
		if(view==-1){
			ok=false;
			return -1;
		}
		else{
			ok=true;
			view--;
			return arr[view+1];
		}
	}

 @Override
	public int view(){
		if(view==-1){
			ok=false;
			return -1;
		}
		else{
			ok=true;
			return arr[view];	
		}	
	}
	
	public boolean returnOk(){
		return ok;
	}
}