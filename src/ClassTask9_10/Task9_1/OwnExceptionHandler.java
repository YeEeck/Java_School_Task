package ClassTask9_10.Task9_1;

public class OwnExceptionHandler {
    public static void main(String[] args) {
        OwnExceptionSource ownExceptionSource = new OwnExceptionSource();
        try {
            ownExceptionSource.a();
        } catch (OwnException e){
            e.printStackTrace();
            System.out.println("Catch");
        }

    }
}
