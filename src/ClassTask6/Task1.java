package ClassTask6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<String> array = new ArrayList<String>();
        System.out.println("输入一行字符串，以quit结束");
        while (true) {
            System.out.print("#");
            String input = sc.next();
            if (input.equals("quit"))
                break;
            array.add(input);
        }
        for (int i = 0; i < array.size(); i++)
            System.out.println(array.get(i));
    }
}
