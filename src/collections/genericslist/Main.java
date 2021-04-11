package collections.genericslist;

import java.util.Iterator;

public class Main {
    public static void main(String[] args)
    {
        GenericList genericList = new GenericList<Integer>();  // we can only pass reference types we can not pass primitive types

        genericList.add(1);
        genericList.add(4);

        System.out.println("one way of Printing");
        for (Object list : genericList)
        {
            System.out.println(list);
        }

        System.out.println("Another way of Printing");
        Iterator listIterator = genericList.iterator();
        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
    }
}
