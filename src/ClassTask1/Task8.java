package ClassTask1;

public class Task8 {
    public static void main(String[] args) {
        int num = 12345;
        do {
            System.out.println(num % 10);
        } while ((num /= 10) != 0);
    }
}
