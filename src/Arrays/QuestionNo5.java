package Arrays;

public class QuestionNo5 {

    // Found element in array

    public static void main(String[] args) {
       int[] arr = {10, 3, 2, 5, 40, 7, 8};
       int x = 5;
       int count = 0;
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] > x) {
               count++;
           }
       }
        System.out.println("Total elements: " +count);
    }
}
