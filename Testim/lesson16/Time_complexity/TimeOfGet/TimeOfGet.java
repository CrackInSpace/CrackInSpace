package lesson16.Time_complexity.TimeOfGet;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TimeOfGet {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfGet(fill(new ArrayList<>())));
        System.out.println(getTimeMsOfGet(fill(new LinkedList<>())));
    }
    public static long getTimeMsOfGet(List list){// I-st     List list = fill(new ArrayList<>());
        Date startTime = new Date();
        get10000(list);
        Date endTime = new Date();
        return endTime.getTime() - startTime.getTime();
    }

    public static void get10000(List list){
        if(list.isEmpty()) return;
        int x = list.size() / 2;

        for(int i = 0; i < 10000; i++){
            list.get(x);
        }
    }

    private static List fill(List list){// II-nd    List list = new ArrayList<>();
        for(int i = 0; i < 10000; i++){
            list.add(new Object());
        }
        return list;
    }
}
