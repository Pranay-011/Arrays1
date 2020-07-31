/*
sum of elements in java
 */


import java.util.Scanner;

public class SumElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;  //array declaration
        arr = new int[5];   //array initialization
        System.out.println("enter five integers for array:");
        for (int i = 0; i < arr.length; i++) {          // for loop used for user input
            arr[i] = sc.nextInt();             // user input is taken
        }
        int sum = 0;    // declared sum variable for sum of array elements
        // for loop to print sum of array elements
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum=" + sum);
        sc.close();
    }
}