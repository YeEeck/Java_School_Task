package ClassTask3.Task1;


public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();//实例化
        //为对象属性赋值
        teacher.name = "TestTeacher";
        teacher.age = 30;
        teacher.salary = 3000.5;
        teacher.sex = "女";
        //打印对象属性
        System.out.println(teacher.name);
        System.out.println(teacher.age);
        System.out.println(teacher.sex);
        //为调用对象加薪水方法
        teacher.addSalary5000();
        //打印加薪水后的薪水
        System.out.println(teacher.salary);
    }
}
