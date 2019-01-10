/**
 * @author : Mohammed FAKHAM
 * @date : 4 January 2019
 */

package partie1;

import java.util.*;

public class ManipulerHashMap {

    public static void main(String[] args) {

        Map<String, String> h_map = new HashMap<>();
        h_map.put("key 1", "value 1");
        h_map.put("key 2", "value 2");
        h_map.put("key 3", "value 3");

        Map<String, String> h_map2 = new HashMap<>();
        h_map2.putAll(h_map);

        if (h_map.containsKey("key 1"))
            System.out.println(h_map.get("key 1"));

        Set<Map.Entry<String, String>> set = h_map.entrySet();
        System.out.println(set);

        Collection<String> list = h_map.values();
        System.out.println(list);

    }

}
