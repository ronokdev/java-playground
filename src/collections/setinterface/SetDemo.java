package collections.setinterface;

import java.util.*;

public class SetDemo {
    public void show(){
        Set<String> stringSet = new HashSet<>();

        stringSet.add("the");
        stringSet.add("sky");
        stringSet.add("is");
        stringSet.add("is");
        stringSet.add("blue");

        //Prints the Set But Not is a Sequential Way
        System.out.println(stringSet);

        //Removing the Duplicates from a String Collection
        Collection<String> stringCollection= new ArrayList<>();
        Collections.addAll(stringCollection,"a","b","b","c");


        Set<String> stringSetNew = new HashSet<>(stringCollection);
        System.out.println(stringSetNew);

    }
}
