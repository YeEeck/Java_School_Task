package ClassTask5.Task1;

public class Fish extends Animal implements Pet {
    private String name;

    Fish() {
        super(0);
        name = "Fish";
    }

    Fish(String name) {
        super(0);
        this.name = name;
    }

    @Override
    void walk() {
        System.out.println(name + " is walking");
    }

    @Override
    void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    public void getName() {
        System.out.println("This cat's name is " + name);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " is playing");
    }
}
