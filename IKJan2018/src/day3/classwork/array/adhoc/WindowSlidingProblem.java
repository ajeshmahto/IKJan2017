package day3.classwork.array.adhoc;

import java.util.*;

/**
 * Created by ajesh on 1/15/18.
 */
public class WindowSlidingProblem {

    public static void main(String[] args) {

        UsingBST usingBST = new UsingBST();

        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        UsingQueue usingQueue = new UsingQueue();

        usingQueue.findSlidingMax(arr, k);




    }
}


class UsingQueue {

    public void findSlidingMax(int[] a, int window) {

        Deque<Integer> queue = new LinkedList<>();

        int i = 0;

        for (; i < window; i++) {

            while (!queue.isEmpty() && a[i] > a[queue.peekLast()]) {
                queue.removeLast();
            }

            queue.addLast(i);
        }


        for (; i < a.length; i++) {

            System.out.print(a[queue.peek()] + " ");

            // Remove elements from first if window exceeds the range
            while (!queue.isEmpty() && queue.peek() <= i - window) {
                queue.removeFirst();
            }

            // remove smallest elements
            while (!queue.isEmpty() && a[i] >= a[queue.peekLast()]) {

                queue.removeLast();
            }

            queue.addLast(i);
        }

        System.out.print(a[queue.peek()]);
    }


    public void findMaximum(int[] arr, int window) {

        Deque<Integer> queue = new LinkedList<>();
        int i = 0;
        for (; i < window; i++) {
            while (!queue.isEmpty() && arr[i] >= arr[queue.peekLast()]) {
                queue.removeLast();
            }
            queue.addLast(i);
        }

        for (; i < arr.length; i++) {

            System.out.println(arr[queue.peekLast()]);

            while (!queue.isEmpty() && queue.peekFirst() <= i - window) {
                queue.removeFirst();
            }

            while (!queue.isEmpty() && arr[i] >= arr[queue.peekLast()]) {
                queue.removeLast();
            }

            queue.addLast(i);
        }
        System.out.println(arr[queue.peekLast()]);
    }

}


class UsingBST {

    public void findRunningMax(int[] a, int window) {

        int max = Integer.MIN_VALUE;

        Set<Integer> tree = new TreeSet<>();
        for (int i = 0; i < window; i++) {
            tree.add(a[i]);
        }

        for (int i = 0; i < a.length - window; i++) {

            Iterator<Integer> it = tree.iterator();

            while (it.hasNext()) {
                int value = it.next();
                if (max < value) {
                    max = value;
                }
            }

            System.out.println(max + " ");

            tree.remove(a[i]);
            tree.add(a[i + window]);
        }
    }
}
