package ClassTask3.Task3;

public class Animal {
    private String name;
    private int legs;

    Animal() {
        name = "AAA";
        legs = 4;
    }

    Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }


    public void move() {
        System.out.println(name + " Moving!!");
    }

    public void move(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(name + " Moving!!");
        }

    }
}
