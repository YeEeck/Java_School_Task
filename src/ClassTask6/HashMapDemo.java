package ClassTask6;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("book", "书");
        map1.put("apple", "苹果");
        map1.put("Language", "语言");
        Set<String> set = map1.keySet();
        for (String s : set) {
            String v = map1.get(s);
            System.out.println(s + "  " + v);
        }
    }
}
