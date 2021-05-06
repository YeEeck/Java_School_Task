package ClassTask7.Task1;

public class Rect extends Shape {
    private double height, width;

    Rect(double h, double w) {
        height = h;
        width = w;
    }

    @Override
    public void zhouchang() {
        System.out.println(2 * (height + width));
    }

    @Override
    public void area() {
        System.out.println(height * width);
    }

    public void cha() {
        if (height > width) {
            System.out.println("长比宽大");
        } else {
            System.out.println("宽比长大");
        }
    }
}
