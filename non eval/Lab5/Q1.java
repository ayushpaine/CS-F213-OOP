import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S1 = in.nextLine();
		String s = "";
		for(int i=0;i<S1.length(); i++) {
			char c = S1.charAt(i);
			if(Character.isDigit(c))
				s = s+String.valueOf(c);
		}
		int n = (s.length() == 0) ? 0 : Integer.parseInt(s);
		
		System.out.println("Octal - " + Integer.toOctalString(n));
		System.out.println("Hexadecimal = " + Integer.toHexString(n).toUpperCase());
		System.out.println("Binary - " + Integer.toBinaryString(n));
		
		if(n%2 == 0) {
			double rad = (n * Math.PI) / 180;
			System.out.println("sin("+n+") = "+Math.sin(rad));
			System.out.println("cos("+n+") = "+Math.cos(rad));
			System.out.println("tan("+n+") = "+Math.tan(rad));
		}
		else {
			System.out.println("natural log = " + Math.log(n));
			System.out.println("log base 10 = " + Math.log10(n));
		}
		
	}
	
}
