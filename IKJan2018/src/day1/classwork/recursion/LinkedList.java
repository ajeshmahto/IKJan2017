package day1.classwork.recursion;

/**
 * Created by ajesh on 1/11/18.
 */
public class LinkedList {

    public static void main(String[] args) {

        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
         add(a, 1);
         add(b, 2);
         add(a,5);

    }

    public static boolean findCycle(Node head){

        if(head==null) return  false;
        Node slow  = head;
        Node fast = head;

        while (head.next!=null){
            if(slow==fast) return  true;
            slow = head.next;
            fast = head.next.next;
        }

         return  false;
    }

    public  static  void add(Node head, int data){


        Node next = head;

        if(head==null){
           head = new Node();
           head.data = data;
        }

        else {
            while(head.next!=null){
                  next = head.next;
            }

            next.data = data;
        }
    }
}


class Node{

      Node next;
      int data;


}