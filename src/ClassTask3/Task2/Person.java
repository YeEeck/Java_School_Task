package ClassTask3.Task2;

public class Person {
    String name;
    int age;
    boolean gender;
    Person partner;

    public void marry(Person p) {
        //四个flag用来判断错误原因，不直接输出是为了让输出更好看
        boolean flag1 = false, flag2 = false, flag3 = false, flag4 = false;
        //判断二人是否有伴侣
        if (partner != null) {
            flag1 = true;
        }
        if (p.partner != null) {
            flag2 = true;
        }
        //判断年龄是否达到要求,三元运算符用作不同性别的年龄要求判断
        if (age < (gender ? 24 : 22)) {
            flag3 = true;
        }

        if (p.age < (p.gender ? 24 : 22)) {
            flag4 = true;
        }
        //如果不能结婚的任一条件满足则开始输出错误原因，并终止方法;
        if (flag1 || flag2 || flag3 || flag4) {
            System.out.println("不能结婚,原因为：");
            if (flag1) {
                System.out.println(name + " 已婚");
            }
            if (flag2) {
                System.out.println(p.name + " 已婚");
            }
            if (flag3) {
                //三元运算符
                System.out.println(name + "年龄未达到 " + (gender ? 24 : 22) + " 岁");
            }
            if (flag4) {
                System.out.println(p.name + "年龄未达到 " + (p.gender ? 24 : 22) + " 岁");
            }
            return;
        }
        //设定双方的伴侣为互相
        partner = p;
        p.partner = this;
        System.out.println("恭喜 " + name + (gender ? "(男)" : "(女)") + " 与 " + p.name + (p.gender ? "(男)" : "(女)") + " 喜结良缘");
    }
}
