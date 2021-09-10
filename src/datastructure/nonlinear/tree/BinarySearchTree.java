package datastructure.nonlinear.tree;

public class BinarySearchTree {

    /*
    * For creating a Tree
    * we can have a Node class inside of a Tree Class
    * the Node class should have 3 fields
    * value, reference of the left child, reference of the right child
    * */

    /*
    * we can not use Static in the Outer Class
    * So, we are using static in the Inner class.
    * */
    static class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        @Override
        public String toString() {
            return "Node= " + value;
        }

        public Node(int rootValue) {
            this.value = rootValue;
        }


        /*
         * For inserting a new value into a binary search tree
         * if the inserting value is less than the value of the current Node then we will insert the value as a left child
         * if the inserting value is greater than the value of the current Node then we will insert the value as a right child
         * */
        public void insert(int value) {
        Node current = this;
            while (true) {
                if (value < current.value) {
                    if (current.leftChild == null) {
                        current.leftChild = new Node(value);
                        break;
                    }
                    current = current.leftChild;
                } else {
                    if (current.rightChild == null) {
                        current.rightChild = new Node(value);
                        break;
                    }
                    current = current.rightChild;
                }
            }
        }

        /*
         * For finding a value in a binary search tree
         * If the finding value is less than the value of current node we will look in the left child of the tree
         * If the finding value is greater than the value of current node we will look in the right child of the tree
         * */
        public void find(int value) {
            Node current = this;

            while (current != null) {
                if (value < current.value)
                    current = current.leftChild;
                else if (value > current.value)
                    current = current.rightChild;
                else{
                    System.out.println(value + " found");
                    return;
                }
            }
            System.out.println(value + " NOT found");
        }

        /*
         * For doing preOrderTraversal we will do
         * root, leftChild, rightChild
         * */
        public void preOrderTraversal() {
            preOrderTraversal(this);
        }

        private void preOrderTraversal(Node rootNode) {
            if (rootNode == null)
                return;

            System.out.println(rootNode.value);
            preOrderTraversal(rootNode.leftChild);
            preOrderTraversal(rootNode.rightChild);
        }


        /*
         * For doing inOrderTraversal we will do
         * leftChild, root, rightChild
         * */
        public void inOrderTraversal() {
            inOrderTraversal(this);
        }

        private void inOrderTraversal(Node rootNode) {
            if (rootNode == null)
                return;

            inOrderTraversal(rootNode.leftChild);
            System.out.println(rootNode.value);
            inOrderTraversal(rootNode.rightChild);
        }


        /*
         * For doing postOrderTraversal we will do
         * leftChild, rightChild, root
         * */
        public void postOrderTraversal() {
            postOrderTraversal(this);
        }

        private void postOrderTraversal(Node rootNode) {
            if (rootNode == null)
                return;

            postOrderTraversal(rootNode.leftChild);
            postOrderTraversal(rootNode.rightChild);
            System.out.println(rootNode.value);
        }


    }
}
