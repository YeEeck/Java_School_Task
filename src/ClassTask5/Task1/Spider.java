package ClassTask5.Task1;

public class Spider extends Animal {
    Spider() {
        super(6);
    }

    @Override
    void walk() {
        System.out.println("Spider is walking");
    }

    @Override
    void eat() {
        System.out.println("Spider is eating");
    }
}
