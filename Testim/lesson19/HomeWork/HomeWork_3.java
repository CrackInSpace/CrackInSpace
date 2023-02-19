package lesson19.HomeWork;

import java.util.*;

public class HomeWork_3 {
    /* Удалить людей, имеющих одинаковые имена
    Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
    Удалить людей, имеющих одинаковые имена.

    map.put("Rooney", "Leo");
    map.put("Lloris", "Hugo");
    map.put("Messi", "Leo");
    map.put("Ronaldo", "Cristiano");
    map.put("Maldini", "Paolo");
    map.put("Indzaghi", "Pipo");
    map.put("Del Piero", "Alesandro");
    map.put("Balotelli", "Mario");
    map.put("Gotze", "Mario");
    map.put("Gomez", "Mario");
    */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Rooney", "Leo");
        map.put("Lloris", "Hugo");
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristiano");
        map.put("Maldini", "Paolo");
        map.put("Indzaghi", "Pipo");
        map.put("Del Piero", "Alesandro");
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario");

        //removeElements(map);
        //или через итератор
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            int count = 0;
            Map.Entry<String, String> next = iterator.next();
            for (String value : map.values()) {
                if (next.getValue().equals(value)) count++;
            }
            if(count > 1) iterator.remove();
        }


        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

    }
    //Передаем наш словарь, создаем новый и записываем в него значение наоборот
    //Дальше чистим наш основной и записываем в него значение из вспомогательного, так же наоборот
    public static void removeElements(Map<String, String> map){
        Map<String, String> rotate = new HashMap<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            rotate.put(entry.getValue(), entry.getKey());
        }
        map.clear();

        for (Map.Entry<String, String> entry : rotate.entrySet()) {
            map.put(entry.getValue(), entry.getKey());
        }
    }
}
