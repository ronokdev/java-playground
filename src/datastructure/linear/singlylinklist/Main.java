package datastructure.linear.singlylinklist;

public class Main {
    public static void main(String args[]){
        LinkedList linkedList = new LinkedList();

        //Adding into the Last of the LinkedList
        linkedList.addLast(992);
        linkedList.addLast(993);
        linkedList.addLast(994);
        linkedList.addLast(995);

        //Adding into the first of the LinkedList
        linkedList.addFirst(991);
        linkedList.addFirst(990);
        System.out.println("-----------");

        //Printing the Full LinkList from First to Last
        linkedList.printLinkList();
        System.out.println("-----------");

        //Checking the exact index of the value of a Node
        System.out.println("Index of 37  is :: "+linkedList.indexOf(37));
        System.out.println("Index of 994 is :: "+linkedList.indexOf(994));
        System.out.println("-----------");

        //Checking if the LinkedList's node contains a specific value
        System.out.println("LinkedList Contains 990  :: "+linkedList.contains(990));
        System.out.println("LinkedList Contains 9990 :: "+linkedList.contains(9990));
        System.out.println("-----------");

        //Printing linkedList with Two pointers
        linkedList.printLinkedListWithPrevPointer();
        System.out.println("-----------");

        // insert(NOT REPLACING) in a specific index
        linkedList.insertInIndex(0,455);  // inserting at the BEGINNING at the LinkedList
        linkedList.insertInIndex(3,898);  // inserting at the 3RD Index of the LinkedList
        linkedList.insertInIndex(73,996); // inserting at the END of the LinkedList
        linkedList.insertInIndex(100,997); // inserting at the END of the LinkedList
        System.out.println("-----------");
    }
}
