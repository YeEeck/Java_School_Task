package ClassTask6;

import java.util.*;

public class Task4 {
    public static void main(String args[]) {
        LinkedList<String> listString = new LinkedList<String>();
        listString.add("bird");
        listString.add("apple");
        listString.add("cat");
        Collections.sort(listString);
        Iterator<String> iterString = listString.iterator();
        while (iterString.hasNext()) {
            String s = iterString.next();
            System.out.print(s + " ");
        }
    }
}