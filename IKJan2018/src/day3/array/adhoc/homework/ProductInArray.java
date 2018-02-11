package day3.array.adhoc.homework;

import java.util.Arrays;

/**
 * Created by ajesh on 1/27/18.
 */
public class ProductInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        arr = findProduct(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static int[] findProduct(int[] arr) {
        int p = 1;
        int[] beforeArray = new int[arr.length];
        int[] afterArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            beforeArray[i] = p;
            p*= arr[i];
        }
        p =1;
        for (int i = arr.length-1; i >=0; i--) {
            afterArray[i] = p;
            p*= arr[i];
        }

        for (int i = 0; i < arr.length; i++) {

            arr[i] = beforeArray[i] * afterArray[i];
        }
        return arr;
    }

}
