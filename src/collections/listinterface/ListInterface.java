package collections.listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterface
{
    public void listInterfaceDemo()
    {
       List<String> list = new ArrayList<>();

       // adding element to list
       list.add("a");
       list.add("b");
       list.add("c");
       System.out.println(list);

       // Adding element direct to an INDEX
       list.add(0,"a1");
       list.add(1,"b1");
       list.add(2,"c1");
       System.out.println(list);

       //Adding to the End of the List
       Collections.addAll(list,"d","e");
       System.out.println(list);

       // Remove an element from List
        list.remove("e");
        System.out.println(list);

        //get the index of an element
        System.out.println(list.indexOf("b1"));

        //Printing a Sublist of a list
        System.out.println(list.subList(3,6));
    }
}
