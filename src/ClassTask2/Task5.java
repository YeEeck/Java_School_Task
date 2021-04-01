package ClassTask2;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(999);
            boolean flag = true;
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(num + "\t是素数");
            } else {
                System.out.println(num + "\t不是素数");
            }
        }
    }
}
