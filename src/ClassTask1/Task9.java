package ClassTask1;

import java.util.HashSet;

public class Task9 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int sum = 0, buf = i;
            HashSet<Integer> set = new HashSet<>();
            do {
                int nc = (buf % 10);
                sum += nc * nc;
                set.add(nc);
            } while ((buf /= 10) != 0);
            if (set.size() <= 2 && i / 11 == sum) {
                System.out.println(i);
            }
        }
    }
}
