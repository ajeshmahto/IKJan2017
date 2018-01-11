package day1.classwork.recursion;

/**
 * Created by ajesh on 1/10/18.
 */
public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(4, 'A', 'B', 'C');
    }

    public static void towerOfHanoi(int n, char from_rod, char to_rod, char helper_rod){

        if(n==1){
            System.out.printf("Moving rod %d from %c to %c" , n, from_rod , to_rod);
            System.out.println();
            return;
        }

        towerOfHanoi(n-1, from_rod , helper_rod, to_rod);
        System.out.printf("Moving rod %d from %c to %c" , n, from_rod , to_rod);
        System.out.println();
        towerOfHanoi(n-1, helper_rod , to_rod , from_rod);
    }
}
