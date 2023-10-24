package lk.ijse.collection;

/*
    @author DanujaV
    @created 10/24/23 - 2:45 PM   
*/

import java.util.ArrayList;
import java.util.List;

public class ExerciseDemo {
    public static void main(String[] args) {
//        ArrayList<Customer> cusList = new ArrayList<>();
        List<Customer> cusList = new ArrayList<>();
        cusList.add(new Customer("C001", "Kamal"));
        cusList.add(new Customer("C002", "John"));
        cusList.add(new Customer("C003", "Sunil"));
        cusList.add(new Customer("C004", "Sepali"));

        System.out.println(cusList);
    }
}
