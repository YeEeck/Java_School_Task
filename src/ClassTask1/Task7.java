package ClassTask1;

import java.util.Scanner;

public class Task7 {
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        int p = gcd(a, b);
        System.out.println(p);
        System.out.println(a * b / p);
    }
}
