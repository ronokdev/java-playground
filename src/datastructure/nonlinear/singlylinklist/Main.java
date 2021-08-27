package datastructure.nonlinear.singlylinklist;

import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        LinkedList linkedList = new LinkedList();

        //Adding into the Last of the LinkedList
        linkedList.addLast(3);
        linkedList.addLast(7);
        linkedList.addLast(37);
        linkedList.addLast(77);

        //Adding into the first of the LinkedList
        linkedList.addFirst(990);
        linkedList.addFirst(1990);

        //Printing the Full LinkList from First to Last
        linkedList.printLinkList();



    }
}
