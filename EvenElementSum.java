/*
SUM OF EVEN ELEMENTS IN AN ARRAY
 */

import java.util.Scanner;

public class EvenElementSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // DECLARING ARRAY

        int[] arr;

        // INITIALIZING ARRAY

        arr = new int[10];
        System.out.println("enter values for array:");

        int sum = 0;
        // FOR LOOP TO INPUT VALUES FOR ARRAY

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println("sum =" + sum);

        sc.close();
    }
}