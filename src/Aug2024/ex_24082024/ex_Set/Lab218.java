package Aug2024.ex_24082024.ex_Set;

import java.util.*;

public class Lab218 {
    public static void main(String[] args) {
        // List(I) -> Allows duplicates
        // Set(I) -> Doesn't allow duplicates

        // Concrete subclasses of Set
        // 1. HashSet
        // Follow Hashing mechanism to store the element, no order
        Set hs = new HashSet();
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Water Melon");
        hs.add(null);
        System.out.println(hs);

        // 2. LinkedHashSet
        // Follow LinkedList mechanism to store the element, Order will be maintained
        Set lhs = new LinkedHashSet();
        lhs.add("Apple");
        lhs.add("Water Melon");
        lhs.add("Orange");
        lhs.add("orange");
        lhs.add("Water Melon");  // Doesn't allow duplicate
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("orange"));
        System.out.println(lhs.size());

        // TreeSet
        // Follow Black & Red Tree mechanism to store the element, Order will be maintained
        Set ts = new TreeSet();
        ts.add("Banana");
        ts.add("apple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Water Melon");
        // Can we sort with null?
       // ts.add(null); // Not possible in TreeSet -> NullPointerException
        System.out.println(ts);

        System.out.println("---------- ------------");
        // To print
        for (Object s: ts){
            System.out.println(s);
        }
        System.out.println("---------- ------------");
        Iterator it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }






    }
}
