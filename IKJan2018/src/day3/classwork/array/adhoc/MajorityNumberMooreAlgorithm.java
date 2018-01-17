package day3.classwork.array.adhoc;

/**
 * Created by ajesh on 1/15/18.
 */
public class MajorityNumberMooreAlgorithm {
    public static void main(String[] args) {
        int[] a = new int[]{1,3,4,3};
        int cand = findCandidate(a);

        System.out.println(cand);
        System.out.println(isMajority(a,cand));
    }



    public static boolean isMajority(int[] a , int cand){
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == cand){
                count++;
            }
        }

        if(count> a.length/2){
            return true;
        }

        return false;
    }



    public static int findCandidate(int[] a){
        int count = 0;
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[index] == a[i]){
                count++;
            }

            else {
                count--;
            }

            if(count==0){
                index =i;
                count =1;
            }
        }

        return a[index];
    }
}
