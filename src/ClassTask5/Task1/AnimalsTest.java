package ClassTask5.Task1;

public class AnimalsTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.getName();
        cat.setName("Neko");
        cat.play();

        Spider spider = new Spider();
        spider.walk();

        Fish fish = new Fish();
        fish.getName();
        fish.setName("Nemo");
        fish.eat();
    }
}
