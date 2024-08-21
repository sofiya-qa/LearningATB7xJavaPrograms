package aug.ex_18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab210 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Anaiza");
        myList.add("Tariq");
        myList.add("Salman");

        System.out.println(" To Print ArrayList - 1");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println(" To Print ArrayList - 2");
        for (Object O:myList){
            System.out.println(O);
        }


        System.out.println(" To Print ArrayList - 3");
        // Iterator
        Iterator<String> its = myList.iterator();
        while (its.hasNext()){
            System.out.println(its.next());
        }
    }
}
