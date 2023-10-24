package lk.ijse.map;

/*
    @author DanujaV
    @created 10/24/23 - 3:33 PM   
*/

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();

        map.put("sl", "Kotte");
        map.put("aust", "Melbourne");
        map.put("uk", "London");
        map.put("bangaladesh", "Dakha");

        System.out.println(map);
    }
}
