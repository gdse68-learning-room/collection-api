package lk.ijse.collection;

/*
    @author DanujaV
    @created 10/24/23 - 1:56 PM   
*/

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithGenerics {
    public static void main(String[] args) {
        List<String> studentList = new ArrayList<>();
        studentList.add("Kasun");
        studentList.add("Nimal");
        studentList.add("Sepala");

//        studentList.add(13123);

        System.out.println(studentList);

        List<Double> markList = new ArrayList<>();
        markList.add(10.5);
        markList.add(76.5);

//        markList.add("A");
        System.out.println(markList);
    }
}
