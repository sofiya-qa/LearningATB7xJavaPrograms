package Aug2024.ex_24082024.ex_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab220 {
    public static void main(String[] args) {
        // Map (Interface) -> key, value pair
        // Where key always unique -> no duplicate keys
        // each key can map to one value

       // Concrete sub classes of Map(I)
        // 1.HashMap
        // 2.LinkedHashMap
        // 3.TreeMap
        // 4.Hashtable

        // Functions are almost same

        // 1.HashMap
        Map m1 = new HashMap(); // No order
        m1.put("name", "sofiya");
        m1.put("rollNo", "11");
        m1.put("address","Mumbai");
        m1.put("phoneNo", "876495813584");

        System.out.println(m1);
    }
}
