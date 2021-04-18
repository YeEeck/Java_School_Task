package ClassTask4.Task3;

public class StackClass {
    private int[] stackArray;
    int length;

    StackClass() {
        stackArray = new int[100];
        length = 0;
    }

    public void push(int num) {
        stackArray[length] = num;
        length++;
    }

    public int pop() {
        length--;
        return stackArray[length];
    }
}
