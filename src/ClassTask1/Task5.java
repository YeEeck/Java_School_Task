package ClassTask1;

public class Task5 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int buf = 1;
            for (int j = 2; j <= i; j++) {
                buf *= j;
            }
            sum += buf;
        }
        System.out.println(sum);
    }
}
