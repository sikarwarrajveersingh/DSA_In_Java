package PatterPrinting;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1, nst = 1;
        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print(" "+" ");
//            }
//            for (int k = 1; k <= 2*i-1; k++) {
//                System.out.print("*"+" ");
//            }

            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= nst; k++) {
                System.out.print("* "); // one at a time
//                System.out.print(i+" ");
//                System.out.print(k+" ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }
    }
}
