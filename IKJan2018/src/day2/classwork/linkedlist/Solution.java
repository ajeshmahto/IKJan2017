package day2.classwork.linkedlist;

import java.util.Stack;

/**
 * Created by ajesh on 1/20/18.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(maxLenMatchingParen("()(())"));
    }
    static int maxLenMatchingParen(String str) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = str.toCharArray();
        int maxCount = Integer.MIN_VALUE;
        int count=0;


        for(int i = 0; i<charArray.length; i++){
            if(charArray[i]==')' && stack.isEmpty()) continue;

            if(charArray[i]== '('){
                if(count>0){
                    while(!stack.isEmpty()){
                        stack.pop();
                        count =0;
                    }

                }

                stack.push('(');


            }

            else if(charArray[i] == ')'){
                char value = stack.pop();
                if(value == '('){
                    count++;
                    if(maxCount < count){
                        maxCount = count;
                    }

                }
                else {
                    while(!stack.isEmpty()){
                        stack.pop();
                    }

                    count = 0;
                }
            }
        }
        return maxCount*2;
    }

}
