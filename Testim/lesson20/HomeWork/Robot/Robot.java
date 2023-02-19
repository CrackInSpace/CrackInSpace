package lesson20.HomeWork.Robot;

import java.util.*;

//public class Robot implements Comparable<Robot>{
public class Robot{
    private int power;
    private String model;

    public Robot(int power, String model) {
        this.power = power;
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "power=" + power +
                ", model='" + model + '\'' +
                '}';
    }

/*@Override//убрать коммит с класс имлиментс
    public int compareTo(Robot o) {
        return CharSequence.compare(this.model, o.model);
    }*/
}

/*
Создать класс Robot с двумя полями - power(int), model(String)
Создать коллекцию TreeMap и добавить туда 3 роботов
Реализовать интерфейс Comparable в классе Robot:
 - метод compareTo должен сравнивать имена в алфавитном порядке, если имена одинаковые,
то сравнение должно проходить по полю power
Вывести в консоль содержимое коллекции TreeMap
*/
