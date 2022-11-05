package lesson19.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class HomeWork {
    public static void main(String[] args) {
        /*
        Создать словарь (Map<String, String>) занести в него 5 записей по принципу «Фамилия» - «Имя».
        Проверить сколько людей имеют совпадающие с заданным имя или фамилию:
        - создать метод getCountTheSameFirstName(Map<String, String> map, String name), который должен вернуть количество
        пар с именем, которое приходит в аргумент name
        - создать метод getCountTheSameLastName(Map<String, String> map, String lastName), который должен вернуть количество
        пар с фамилией, которая приходит в аргумент lastName
        */
        Map<String, String> fi = new HashMap<>();
        fi.put("Ivanov", "Ivan");
        fi.put("Vladimirov", "Vlad");
        fi.put("Pupkin", "Pavel");
        fi.put("Avgustinov", "Vlad");
        fi.put("Zshopkin", "Pavel");

        System.out.println("Group people with name Ivan: " + getCountTheSameFirstName(fi, "Ivan"));
        System.out.println("Group people with name Pavel: " + getCountTheSameFirstName(fi, "Pavel"));
        System.out.println("Group people with name Vlad: " + getCountTheSameFirstName(fi, "Vlad"));
        System.out.println();

        //Т.к. ключи уникальные, в этой части задания пар не будет:D
        System.out.println("Group people with lastName Ivanov: " + getCountTheSameLastName(fi, "Ivanov"));
        System.out.println("Group people with lastName Pupkin: " + getCountTheSameLastName(fi, "Pupkin"));
    }
    public static int getCountTheSameFirstName(Map<String, String> map, String name){
        int count = 0, group = 0;
        for (String value : map.values()) {
            if(value.equals(name)) count++;
            if(count % 2 == 0 && count != 0) {
                group++;
                count = 0;
            }
        }
        return group;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName){
        int count = 0, group = 0;
        for (String key : map.keySet()) {
            if(key.equals(lastName)) count++;
            if(count % 2 == 0 && count != 0) {
                group++;
                count = 0;
            }
        }
        return group;
    }
}


