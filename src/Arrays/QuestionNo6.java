package Arrays;

public class QuestionNo6 {
    public static void main(String[] args) {

        // Array multiply by 2

        int[] arr = {10, 20, 30, 40, 50, 60};
        solve(arr);
    }
    public static void solve(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(2 * (arr[i]) +" ");
            } else {
                System.out.print(10 + (arr[i])+" ");
            }
        }
        System.out.println();
    }
}
