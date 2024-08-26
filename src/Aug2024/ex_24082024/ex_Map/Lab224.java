package Aug2024.ex_24082024.ex_Map;

import java.util.HashMap;
import java.util.Hashtable;

public class Lab224 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(1,"one");
      //  ht1.put("One","one"); -> Bcuz of String data type

      //  ht1.put(null,"one"); -> Not allowed in HashTable

        HashMap h1 = new HashMap();
        h1.put(null, "sofiya");  // This is allowed
    }
}
