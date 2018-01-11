package day1.classwork.recursion;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ajesh on 1/11/18.
 */
public class FindAllSubset {
    public static void main(String[] args) {

        ArrayList<Integer> set = new ArrayList<>(Arrays.asList(1,2,3));


        ArrayList<ArrayList<Integer>> resultAllSet ;
        resultAllSet = findAllSubset(set);

        for (int i = 0; i < resultAllSet.size(); i++) {
            ArrayList<Integer> tempSet = resultAllSet.get(i);
            for (int j = 0; j < tempSet.size(); j++) {

                System.out.print(tempSet.get(j)+" ");
            }
            System.out.println();
        }

    }

    public  static ArrayList<ArrayList<Integer>> findAllSubset(ArrayList<Integer> set){
        ArrayList<ArrayList<Integer>> allSubSet = new ArrayList<>();
        allSubSet.add(new ArrayList<>());

       findAllSubset(allSubSet,set, 0);

        return allSubSet;


    }


    public  static void findAllSubset(ArrayList<ArrayList<Integer>> allSubset, ArrayList<Integer> set, int index){

        if(index == set.size()) return ;

        int allSubSetSize = allSubset.size();

        ArrayList<Integer> newSet;

        for (int i = 0; i < allSubSetSize; i++) {
            newSet = cloneList(allSubset.get(i));
            newSet.add(set.get(index));
            allSubset.add(newSet);
        }


       findAllSubset(allSubset,set,index+1);


    }

    public static ArrayList<Integer> cloneList(ArrayList<Integer> list){
         ArrayList<Integer> cloneArray = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            cloneArray.add(list.get(i));
        }

        return  cloneArray;
    }
}
