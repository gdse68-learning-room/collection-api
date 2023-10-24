package lk.ijse.collection;

/*
    @author DanujaV
    @created 10/24/23 - 2:48 PM   
*/

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List list = new LinkedList();

        list.add(10);
        list.add("Kamal");
        list.add(100);
        list.add('A');

        System.out.println(list);
    }
}
