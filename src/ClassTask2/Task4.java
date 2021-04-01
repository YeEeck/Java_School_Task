package ClassTask2;

public class Task4 {
    public static void main(String[] args) {
        double sum = 1;
        int syn = -1;
        double t = 3;
        for (int i = 1; i < 50; i++) {
            sum += syn * (1 / t);
            syn *= -1;
            t += 2;
        }
        System.out.println(sum);
        while (1 / t >= 1e-5) {
            sum += syn * (1 / t);
            syn *= -1;
            t += 2;
        }
        System.out.println(sum);
    }
}
