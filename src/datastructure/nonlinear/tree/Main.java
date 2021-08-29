package datastructure.nonlinear.tree;

public class Main {
    public static void main(String[] args){
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(7);
        binarySearchTree.insert(4);
        binarySearchTree.insert(9);
        binarySearchTree.insert(1);
        binarySearchTree.insert(6);
        binarySearchTree.insert(8);
        binarySearchTree.insert(10);

        System.out.println(binarySearchTree.find(10));
        System.out.println(binarySearchTree.find(11));

        System.out.println("Pre Order");
        binarySearchTree.preOrderTraversal();

        System.out.println("Post Order");
        binarySearchTree.postOrderTraversal();

        System.out.println("In Order");
        binarySearchTree.inOrderTraversal();


    }
}
