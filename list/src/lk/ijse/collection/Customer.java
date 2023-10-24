package lk.ijse.collection;

/*
    @author DanujaV
    @created 10/24/23 - 2:45 PM   
*/

public class Customer {
    String id;
    String name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
