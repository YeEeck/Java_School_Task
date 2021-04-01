package ClassTask1;

public class Task10 {
    public static void main(String[] args) {
        for (int i = 1; i < 600; i++) {
            if (i % 3 == 0 && ("" + i).contains("5")) {
                System.out.println(i);
            }
        }
    }
}
