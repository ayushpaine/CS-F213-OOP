// Write a program in Java to calculate the maximum and minimum sum of any n-1 elements of an array where n is the number of elements in the array.
// BUG This method is not working properly.
import java.util.*;

public class Q1eff {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array(n): ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int min = 0;
        int maxSum = arr[0];
        int minSum = arr[0];
        for (int i = 1; i < n; i++) {
        if (arr[i] > max) {
        max = arr[i];
        }
        if (arr[i] < min) {
        min = arr[i];
        }
        maxSum += max;
        minSum += min;
        }
        
        System.out.println("Maximum sum of any " + (n - 1) + " elements is: " + maxSum);
        System.out.println("Minimum sum of any " + (n - 1) + " elements is: " + minSum);
    }
}
