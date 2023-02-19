package lesson20.HomeWork.Robot;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class HomeWork1 {
    public static void main(String[] args) {
        Map<Robot, String> map = new TreeMap<>(Comparator.comparing(Robot::getModel).thenComparing(Robot::getPower));
        map.put(new Robot(33, "Aba"), "METALL");
        map.put(new Robot(23, "Bak"), "ABS");
        map.put(new Robot(43, "Ack"), "ABSIDIAN");
        map.put(new Robot(35, "Ack"), "ABSIDIANs");


        for (Map.Entry<Robot, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
/*
Создать класс Robot с двумя полями - power(int), model(String)
Создать коллекцию TreeMap и добавить туда 3 роботов
Реализовать интерфейс Comparable в классе Robot:
 - метод compareTo должен сравнивать имена в алфавитном порядке, если имена одинаковые,
то сравнение должно проходить по полю power
Вывести в консоль содержимое коллекции TreeMap
*/