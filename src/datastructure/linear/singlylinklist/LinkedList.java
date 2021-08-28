package datastructure.linear.singlylinklist;

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

    /*
    * printing LinkedList value with index Number
    * */
    public void printLinkList(){
        Node current = first;
        System.out.println("printing linkedList from FirstToLast : ");
        int index =0;
        while(current != null){
            System.out.println("index "+ index+" - value : "+current.value);
            current = current.next;
            index++;
        }
    }

    //Getting the Index of a specific Value
    public int indexOf(int item){
        int index =0;
        Node current = first;
        while(current.next != null){
            if(current.value == item){
                return index;
            }
            else{
                current = current.next;
            }
            index++;
        }
        return -1;
    }

    //Checking if a Specific value is present in the LinkedList
    public boolean contains(int item){
        return indexOf(item) != -1;
    }


    /*
    * Traversing linkedList with Two Pointers
    * keeping track of Previous Index with 'prevIndex'
    * keeping track of Previous Nodes with 'previous'
    * */
    public void printLinkedListWithPrevPointer(){
       Node current = first;
       int index =0;

       Node previous = first;
       int prevIndex =0;

       while (previous.next != null){
           System.out.print("Current Index  :: "+index);
           System.out.print(" -- current Value  :: "+current.value);
           System.out.println();
           System.out.print("Previous Index :: "+(prevIndex = (index-1 == -1) ? 0 : (index -1)));
           System.out.print(" -- Previous Value :: "+previous.value);
           System.out.println();
           System.out.println();

           previous = current; //Storing the Previous Node
           current = current.next;
           index++;
       }
    }
}


















