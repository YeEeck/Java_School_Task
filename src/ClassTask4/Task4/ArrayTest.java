package ClassTask4.Task4;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayClass2 arrayClass2 = new ArrayClass2();
        for (int i = 0; i < 1000; i++) {
            arrayClass2.insert(i, i);
        }
        arrayClass2.del(89);
        arrayClass2.print();
    }
}
