package day3.classwork.array.adhoc;

/**
 * Created by ajesh on 1/15/18.
 */
public class LargestSumOfContigeuosArray {

    public static void main(String[] args) {

        int[] a = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(largestSum(a));

    }

    public static  int largestSum(int[] a){
        int max_till_now  = 0 , max_ending = 0;

        for (int i = 0; i < a.length; i++) {
            max_ending+= a[i];

            if(max_ending<0){
                max_ending =0;
            }

            if(max_till_now < max_ending){
                max_till_now = max_ending;
            }
        }

        return  max_till_now;
    }
}
