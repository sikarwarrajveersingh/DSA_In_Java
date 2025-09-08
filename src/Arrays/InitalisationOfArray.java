package Arrays;

public class InitalisationOfArray {
    public static void main(String[] args) {
//        int[] arr = {12, 23, 43, 55, 56};
//        for(int num : arr) {
//            System.out.println(num);
   // }
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        arr[3] = 100;
        System.out.println(arr[3]);


    }
}
