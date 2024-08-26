package Aug2024.ex_24082024.ex_List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lab212 {
    public static void main(String[] args) {
        // LinkedList ->
        // 1. Load in a non continues memory
        // 2. Find an element is very difficult
        // 3. Traverse all the nodes
        // 4. Adding & deleting is easy (Manipulation is faster)

        LinkedList l = new LinkedList();
        l.add("Node 1");
        l.add("Node 2");
        l.add("Node 3");
        System.out.println(l);

        // ArrayList ->
        // 1. Load in a continues memory
        // 2. Find an element is very easy by [index]
        // 3. Adding & deleting - heavy operation (Manipulation is slow)

        ArrayList l2 = new ArrayList();
        l2.add("Node 1");
        l2.add("Node 2");
        l2.add("Node 3");
        System.out.println(l2);

    }
}
