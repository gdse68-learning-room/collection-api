package lk.ijse.collection;

/*
    @author DanujaV
    @created 10/24/23 - 3:09 PM   
*/

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet();

        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set);
    }
}
