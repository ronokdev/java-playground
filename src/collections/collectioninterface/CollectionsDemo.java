package collections.collectioninterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show()
    {
        Collection<String> collection = new ArrayList<>(); //Here Collection is an interface and the ArrayList implements the Collection Interface

        //Add element to collection
        collection.add("a");
        collection.add("b");
        Collections.addAll(collection,"c","d");

        //print a Collection
        System.out.println(collection);
        for(String col : collection)
            System.out.print(col);

        //check size
        System.out.println();
        System.out.println("collection Size is "+collection.size());

        //remove an element from Collection
        collection.remove("d");

        //check for an element in collection
        System.out.println(collection.contains("a"));

        //Clear all from collection
//        collection.clear();

        //Collection to Object Array
        Object[] objectArray = collection.toArray();
        System.out.println("Total Length is " +objectArray.length);

        //Collection to String array
        String[] stringArray = collection.toArray(new String[0]);
        stringArray[0].toUpperCase(); //we can now access all the stream methods
        System.out.println(stringArray[0]);

        //Check if a collection is equal to other collection
        Collection<String> otherCollection = new ArrayList<>();
        otherCollection.addAll(collection);

        System.out.println("is the collection empty "+otherCollection.isEmpty());
        System.out.println("is the two collection Equal "+otherCollection.equals(collection));
    }
}
