package ClassTask6;

import java.util.*;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<String>();
        set1.add("book");
        set1.add("boy");
        set1.add("apple");
        set1.add("zoo");
        for (String name : set1)
            System.out.println(name);
    }
}
