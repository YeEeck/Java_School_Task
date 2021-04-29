package ClassTask6.Task8;

import java.util.Iterator;
import java.util.TreeSet;

public class Example {
    public static void main(String args[]) {
        TreeSet<Student> mytree = new TreeSet<Student>();
        Student st1, st2, st3;
        st1 = new Student(178, "赵一");
        st2 = new Student(185, "钱二");
        st3 = new Student(169, "孙三");
        mytree.add(st1);
        mytree.add(st2);
        mytree.add(st3);
        Iterator<Student> te = mytree.iterator();
        while (te.hasNext()) {
            Student stu = te.next();
            System.out.println(" " + stu.name + " " + stu.height + "cm");
        }
    }
}
