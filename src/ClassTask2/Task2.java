package ClassTask2;

public class Task2 {
    public static void main(String[] args) {
        double pi = 4;
        double t = 3;
        int syn = -1;
        while (pi < 3.1415 || pi > 3.1416) {
            pi += syn * (4 / t);
            t += 2;
            syn *= -1;
        }
        System.out.println(pi);
    }
}
