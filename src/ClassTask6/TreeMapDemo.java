package ClassTask6;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, String> map1 = new TreeMap<String, String>();
        map1.put("book", "书");
        map1.put("apple", "苹果");
        map1.put("dest", "桌子");
        for (String s : map1.values())
            System.out.println(s);
    }
}