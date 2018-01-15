package day1.classwork.recursion;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ajesh on 1/11/18.
 */
public class LRUCache {

    public static void main(String[] args) {

    }


}


class LRU {

    Map<Object, Node> cache = new HashMap<>();

    public  Object get(Object obj) {

        Object o1 = new Object();
        Node node1 = new Node();

        if (cache.get(obj) == null) {
            cache.put(obj, node1);
        } else {

            return cache.get(obj);


        }
       return  null;
    }

    public boolean isFull(){
        return false;
    }
}