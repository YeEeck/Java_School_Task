package ClassTask6;

import java.util.*;

public class Task3 {
    public static void main(String args[]) {
        List<String> list = new LinkedList<String>();
        list.add("大家好");
        list.add("国庆60周年");
        list.add("十一快乐");
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String te = iter.next();
            System.out.print(te + " ");
        }
        System.out.println("");
        long endTime = System.currentTimeMillis();//返回以毫秒为单位的当前时间
        for (int i = 0; i < list.size(); i++) {
            String te = list.get(i);
            System.out.print(te + " ");
        }
    }
}
