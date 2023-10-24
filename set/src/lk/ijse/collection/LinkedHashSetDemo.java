package lk.ijse.collection;

/*
    @author DanujaV
    @created 10/24/23 - 3:11 PM   
*/

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(40);

        System.out.println(set);
    }
}
