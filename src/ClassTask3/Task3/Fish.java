package ClassTask3.Task3;


public class Fish extends Animal {
    private String name;
    private int legs;
    Fish(String name) {
        this.name = name;
        legs = 0;
    }

    @Override
    public void move(){
        System.out.println(name + " Swimming!!");
    }
}
