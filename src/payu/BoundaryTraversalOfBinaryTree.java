package payu;

import java.util.ArrayList;
import java.util.Stack;

public class BoundaryTraversalOfBinaryTree {

    ArrayList<Integer> ans = new ArrayList<>();

    ArrayList<Integer> boundary(Node node) {
        ans.add(node.data);
        if (node.left != null) {
            left(node.left);
        }
        if (!isLeaf(node)) {
            leaves(node);
        }
        if (node.right != null) {
            right(node.right);
        }
        return ans;
    }

    public void left(Node root) {
        while (true) {
            if (root == null || isLeaf(root)) {
                break;
            }
            ans.add(root.data);
            if (root.left != null) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
    }

    public boolean isLeaf(Node root) {
        if (root != null && root.left == null && root.right == null) {
            return true;
        }
        return false;
    }

    public void leaves(Node root) {
        if (root == null) {
            return;
        }
        if (isLeaf(root)) {
            ans.add(root.data);
            return;
        }
        leaves(root.left);
        leaves(root.right);
    }

    public void right(Node root) {
        Stack<Integer> s = new Stack<>();
        while (true) {
            if (root == null || isLeaf(root)) {
                break;
            }
            s.add(root.data);
            if (root.right == null) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        while (!s.isEmpty()) {
            ans.add(s.pop());
        }
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
