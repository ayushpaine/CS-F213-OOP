import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s1 = in.nextLine();
		String s = in.nextLine();
		
		StringBuilder builder = new StringBuilder("");
		
		int k=0;
		
		int loc = s1.indexOf(s);
		if(loc == -1) {
			builder.append(shift(s1, k));
			System.out.println(builder);
			return;
		}
		String sub = s1.substring(0, loc);
		builder.append(shift(sub, k));
		s1 = s1.substring(loc);
		
		while(true) {
			k++;
			loc = s1.substring(1).indexOf(s) + 1;
			if(loc == 0) {
				builder.append(shift(s1, k));
				break;
			}
			sub = s1.substring(0, loc);
			builder.append(shift(sub, k));
			s1 = s1.substring(loc);
		}
		
		System.out.println(builder);
	}

	private static String shift(String str, int k) {
		StringBuilder builder = new StringBuilder("");
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			int x = (int)c;
			x -= (Character.isUpperCase(c)) ? 'A' : 'a';
			x += k;
			x %= 26;
			x += (Character.isUpperCase(c)) ? 'A' : 'a';
			c = (char)x;
			builder.append(c);
		}
		return builder.toString();
	}
	
}
