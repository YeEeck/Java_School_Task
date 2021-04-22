package ClassTask5.Task1;

public abstract class Animal {
    private int legs;

    Animal(int legs){
        this.legs = legs;
    }

    abstract void walk();
    abstract void eat();
}
