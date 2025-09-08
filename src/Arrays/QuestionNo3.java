package Arrays;

import java.util.Scanner;

public class QuestionNo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your element: ");
        int n = sc.nextInt();
        boolean flag = false;
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Element Found: " + n);
        } else {
            System.out.println("Element Not Found");
        }
    }
}
