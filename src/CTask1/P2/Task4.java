package CTask1.P2;

public class Task4 {
    public static void main(String[] args) {
        String a = "学习";
        switch (a) {   //JDK7的新特性，表达式结果可以是字符串！！！
            case "好好学习":
                System.out.println("输入的好好学习");
                break;
            case "学习":
                System.out.println("输入的学习");
                break;
            default:
                System.out.println("大家好！");
                break;
        }

    }

}
