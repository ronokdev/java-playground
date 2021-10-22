package javacollections.queueinterface;

import java.util.ArrayDeque;
import java.util.Queue;

public class Customer {
    public static void customerQueue()
    {
        Queue<String> stringQueue = new ArrayDeque<>();

        stringQueue.add("b");
        stringQueue.add("c");
        stringQueue.add("d");

        //Adding a new element to the end of the Queue
        stringQueue.offer("e"); //the Offer method returns NULL if the queue is FULL. It does not throws an ERROR.
        System.out.println(stringQueue);

        //peeking the First element of the Queue
        System.out.println("The first element is : "+stringQueue.peek()); //peek throws NULL if we try to peek an empty Queue
        System.out.println("The first element is : "+stringQueue.element());//element throws an EXCEPTION if we try to peek an empty Queue

        //Removing the Item from the Queue
        System.out.println(stringQueue.remove()); // remove throws EXCEPTION if we want to remove an element from an Empty queue
        System.out.println(stringQueue.poll()); //poll throws NULL if we want to remove an element from an Empty queue

        System.out.println(stringQueue);




    }
}
