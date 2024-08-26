package Aug2024.ex_18082024.CollectionFramework_Part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab211 {
    public static void main(String[] args) {

        List myList1 = new ArrayList(); // Father reference - Child object
        myList1.add("Anaiza");
        myList1.add("Tariq");
        myList1.add("Salman");
        System.out.println(myList1);

        // Vector

        Vector v = new Vector();
        v.add("Anaiza");
        v.add("Tariq");
        v.add("Salman");
        System.out.println(v);

        // Only Problem with the Vector :
        // It is Thread Safe, Synchronised.
        // It will be time-consuming
        // One by One - usage
        // Slower
    }
}
