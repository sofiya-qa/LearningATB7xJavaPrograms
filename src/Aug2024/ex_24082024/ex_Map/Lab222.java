package Aug2024.ex_24082024.ex_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab222 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("id", 001);
        map.put("id2", 002);
        map.put("id3", 003);
        map.put("id4", null);
        map.put("id5", null);

        // not possible bcuz we are passing string value
         //  map.put("id5", "sofi");

        // null as a value allowed 100times
        // But null as a key allows only once

      //  map.put(null, 003);
        map.put(null, 004); // it will take latest value


        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id4"));
        System.out.println(map.containsValue(003));
        System.out.println(map.containsValue(005));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("id2"));

        System.out.println("------- -------");
        // How to iterate over all the elements in the map
        // Iterator doesn't support Map
        for (Map.Entry<String,Integer> item:map.entrySet()){
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }
}
