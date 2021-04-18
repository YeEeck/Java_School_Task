package ClassTask4.Task1;

import java.util.Arrays;

public class ArrayClass {
    private int[] array;
    private int len;

    ArrayClass(int length) {
        array = new int[length];
        len = 0;
    }

    public void print() {
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void sort() {
        Arrays.sort(array);
    }

    public void insert(int elem) {
        array[len] = elem;
        len++;
    }

    public void del(int pos) {
        for (int i = pos; i < len - 1; i++) {
            array[i] = array[i + 1];
        }
        len--;
    }

    public int find(int num) {
        for (int i = 0; i < len; i++) {
            if (array[i] == num)
                return i;
        }
        return -1;
    }


}
