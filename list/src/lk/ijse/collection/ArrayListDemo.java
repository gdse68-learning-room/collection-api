package lk.ijse.collection;

/*
    @author DanujaV
    @created 10/24/23 - 1:37 PM   
*/

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();

        System.out.println("isEmpty(): " + list.isEmpty());

        list.add(10);
        list.add(200);
        list.add("Saman");
        list.add("John");
        list.add(true);
        list.add(10.5);
        list.add('A');

        System.out.println(list);

        System.out.println("get(0): " + list.get(0));
        System.out.println("isEmpty(): " + list.isEmpty());

        System.out.println("contains(\"Saman\"): " + list.contains("Game Kolla"));

        System.out.println(list.remove("Saman"));
        System.out.println(list);

        Object removed = list.remove(2);
        System.out.println("removed: " + removed);

        System.out.println(list);

//        boolean equals = list.equals(list2);
//        System.out.println("equals: " + equals);

        System.out.println("size(): " + list.size());
    }
}
