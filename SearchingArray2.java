import java.util.Scanner;

public class SearchingArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int number;
        System.out.println("enter a test number:");
        number = sc.nextInt();
        int[] arr = new int[5];
        System.out.println("enter five numbers for array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == number) {
                flag = true;
            } else {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("number found");
        } else {
            System.out.println("number not found");
        }
        sc.close();
    }
}