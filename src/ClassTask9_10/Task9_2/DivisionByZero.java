package ClassTask9_10.Task9_2;

public class DivisionByZero {
    static void division() throws ArithmeticException {
        double t = 10 / 0;
    }

    public static void main(String[] args) {
        try {
            division();
        } catch (ArithmeticException e){
            e.printStackTrace();
        }

    }
}
