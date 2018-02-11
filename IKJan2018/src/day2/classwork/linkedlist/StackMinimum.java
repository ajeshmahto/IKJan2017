package day2.classwork.linkedlist;

import java.util.Stack;

/**
 * Created by ajesh on 1/21/18.
 */
public class StackMinimum {

    static  Stack<DataWrapper> stack = new Stack<>();
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        stack.push(new DataWrapper(3,3));
        stack.push(new DataWrapper(4,3));
        stack.push(new DataWrapper(2,2));
        stack.push(new DataWrapper(8,2));
        stack.push(new DataWrapper(1,1));

        System.out.println(getMinimum());
        stack.pop();
        System.out.println(getMinimum());
        stack.pop();
        stack.pop();
        System.out.println(getMinimum());


    }

    /*static void customPop(){
        int minValue;
        if(!stack.isEmpty()){
            minValue = stack.pop().minValueTillNow;

            if(!stack.isEmpty() && stack.peek().minValueTillNow < minValue){

                DataWrapper dwupdate = stack.pop();
                dwupdate.minValueTillNow = minValue;

                stack.push(dwupdate);
            }

        }
    }*/

    static int getMinimum(){

        if(!stack.isEmpty()){
          return  stack.peek().minValueTillNow;
        }
        return -1;
    }

    public static class DataWrapper {
        public int value;
        public int minValueTillNow;

        public DataWrapper(int value, int minValueTillNow){
            this.value = value;
            this.minValueTillNow = minValueTillNow;

        }

    }
}
