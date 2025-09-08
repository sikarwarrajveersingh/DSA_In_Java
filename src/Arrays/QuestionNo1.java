package Arrays;

public class QuestionNo1 {
    public static void main(String[] args) {
        int[] arr = {100, 20, 50, 70, 90, 2, 40, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 35) {
                System.out.println(i);
            }
        }
    }
}
