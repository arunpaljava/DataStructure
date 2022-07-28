package linkedlist;

public class ReverseLinkedListInPaired {
    static Node head;
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static void main(String args[]) {
        ReverseLinkedListInPaired linkedList = new ReverseLinkedListInPaired();
        int k=3;
        linkedList.head = new Node(1);
        linkedList.head.next = new Node(2);
        linkedList.head.next.next = new Node(3);
        linkedList.head.next.next.next = new Node(4);
        linkedList.head.next.next.next.next = new Node(5);
        linkedList.head.next.next.next.next.next = new Node(6);
        linkedList.head.next.next.next.next.next.next = new Node(7);
        printLinkedList(head);
        //Node reverseNode = reverseLinkedlist(head);
        //System.out.println("");
        //System.out.println("Reverse LinkedList");
        //printLinkedList(reverseNode);
        System.out.println("");
        System.out.println("Reverse LinkedList In Pair "+k);
        Node reverseInPair = reverseLinkedlistInPair(head,k);
        printLinkedList(reverseInPair);

    }

    private static Node reverseLinkedlistInPair(Node head, int k) {
        if(head == null) {
            return null;
        }
        Node current = head;
        Node next = null;
        Node prev = null;
        int count = 0;

        /* Reverse first k nodes of linked list */
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        /* next is now a pointer to (k+1)th node
           Recursively call for the list starting from
           current. And make rest of the list as next of
           first node */
        if (next != null) {
            head.next = reverseLinkedlistInPair(next, k);
        }

        // prev is now head of input list
        return prev;

    }

    private static Node reverseLinkedlist(Node head) {
        Node currNode = head;
        Node prev = null;
        while(null != currNode){
            Node tmp = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = tmp;
        }
        return prev;
    }

    private static void printLinkedList(Node head) {
        while (null !=head){
            System.out.print(head.data+"->");
            head = head.next;
        }
    }

}
