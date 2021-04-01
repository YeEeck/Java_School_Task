package ClassTask1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numL = new int[3];
        for (int i = 0; i < 3; i++) {
            numL[i] = scanner.nextInt();
        }
        Arrays.sort(numL);
        if (numL[0] + numL[1] <= numL[2]){
            System.out.println("不能构成三角形");
        } else {
            System.out.println("可以构成三角形");
        }
    }
}
