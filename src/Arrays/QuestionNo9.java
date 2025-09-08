package Arrays;

public class QuestionNo9 {
    public static void main(String[] args) {

        // Two Sum

        int[] arr = {10, 20, 30, 10, 40};
        int target = 600;
        boolean found = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    found = true;
                    break;
                }
            }
        }
        if (found) System.out.print("Target found: "+target);
        else System.out.println("Target not found");
    }
}
