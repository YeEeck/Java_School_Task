package ClassTask5.Task2;

public class Son extends Parent {
    int sc;

    Son(int c) {
        super(0, 0);
        sc = c;
    }

    public void setAB(int a, int b) {
        pa = a;
        pb = b;
    }

    public void getSum() {
        System.out.println(pa + pb + sc);
    }


}
