package lesson16.Time_complexity.TimeOfSet;
/*
Посчитать время работы метода set в LinkedList и ArrayList
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TimeOfSet {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfSet(fill(new ArrayList<>())));
        System.out.println(getTimeMsOfSet(fill(new LinkedList<>())));
    }
    public static long getTimeMsOfSet(List list){// I-st     List list = fill(new ArrayList<>());
        Date startTime = new Date();
        set10000(list);
        Date endTime = new Date();
        return endTime.getTime() - startTime.getTime();
    }

    public static void set10000(List list){
        if(list.isEmpty()) return;
        int x = list.size() / 2;

        for(int i = 0; i < 10000; i++){
            list.set(x, new Object());
        }
    }

    private static List fill(List list){// II-nd    List list = new ArrayList<>();
        for(int i = 0; i < 10000; i++){
            list.add(new Object());
        }
        return list;
    }
}