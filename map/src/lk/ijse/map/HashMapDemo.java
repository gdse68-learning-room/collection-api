package lk.ijse.map;

/*
    @author DanujaV
    @created 10/24/23 - 3:23 PM   
*/

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map map = new HashMap<>();  // Key Value pairing

        map.put("sl", "Kotte");
        map.put("aust", "Melbourne");
        map.put("uk", "London");
        map.put(1, 10);

        System.out.println(map);

        Map<String, String> map2 = new HashMap<>();
        map2.put("sl", "Kotte");
//        map2.put(1, 10);    //Illegal
    }
}
