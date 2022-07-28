package coforge;

public class ReverseLinkedList {
    static Node head;

    static class Node {
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
            next = null;
        }
    }//         p  c

    //1->2->3->4->5->null
    //5->4->3->2->1->null                   3->2->1->null
    private Node reverse(Node head) {
        Node currentNode = head;
        Node prev = null;
        while (null != currentNode) {
            Node tmp = currentNode.next;//3
            currentNode.next = prev;//null
            prev = currentNode;
            currentNode = tmp;
        }
        return prev;

    }

    public static void main(String args[]) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.head = new Node(1);
        reverseLinkedList.head.next = new Node(2);
        reverseLinkedList.head.next.next = new Node(3);
        reverseLinkedList.head.next.next.next = new Node(4);
        reverseLinkedList.head.next.next.next.next = new Node(5);

        System.out.println("Print Original LinkedList");
        reverseLinkedList.printLinkedList(head);
        System.out.println("Print Reverse LinkedList");
        Node reverseHead = reverseLinkedList.reverse(head);
        reverseLinkedList.printLinkedList(reverseHead);
    }

    private void printLinkedList(Node node) {
        while (null != node) {
            System.out.println(node.val);
            node = node.next;
        }
    }

}
