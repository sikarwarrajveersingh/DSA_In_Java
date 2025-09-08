package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SegregsteOfZerosAndOnes {
        public static void segregate0and1(int[] arr) {
            int i = 0, j = arr.length - 1;
            while (i < j) {
                while (i < j && arr[i] == 0) i++;
                while (i < j && arr[j] == 1) j--;
                if (i < j) {
                    int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
                    i++; j--;
                }
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean flag = false;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            segregate0and1(arr);
            System.out.println(Arrays.toString(arr)); // [0,0,0,1,1,1]
        }
}



//class Solution {
//    void segregate0and1(int[] arr) {
//        int n = arr.length;
//        int i=0, j=n-1;
//        while(i<j){
//            if(arr[i]==0) i++;
//            else if(arr[j]==1) j--;
//            else if(arr[i]==1 && arr[j]==0) {
//                arr[i]=0;
//                arr[j]=1;
//                i++;
//                j--;
//            }
//        }
//    }
//}