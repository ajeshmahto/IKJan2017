package day1.test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ajesh on 1/8/18.
 */
public class FindMissingNumber {
    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{3,4,1,5}));
        System.out.println(findMissingXor(new int[]{3,4,1,5}));

    }

    public static int findMissingNumber(int[] numbers){
         Set<Integer> set = new HashSet<>();
         for(Integer i : numbers){
             set.add(i);
         }

        for(int i=1 ; i<numbers.length;i++){
            if(!set.contains(i)){
                return  i;
            }
        }

        return  numbers.length+1;

    }

    public static int findMissingXor(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = result ^ numbers[i] ^ i;
        }

        return result;
    }
}


