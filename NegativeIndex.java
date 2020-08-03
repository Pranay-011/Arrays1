

import java.util.Scanner;

public class NegativeIndex {
    public static void main(String[] args) {
        // SCANNER CLASS OBJECT IS DECLARED
        Scanner sc = new Scanner(System.in);
        //INITIALIZING THE ARRAY

        int[] arr;
        // OUTPUT MESSAGE TO INPUT VALUES
        System.out.println("enter the values for the array:");
        // VALUES ARE INPUTTED
        arr = new int[5];
        // NEGATIVE INDEX IS PRINTED
        System.out.println(arr[-1]);
        // SCANNER CLOSE
        sc.close();

    }
}
/* ERROR WILL OCCUR:
 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 5
	at NegativeIndex.main(NegativeIndex.java:12)
 */