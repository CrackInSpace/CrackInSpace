package lesson16.Time_complexity.TimeOfInsert;

import java.util.*;

public class TimeOFInsert {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(fill(new ArrayList<>())));
        System.out.println(getTimeMsOfInsert(fill(new LinkedList<>())));
    }
    public static long getTimeMsOfInsert(List list){// I-st     List list = fill(new ArrayList<>());
        Date startTime = new Date();
        insert10000(list);
        Date endTime = new Date();
        return endTime.getTime() - startTime.getTime();
    }

    public static void insert10000(List list){
        for(int i = 0; i < 10000; i++){
            list.add(0, new Object());
        }
    }

    private static List fill(List list){// II-nd    List list = new ArrayList<>();
        for(int i = 0; i < 10000; i++){
            list.add(new Object());
        }
        return list;
    }
}
