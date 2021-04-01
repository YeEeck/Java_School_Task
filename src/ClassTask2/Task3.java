package ClassTask2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] dp = new int[num];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < num; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[num - 1]);
    }
}
