package datastructure.nonlinear.singlylinklist;

public class LinkedList {

    /*
    * declaring Node
    * */
    private class Node{
        private int value;
        private Node next;

        private Node (int value) {
            this.value = value;
        }
    }

    /*
    * declaring the first and Last Node POINTERS
    *  */
    private Node first;
    private Node last;

    /*
    * To add a new Value at Last of linkedList
    * we have to Create a NODE first
    * then set the 'value' and the 'next' field
    * */
    public void addLast(int item){
        /*
        * creating new Node
        * setting the 'value'(Via Constructor) and 'next' Field
        * */
        Node node = new Node(item);
        node.next = null;

        if(first == null){   // this means the LinkedList is empty
          first = node;
          last = node;
        }
        else{
            last.next = node;
            last = node;
        }
    }
    public void addFirst(int item){
        Node node = new Node(item);

        if(first == null){
            first = last = node;
            node.next = null;
        }
        else{
            node.next = first;
            first = node;
        }
    }
}
