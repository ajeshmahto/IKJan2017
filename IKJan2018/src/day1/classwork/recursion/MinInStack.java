package day1.classwork.recursion;

import java.util.Stack;

/**
 * Created by ajesh on 1/11/18.
 */
public class MinInStack {

    Stack<Integer> stack = new Stack<>();


     int min = Integer.MAX_VALUE;

    public void push(int data){
        if(data> min){
           stack.push(data);
        }
        else {
            int elemTopush = 2*data-min;
            min = data;
            stack.push(elemTopush);
        }
    }

    public int pop(){
        int popElement = stack.pop();
        if(stack.peek()< min){
            min = 2*min - popElement;
        }

        return min;
    }

}
