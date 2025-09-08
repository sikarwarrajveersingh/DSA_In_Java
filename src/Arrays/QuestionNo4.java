package Arrays;

public class QuestionNo4 {

    // Find Second maximum element

    public static void main(String[] args) {
        int[] arr = {1000, 20, 3, 230, 1000, 5, 600};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (smax < arr[i] && arr[i] != max) {
                smax = arr[i];
            }
        }
        int tmax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (tmax < arr[i] && arr[i] != smax && arr[i] != max) {
                tmax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
        System.out.println(tmax);
    }
}
