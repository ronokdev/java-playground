package collections.comparatorinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("d","e2"));
        customers.add(new Customer("a","e9"));
        customers.add(new Customer("c","e1"));
        Collections.sort(customers,new EmailCompare());
        System.out.println(customers);
    }
}
