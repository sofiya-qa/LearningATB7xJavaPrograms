package aug.ex_18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab204 {
    public static void main(String[] args) {
        // Collection - Interface
        // Collection(I) -> List(I)
        // List(I) -> ArrayList, LinkedList, Vector, Stack

        // Shopping List, Marks List, Collection of items,Todo List, Students List

//        Collection myList3 = new ArrayList(); //  Dynamic Dispatch
//        List myList = new ArrayList(); //  Dynamic Dispatch

        ArrayList myList2 = new ArrayList();
        myList2.add("sofiya");
        myList2.add("Javed");
        myList2.add("Eman");
        myList2.add("Aiza");
        myList2.add(112);
        myList2.add(true);

        System.out.println(myList2);    // [sofiya, Javed, Eman, Aiza, 112, true]
        System.out.println(myList2.size());     // 6
        System.out.println(myList2.contains("Eman"));   // True
        System.out.println(myList2.contains("eman"));   // False

        String s1 = (String) myList2.get(3);    // Aiza
        System.out.println(s1);

        System.out.println(myList2.get(5));     // true


    }
}
