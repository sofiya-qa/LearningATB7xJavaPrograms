package Aug2024.ex_24082024.ex_Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab223 {
    public static void main(String[] args) {
        // Hashtable -> Legacy Class of Map
        // Doesn't allow null
        // Synchronised
        // Slow
        // Legacy Class

        Hashtable<Integer, String> ht1 = new Hashtable<>();

        ht1.put(1, "One");
        ht1.put(2, "Two");
        ht1.put(3, "Three");

        // To print Hashtable elements
        // Syntax
        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()){
            System.out.println(ht1.get(e.nextElement()));
        }
    }
}
