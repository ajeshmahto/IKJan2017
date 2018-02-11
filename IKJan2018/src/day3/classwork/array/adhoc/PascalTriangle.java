package day3.classwork.array.adhoc;

/**
 * Created by ajesh on 1/28/18.
 */
public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n][n];
        printPascalTriangle(5, arr);
    }

    private static void printPascalTriangle(int n, int[][] arr) {

        arr[0][0] = 1;



        for (int i = 0; i <n; i++) {
            System.out.print(1+" ");
            for (int j = 0; j < i; j++) {

                if(j == i){
                    arr[i][j] = 1;
                    System.out.print(j+1 + " ");
                }
                else if(i != j) {
                    int value = arr[i-1][j-1] + arr[i-1][j];
                    System.out.print(value+ " ");
                    arr[i][j] = value;
                }
            }
            System.out.println();

        }
    }


}
