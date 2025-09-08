package Arrays;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class AddingOneInArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Vector<Integer> ans = new Vector<>();
        int m = arr.length;
        int carry = 1;
        for (int i = m - 1; i >= 0; i--) {
            if (arr[i] + carry <= 9) {
                ans.add(arr[i] + carry);
                carry = 0;
            } else {
                ans.add(0);
                carry = 1;
            }
        }
        if (carry == 1) ans.add(1);
        Collections.reverse(ans);
        System.out.print(ans);
    }
}

