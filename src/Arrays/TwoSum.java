package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int n = nums.length;
        int[] ans = new int[2];
        int target = 110;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i] + nums[j] == target){
                    ans[0] = i; ans[1] = j;
                    break;
                }
            }
        }
        System.out.println(ans[0]+" "+ans[1]);
    }
}
