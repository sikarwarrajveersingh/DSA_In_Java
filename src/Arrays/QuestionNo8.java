package Arrays;

import java.util.Scanner;

public class QuestionNo8 {
    public static void main(String[] args) {

        // Linear Search

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a Target: ");
        int target = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        if (index!=-1) System.out.println("Target exist in Array at index "+index);
        else System.out.println("Target missing in Array");
    }
}
