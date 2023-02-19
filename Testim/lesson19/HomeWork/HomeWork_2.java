package lesson19.HomeWork;

import java.util.*;

public class HomeWork_2 {
        /* Удалить всех людей, родившихся летом
        Создать словарь (Map<String, Date>) и занести в него 5 записей по принципу: «фамилия» - «дата рождения».
        Удалить из словаря всех людей, родившихся летом.
        map.put("Jhon", new Date("JUNE 1 1980"));
        map.put("Mark", new Date("JUNE 5 1999"));
        map.put("Elone", new Date("DECEMBER 13 1996"));
        map.put("Stieve", new Date("JUNE 1 1980"));
        map.put("Clark", new Date("MARCH 1 1980"));
        */
        public static void main(String[] args) {
                Map<String, Date> map = new HashMap<>();
                map.put("Jhon", new Date("JUNE 1 1981"));
                map.put("Mark", new Date("JUNE 5 1999"));
                map.put("Elone", new Date("DECEMBER 13 1996"));
                map.put("Stieve", new Date("JUNE 1 1983"));
                map.put("Clark", new Date("MARCH 1 1982"));
                map.put("Dark", new Date("APRIL 1 1982"));
                map.put("Kali", new Date("JULY 1 1985"));

                for (String s : map.keySet()) {
                        System.out.println(s);
                }
                System.out.println("/===================\\");


                //Итератор через for-each не прокатит, надо создавать в ручную
                /*for (Map.Entry<String, Date> entry : map.entrySet()) {
                        if(entry.getValue().getMonth() == Calendar.JUNE) map.remove(entry.getKey());
                        else if(entry.getValue().getMonth() == Calendar.JULY) map.remove(entry.getKey());
                        else if(entry.getValue().getMonth() == Calendar.AUGUST) map.remove(entry.getKey());
                }*/
                Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
                while (iterator.hasNext()){
                        Map.Entry<String, Date> name = iterator.next();
                        if(name.getValue().getMonth() == Calendar.JUNE) iterator.remove();
                        else if(name.getValue().getMonth() == Calendar.JULY) iterator.remove();
                        else if(name.getValue().getMonth() == Calendar.AUGUST) iterator.remove();
                }
                for (String s : map.keySet()) {
                        System.out.println(s);
                }
        }
}