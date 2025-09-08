package Arrays;

import java.util.Scanner;

public class missingNoInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        long k = n + 1;
        long sum = k*(k+1)/2;
        long arraySum = 0;
        for (int ele : arr) {
            arraySum += ele;
        }
        System.out.println((int)(sum - arraySum));
    }
}
