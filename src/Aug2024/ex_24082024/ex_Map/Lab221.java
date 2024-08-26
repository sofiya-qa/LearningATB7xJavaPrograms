package Aug2024.ex_24082024.ex_Map;

import java.util.*;

public class Lab221 {
    public static void main(String[] args) {
        // Map -> key - value pair
        // name:sofiya, roll:11, phone:9874661254

        // 2. LinkedHashMap -> Based on the order we have entered
        // Map m1 = new LinkedHashMap();

        // 3. TreeMap -> Based on the Alphabet
        Map m1 = new TreeMap();
        m1.put("name", "sofiya");
        m1.put("rollNo", "11");
        m1.put("phoneNo", "876495813584");
        m1.put("address","Mumbai");

        System.out.println(m1);

    }
}
