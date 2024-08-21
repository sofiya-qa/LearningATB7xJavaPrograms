package aug.ex_18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab207 {
    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("Javed");
        myList.add("Sofiya");
        myList.add("Eman");
        myList.add("Aiza");
        myList.add("Javed"); // Duplicate

        // add, remove, clear, contains, indexOf, isEmpty, size,
        // get, addAll, removeAll, retainAll, containsAll

        System.out.println(myList);
        System.out.println(myList.size());

        // Removes the first occurrence
        // of the specified element from the list,
        System.out.println(myList.remove("Javed")); // true

        System.out.println(myList);
        myList.clear();
        System.out.println(myList);
        System.out.println(myList.isEmpty());

        myList.add("Javed");
        myList.add("Sofiya");
        myList.add("Eman");
        myList.add("Aiza");
        myList.add("Javed");

        System.out.println(myList);
        System.out.println(myList.isEmpty());
        myList.add("Asmita");
        System.out.println(myList);

        myList.set(1, "sofiyaAnsari");
        System.out.println(myList);

        myList.add(123);
        myList.add(true);
        System.out.println(myList);

        System.out.println("-------------------- -------------------");

        // How to print all the elements one bye one ?
        for (int i = 0; i <myList.size() ; i++) {
            System.out.println(myList.get(i));
        }

        // Using Enhanced for-each loop

        System.out.println("--------------- ----------");
        for (Object o: myList){
            System.out.println(o);
        }
    }
}
