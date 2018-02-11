package day2.classwork.linkedlist;

/**
 * Created by ajesh on 1/21/18.
 */
public class FindMedian {

    public static void main(String[] args) {
        LinkedListNode l = new LinkedListNode(1);
       // _insert_node_into_singlylinkedlist();
    }

    public static class LinkedListNode {
        int val;
        LinkedListNode next;

        LinkedListNode(int node_value) {
            val = node_value;
            next = null;
        }
    }

    public static LinkedListNode _insert_node_into_singlylinkedlist(LinkedListNode head, LinkedListNode tail, int val) {
        if(head == null) {
            head = new LinkedListNode(val);
            tail = head;
        }
        else {
            tail.next = new LinkedListNode(val);
            tail = tail.next;
        }
        return tail;
    }

    static int find_median(LinkedListNode ptr) {


        LinkedListNode slowPointer = ptr;
        LinkedListNode fastPOinter = ptr;
        if(ptr!=null){
            while(fastPOinter!=null && fastPOinter.next !=null){
                fastPOinter = fastPOinter.next.next;
                slowPointer = slowPointer.next;

            }
        }



        return slowPointer.val;
    }


}



