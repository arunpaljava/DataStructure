package linkedlist;

public class ReverseLinkedList {

    static Node head;
    static class Node {
        int val;
        Node next;

        Node(int val){
            this.val=val;
        }
    }

    public static void main(String s[]){
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.head = new Node(1);
        reverseLinkedList.head.next = new Node(2);
        reverseLinkedList.head.next.next = new Node(3);
        reverseLinkedList.head.next.next.next = new Node(4);
        reverseLinkedList.head.next.next.next.next = new Node(5);
        System.out.println("Print Original LinkedList");
        reverseLinkedList.printLinkedList(head);
        System.out.println("Print Reverse LinkedList");
        Node revHead = reverseLinkedList.revLinkedList(head);
        reverseLinkedList.printLinkedList(revHead);
    }

    private Node revLinkedList(Node head) {
        Node currNode = head;
        Node prev = null;
        while (currNode != null){
            Node tmpNode = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = tmpNode;
        }
        return prev;
    }

    void printLinkedList(Node node) {
        while (node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}
