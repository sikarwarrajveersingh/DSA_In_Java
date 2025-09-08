package Arrays;

import java.util.Scanner;

public class SumAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        int sum = 0;
//        int num = 1;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//            num *= arr[i];
//        }
//        System.out.println("Sum of array: "+sum);
//        System.out.print("Product of array: "+num);


        // For Max Value
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) max = arr[i];
//        }
//        System.out.println(max);

        // For Min Value

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        System.out.println(min);
    }
}
