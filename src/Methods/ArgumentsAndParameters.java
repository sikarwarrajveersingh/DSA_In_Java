package Methods;

import java.util.Scanner;

public class ArgumentsAndParameters {
    public static void sum(int a, int b, int c) { // parameters
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sum(x, y, -z);  // arguments
    }
}
