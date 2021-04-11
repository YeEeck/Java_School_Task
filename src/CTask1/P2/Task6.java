package CTask1.P2;

public class Task6 {
    public static void main(String[] args) {
        double sum = 0, item;
        long i = 1, fenmu = 1;
        while (i <= 20) {
            fenmu = fenmu * i;
            item = 1.0 / fenmu;
            sum += item;
            i++;
        }
        System.out.println(sum);
    }
}
