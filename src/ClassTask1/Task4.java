package ClassTask1;

import java.text.DecimalFormat;

public class Task4 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += 1.0 / i;
        }
        System.out.println(df.format(sum));
    }
}
