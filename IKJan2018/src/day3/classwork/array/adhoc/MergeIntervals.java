package day3.classwork.array.adhoc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ajesh on 1/15/18.
 */
public class MergeIntervals {

    public static List<Intervals> mergeIntervalsEfficient(List<Intervals> intervals) {
        if(intervals.size()<1){
            return intervals;
        }
        intervals.sort((i1,i2)->Integer.compare(i1.start,i2.start));
        
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;


        List<Intervals> result = new ArrayList<>();
        for (Intervals interval : intervals) {
            if (interval.start <= end) {
                end = Math.max(interval.end, end);
            }
            else {
                result.add(new Intervals(start, end));
                start = interval.start;
                end = interval.end;
            }
        }

        result.add(new Intervals(start, end));
        return result;
    }



    public static void main(String[] args) {

        List<Intervals> intervals = new ArrayList<>();

        intervals.add(new Intervals(1,3));
        intervals.add(new Intervals(2,4));
        intervals.add(new Intervals(5,7));
        intervals.add(new Intervals(6,8));

        List<Intervals> result = mergeIntervalsEfficient(intervals);

        for(Intervals i : result){
            System.out.print("{"+i.getStart()+","+i.getEnd()+"} ");
        }


    }

    public static List<Intervals> merge(List<Intervals> listIntervals){

        int start1, end1, start2, end2;

        for (int i = 0; i < listIntervals.size(); i++) {
            for (int j = i+1; j < listIntervals.size(); j++) {


                if (listIntervals.get(i).getStart() <= listIntervals.get(j).getStart() && listIntervals.get(i).getEnd() > listIntervals.get(j).getEnd()) {
                    j--;
                    listIntervals.remove(listIntervals.get(j));

                } else if (listIntervals.get(i).getStart() < listIntervals.get(j).getStart() && listIntervals.get(i).getEnd() < listIntervals.get(j).getEnd()) {
                    listIntervals.remove(listIntervals.get(j));
                    listIntervals.get(i).setEnd(listIntervals.get(j).getEnd());
                    j--;
                } else if (listIntervals.get(i).getStart() > listIntervals.get(j).getStart() && listIntervals.get(i).getEnd() < listIntervals.get(j).getEnd()) {
                    listIntervals.get(i).setEnd(listIntervals.get(j).getEnd());
                    listIntervals.get(i).setStart(listIntervals.get(j).getStart());
                    listIntervals.remove(listIntervals.get(j));
                    j--;

                } else if (listIntervals.get(i).getStart() > listIntervals.get(j).getStart() && listIntervals.get(i).getEnd() > listIntervals.get(j).getEnd()) {
                    listIntervals.remove(listIntervals.get(j));
                    listIntervals.get(i).setStart(listIntervals.get(j).getStart());
                    j--;
                }
            }

        }

        return listIntervals;
    }
}







class Intervals {

    int start;
    int end;

    public Intervals(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
