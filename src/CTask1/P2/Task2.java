package CTask1.P2;

public class Task2 {
    public static void main(String[] args) {
        char c4 = 'a';
        int i = c4 + 2;
        System.out.println(i);//输出99
        char c5 = (char)i;
        System.out.println(c5);//报错！可能损失精度，因为i是4个字节，char是2个字节
        char c6 = (char)i;   //强制转型
        System.out.println(c6);//正确，输出c

    }
}
