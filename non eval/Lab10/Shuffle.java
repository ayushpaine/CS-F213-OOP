import java.util.*;

public class Shuffle {

	public static void main(String[] args) {
		String[] numbers = new String[13];
		for(int i=0;i<10;i++) {
			numbers[i] = String.valueOf(i+1);
		}
		numbers[10] = "J";
		numbers[11] = "Q";
		numbers[12] = "K";
		
		String[] suits = {"S", "D", "H", "C"};
		
		Vector<String> cards = new Vector<>();
		for(String number : numbers) {
			for(String suit : suits) {
				cards.add(number+suit);
			}
		}
		
		LinkedList<String> shuffled = new LinkedList<>();
		
		Random obj = new Random();
		for(int i=52;i>0;i--) {
			int loc = obj.nextInt(i);
			String s = cards.remove(loc);
			shuffled.add(s);
		}
		
		System.out.println(shuffled);
    // Splitting into four hands should not be hard
		
	}
	
}
