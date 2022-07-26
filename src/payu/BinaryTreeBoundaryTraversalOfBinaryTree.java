package payu;

public class BinaryTreeBoundaryTraversalOfBinaryTree {

    static Node root;

    public static void main(String args[]) {
        BinaryTreeBoundaryTraversalOfBinaryTree binaryTree = new BinaryTreeBoundaryTraversalOfBinaryTree();
        binaryTree.root = new Node(20);
        binaryTree.root.left = new Node(8);
        binaryTree.root.left = new Node(4);
        binaryTree.root.left.right = new Node(12);
        binaryTree.root.left.right.left = new Node(10);
        binaryTree.root.left.right.right = new Node(14);
        binaryTree.root.right = new Node(22);
        binaryTree.root.right.right = new Node(25);
        binaryTree.printBoundary(binaryTree.root);
    }

    private void printBoundary(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        // Print the left boundary in top-down manner.
        printBoundaryLeft(node.left);
        // Print all leaf nodes
        printLeaves(node.left);
        printLeaves(node.right);
        // Print the right boundary in bottom-up manner
        printBoundaryRight(node.right);
    }

    private void printBoundaryRight(Node node) {
        if (node == null)
            return;
        if (node.right != null) {
            // to ensure bottom up order, first call for right // subtree, then print this node
            printBoundaryRight(node.right);
            System.out.print(node.data + " ");
        } else if (node.left != null) {
            printBoundaryRight(node.left);
            System.out.print(node.data + " ");
        } // do nothing if it is a leaf node, this way we avoid // duplicates in output
    }
    private void printBoundaryLeft(Node node) {
        if (node == null)
            return;
        if (node.left != null) {
            // to ensure top down order, print the node // before calling itself for left subtree
            System.out.print(node.data + " ");
            printBoundaryLeft(node.left);
        } else if (node.right != null) {
            System.out.print(node.data + " ");
            printBoundaryLeft(node.right);
        } // do nothing if it is a leaf node, this way we avoid // duplicates in output
    }

    private void printLeaves(Node node) {
        if (node == null)
            return;

        printLeaves(node.left);
        // Print it if it is a leaf node
        if (node.left == null && node.right == null)
            System.out.print(node.data + " ");
        printLeaves(node.right);
    }

    static class Node {
        Node left;
        Node right;
        int data;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
}
