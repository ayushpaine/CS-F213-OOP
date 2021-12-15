// Write a program in Java to calculate the maximum and minimum sum of any n-1 elements of an array where n is the number of elements in the array.

import java.util.*;

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array(n): ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int maxSum = 0;
        int minSum = 0;
        // max of array
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // min of array
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            maxSum += arr[i];
            minSum += arr[i];
        }
        maxSum -= min;
        minSum -= max;
        System.out.println("Maximum sum of any " + (n - 1) + " elements is: " + maxSum);
        System.out.println("Minimum sum of any " + (n - 1) + " elements is: " + minSum);
    }
}
