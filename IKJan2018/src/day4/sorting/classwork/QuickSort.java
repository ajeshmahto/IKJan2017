package day4.sorting.classwork;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] data = new int[]{3,5,10,1,0};
        QuickSort(data, 0, 4);
        System.out.println(Arrays.toString(data));

    }

    public static void QuickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pivot = partition(arr, low, high);
            QuickSort(arr, low, pivot - 1);
            QuickSort(arr, pivot+1 , high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = (low-1);

        for (int j = low; j < high; j++) {

            if(arr[j] <= pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }


        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

   
}
