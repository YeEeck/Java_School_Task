package ClassTask3.Task2;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.gender = true;
        person1.age = 22;
        person1.name = "张三";
        person1.partner = null;

        person2.gender = false;
        person2.age = 21;
        person2.name = "李四四";
        person2.partner = null;

        person1.marry(person2);

        person1.age = 30;
        person2.age = 25;

        person2.marry(person1);
        person2.marry(person1);
    }
}
