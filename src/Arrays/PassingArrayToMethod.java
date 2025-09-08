package Arrays;

public class PassingArrayToMethod {
    public  static void swap(int[] x) {
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;

        x[0] = 100;
    }
    public static void main(String[] args) {
//        int[] a = {10, 20};
//        System.out.println(a[0]+" "+a[1]);
//        swap(a);
//        System.out.println(a[0] + " " + a[1]);

        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(arr[0]);
        swap(arr);
        System.out.println(arr[0]);
    }
}
