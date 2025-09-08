package Arrays;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
          //Output Array
//        int[] arr = {5, 23, 21, 65, -54, -23};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

        int rv[] = new int[5];
        // Default values
//        for (int i = 0; i < rv.length; i++) {
//            System.out.print(rv[i]+" ");
//        }

        // Taking Input

        for (int i = 0; i < rv.length; i++) {
            rv[i] = sc.nextInt();
        }

        // Print Array
        for (int i = 0; i < rv.length; i++) {
            System.out.print((rv[i])*2+" ");
        }
    }
}
