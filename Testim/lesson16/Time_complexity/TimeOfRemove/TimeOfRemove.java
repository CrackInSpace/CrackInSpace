package lesson16.Time_complexity.TimeOfRemove;
/*
Посчитать время работы метода remove в LinkedList и ArrayList
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TimeOfRemove {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfRemove(fill(new ArrayList<>())));
        System.out.println(getTimeMsOfRemove(fill(new LinkedList<>())));
    }
    public static long getTimeMsOfRemove(List list){// I-st     List list = fill(new ArrayList<>());
        Date startTime = new Date();
        remove10000(list);
        Date endTime = new Date();
        return endTime.getTime() - startTime.getTime();
    }

    public static void remove10000(List list){
        if(list.isEmpty()) return;
        list.remove(0);
    }

    private static List fill(List list){// II-nd    List list = new ArrayList<>();
        for(int i = 0; i < 10000; i++){
            list.add(new Object());
        }
        return list;
    }
}