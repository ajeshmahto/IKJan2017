package day3.classwork.array.adhoc;

import java.util.*;

/**
 * Created by ajesh on 1/15/18.
 */
public class WindowSlidingProblem {

    public static void main(String[] args) {

        UsingBST usingBST = new UsingBST();

        int arr[] = {12, 1, 78, 90, 57, 89, 56};
        int k = 3;

        UsingQueue usingQueue = new UsingQueue();

        usingQueue.findSlidingMax(arr, k);



    }
}




class UsingQueue{

    public  void findSlidingMax(int[] a, int window){

        Deque<Integer> queue =  new LinkedList<>();

        int i=0;

        for (; i<window ; i++) {

            while (!queue.isEmpty() && a[i] > a[queue.peekLast()]){
                queue.removeLast();
            }

            queue.addLast(i);
        }


        for(; i<a.length; i++){

            System.out.print(a[queue.peek()]+" ");

            // Remove elements from first if window exceeds the range
            while (!queue.isEmpty() && queue.peek() <= i-window){
                queue.removeFirst();
            }

            // remove smallest elements
            while (!queue.isEmpty() && a[i] >= a[queue.peekLast()]){
                queue.removeLast();
            }

            queue.addLast(i);
        }

        System.out.print(a[queue.peek()]);
    }
}





class UsingBST {

    public void findRunningMax(int[] a , int window){

        int max = Integer.MIN_VALUE;

        Set<Integer> tree = new TreeSet<>();
        for (int i = 0; i < window; i++) {
            tree.add(a[i]);
        }

        for (int i = 0; i < a.length - window; i++) {

            Iterator<Integer> it = tree.iterator();

            while(it.hasNext()){
                int value = it.next();
                if(max < value){
                    max = value;
                }
            }

            System.out.println(max+" ");

            tree.remove(a[i]);
            tree.add(a[i+window]);
        }
    }
}
