package Methods;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+" "+b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
}
