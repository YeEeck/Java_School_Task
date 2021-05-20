package ClassTask9_10.Task9_3;

public class TestException {
    public static void main(String[] args) {
        try {
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
