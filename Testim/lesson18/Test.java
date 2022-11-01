package lesson18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Hi", 12);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
        System.out.println();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {//Key: Hi Values: 12
            System.out.println("Key: " + entry.getKey() + "\nValues: " + entry.getValue());
        }
        System.out.println();

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();//Итератор для HashMap
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "\n" + entry.getValue());
        }
    }
}
