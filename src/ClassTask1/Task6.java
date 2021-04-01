package ClassTask1;

public class Task6 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int sum = 0, buf = i;
            do {
                sum += Math.pow(buf % 10, 3);
            } while ((buf /= 10) != 0);
            if (sum == i){
                System.out.println(i);
            }
        }
    }
}
