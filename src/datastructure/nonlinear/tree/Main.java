package datastructure.nonlinear.tree;

public class Main {
    public static void main(String[] args){
        BinarySearchTree.Node binarySearchTree = new BinarySearchTree.Node(6);

        /*
         *                 6
         *             /       \
         *           4           14
         *          / \       /      \
         *         1   5     8        17
         *                  / \     /    \
         *                 7   9    16   18
         * */

        binarySearchTree.insert(4);
        binarySearchTree.insert(14);
        binarySearchTree.insert(1);
        binarySearchTree.insert(5);
        binarySearchTree.insert(8);
        binarySearchTree.insert(17);
        binarySearchTree.insert(9);
        binarySearchTree.insert(7);
        binarySearchTree.insert(16);
        binarySearchTree.insert(18);

        binarySearchTree.find(10);
        binarySearchTree.find(11);
        binarySearchTree.find(9);
        binarySearchTree.find(6);


        //Remove from Tree

        //Remove Leaf Node
//        binarySearchTree.removeElement(5);
        System.out.println("");


        //Remove Root Node
//        binarySearchTree.removeElement(6);

        //Remove Intermediate Nodes
//        binarySearchTree.removeElement(14);
//        binarySearchTree.removeElement(4);
        System.out.println("");

        System.out.println("Pre Order");
        binarySearchTree.preOrderTraversal();

        System.out.println("Post Order");
        binarySearchTree.postOrderTraversal();

        System.out.println("In Order");
        binarySearchTree.inOrderTraversal();


    }
}
