package ClassTask2;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean[] isprime = new boolean[num + 1];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) isprime[i] = true;
        isprime[0] = isprime[1] = false;
        for (int i = 2; i <= num; i++) {
            if (isprime[i]) {
                for (int j = 2 * i; j <= num; j += i) {
                    isprime[j] = false;
                }
                list.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j >= 0; j--) {
                if (i > j) {
                    break;
                } else if (list.get(i) + list.get(j) == num) {
                    System.out.println(num + "=" + list.get(i) + "+" + list.get(j));
                }
            }
        }
    }
}