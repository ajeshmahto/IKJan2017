package day2.classwork.linkedlist;

import java.util.HashMap;

/**
 * Created by ajesh on 1/11/18.
 */
public class LRUCache {
    private  Node head;
    private  Node tail;
    private HashMap<Integer, Node> map = new HashMap<>();
    private int capacity;
    private  int count = 0;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);

        cache.put(1, 10);
        cache.put(2, 20);
        cache.put(3, 30);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        cache.put(4, 40);
        cache.put(5, 50);
        System.out.println(cache.get(4));
        System.out.println(cache.get(2));


    }

    void put(int key, int value) {
        if (map.get(key) == null) {
            Node newNode = new Node(key, value);
            if (capacity < count) {
                Node popNode =  popTail();
                map.remove(popNode.key);
            }
            map.put(key, newNode);
            insertAtTop(newNode);
            count++;
        }
        else {
             map.get(key).value = value;
        }
    }

    int get(int key) {
        Node node = map.get(key);

        if(map.get(key)!=null){

            moveToTop(node);
            return node.value;

        }

        else {
            return  -1;
        }
    }



    private class Node {
        int key;
        int value;
        Node next;
        Node prev;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    void insertAtTop(Node newNode) {
        if(head!=null){
            newNode.next = head;
        }
        if(newNode.next==null){
            tail = newNode;
        }

        head = newNode;
    }

    Node popTail(){

       if(tail==null) return null;

        Node removedNode = tail.prev;

        tail = tail.prev;

        if (tail.prev != null) {
            tail.prev.prev = null;
            tail.prev.next = null;
        }

        return removedNode;

    }

    void moveToTop(Node nodeToMove) {
        if(head==null) return;

        nodeToMove.next = null;
        nodeToMove.prev = null;

        insertAtTop(nodeToMove);

    }

}
