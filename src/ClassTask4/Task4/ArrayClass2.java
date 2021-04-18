package ClassTask4.Task4;


public class ArrayClass2 {
    int[] array;
    int len;

    ArrayClass2() {
        array = new int[100];
        len = 0;
    }

    void check() {
        if (len + 4 > array.length) {
            int[] temp = array.clone();
            array = new int[array.length + 100];
            System.arraycopy(temp, 0, array, 0, temp.length);
        }
    }

    public void insert(int num, int pos) {
        check();
        if (pos > len) return;
        for (int i = len; i > pos; i--) {
            array[i] = array[i - 1];
        }
        len++;
        array[pos] = num;
    }

    public void del(int pos) {
        check();
        if (pos >= len) return;
        for (int i = pos; i < len - 1; i++) {
            array[i] = array[i + 1];
        }
        len--;
    }

    public void print() {
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
