package PatterPrinting;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 2*n-1; i++) {
            System.out.print("* ");
        }
        System.out.println();
        int nsp = 1;
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= nsp; k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n-i; k++) {
                System.out.print("* ");
            }
            nsp += 2;
            System.out.println();
        }
    }
}
