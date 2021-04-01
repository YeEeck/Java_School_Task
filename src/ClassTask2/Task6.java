package ClassTask2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int len = num - 1;
        for (int i = 0; i < num; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < len - i; j++) {
                str.append(" ");
            }
            for (int j = 0; j < 1 + i * 2; j++) {
                str.append("*");
            }
            System.out.println(str);
        }
    }
}
