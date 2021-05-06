package ClassTask7.Task1;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        circle.area();
        circle.zhouchang();

        Rect rect = new Rect(3, 4);
        rect.area();
        rect.zhouchang();
        rect.cha();

        Squ squ = new Squ(5);
        squ.area();
        squ.zhouchang();
        squ.cha();
    }
}
