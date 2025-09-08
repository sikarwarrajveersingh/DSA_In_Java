package PatterPrinting;

import java.util.Scanner;

public class AlphabetTriangleVerticalFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                if (i % 2 == 0) System.out.print((char) (k + 64) + " ");
                else System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
