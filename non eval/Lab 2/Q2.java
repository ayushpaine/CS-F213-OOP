// Aditi wants to distribute a (X) number of chocolates to a fixed number of children such that every child gets at least one chocolate and every child gets a different number of chocolates. Find out what is the maximum number of children that can be given chocolates. 
//

import java.util.*;

public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of chocolates(X): ");
        int X = sc.nextInt(); // should be >= 1
        int children = 0;
        while (X >= 0) {
            children++;
            X = X - children;
        }        
        System.out.print("Max number of children(Output): " + (children-1));
    }
}
