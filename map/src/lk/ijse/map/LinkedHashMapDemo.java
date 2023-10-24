package lk.ijse.map;

/*
    @author DanujaV
    @created 10/24/23 - 3:32 PM   
*/

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("sl", "Kotte");
        map.put("aust", "Melbourne");
        map.put("uk", "London");

        System.out.println(map);
    }
}
