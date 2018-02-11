package day2.classwork.linkedlist;

public class DoublyLinkedList {
    Node head;
    Node tail;

    public static void main(String[] args) {
       DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtLast(99);
        dll.addFront(10);
        dll.addFront(30);
        dll.addFront(5);
        dll.addFront(9);
        dll.insertAtLast(15);
        dll.printForward();


    }

    private void addFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if(head!=null){
            head.prev = newNode;
        }
        if (tail == null) {
            tail = newNode;
        }
        head = newNode;
    }


    private void insertAtLast(int data) {
        Node newNode = new Node(data);
        newNode.next =null;
        if(tail!=null){
            newNode.prev = tail;
            tail.next = newNode;
        }
        if (head == null) {
            head = newNode;
        }
        tail = newNode;


    }

    private void printForward() {

        Node firstNode = head;
        Node lastNode  = tail;
        while(firstNode!=null){
            System.out.print(firstNode.value+" ");
            firstNode = firstNode.next;
        }
        System.out.println();
        while (lastNode != null) {
            System.out.print(lastNode.value + " ");
            lastNode = lastNode.prev;
        }

    }

   private class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

}

