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

        //pass a list of string to a set
        Set<String> stringSet1 = new HashSet<>(Arrays.asList("d","e","f"));


        Set<String> stringSet2 = new HashSet<>(Arrays.asList("e","f","g"));
        System.out.println();
        System.out.println("This is string set 1 :"+stringSet1);
        System.out.println("This is string set 2 :"+stringSet2);

        //Different types of Set Operation
        //As this operations effect the OBJECT of a SET that's why we are commenting in every operation EXCEPT the one we want to see the results.

        //Union
        stringSet1.addAll(stringSet2); // output is: [d, e, f, g]
        System.out.println("After Union :"+stringSet1);

        //Intersection
        //stringSet1.retainAll(stringSet2);
        //System.out.println("After Intersection :" +stringSet1); //output: [e,f]

        //Difference
        //stringSet1.removeAll(stringSet2);
        //System.out.println(stringSet1); //Output: [d] because it's keeping everything in stringSet1 and removing everything from stringSet2
    }
}
