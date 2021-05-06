package ClassTask7.Task1;

public class Circle extends Shape {
    private double radio;
    private final double PI = 3.14;

    Circle(double r) {
        radio = r;
    }

    @Override
    public void zhouchang() {
        System.out.println(2 * PI * radio);
    }

    @Override
    public void area() {
        System.out.println(PI * radio * radio);
    }
}
