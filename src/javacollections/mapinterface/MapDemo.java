package javacollections.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void showMapDemo(){

        Customer customer1 = new Customer("Ronok","ronok@gmail.com");
        Customer customer2 = new Customer("Ratul","ratul@gmail.com");
        Customer customer3 = new Customer("Koushika","koushika@gmail.com");
        Customer unknownCustomer = new Customer("Unknown","No Email");

        Map<String,Customer> customerMap = new HashMap<>();

        //Using email as Key, adding object to HashMap.
        customerMap.put(customer1.getName(),customer1);
        customerMap.put(customer3.getName(),customer3);
        customerMap.put(customer2.getName(),customer2);


        //Get an object from Hashmap
        System.out.println(customerMap.get("Ratul"));
        //Setting a default object in-case of Not finding the object in the HashMap
        System.out.println(customerMap.getOrDefault("ronok@gmail",unknownCustomer));

        //Checking if a key Exists
        System.out.println(customerMap.containsKey("ronok@gmail.com"));
        System.out.println(customerMap.containsKey("Ronok"));

        //Replacing an Existing Object int the HashMap
        customerMap.replace("Ratul",new Customer("Ratul","Ratul@yahoo.com"));
        System.out.println("Printing the Full HashMap: "+customerMap);

        //Iterate over a hashMap

        //Getting all the Objects from hashmap by iterating over the Keys
        for(String key :customerMap.keySet()){
            System.out.println(customerMap.get(key));
        }

        //Iterating with EntrySet
        for(Map.Entry<String, Customer> key :customerMap.entrySet()){
            System.out.println((key.getValue()));
        }

        //Iterating with values which returns one object with each Iteration
        for(Customer customers : customerMap.values()){
            System.out.println(customers);
        }
    }
}

