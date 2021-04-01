package CTask1.P1;

import java.util.Scanner;

public class Task4 {
    public static void test01() {
        Scanner s = new Scanner(System.in);
        String str = s.next();  //程序运行到next会阻塞，等待键盘的输入！
        System.out.println("刚才键盘输入：" + str);
    }

    public static void test02() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个加数：");
        int a = s.nextInt();
        System.out.println("请输入被加数：");
        int b = s.nextInt();
        int sum = a + b;
        System.out.println("计算结果，和为：" + sum);
    }

    public static void main(String[] args) {
        test02();
    }

}
