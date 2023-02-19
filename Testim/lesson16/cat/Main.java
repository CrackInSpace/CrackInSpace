package lesson16.cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter name cat: ");
            String name = sc.nextLine();
            if(name.isEmpty()) break;
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.print("Enter weight: ");
            int weight = sc.nextInt();
            System.out.print("Enter length tail: ");
            int tail = sc.nextInt();
            Cat cat = new Cat(name, age, weight, tail);
            cats.add(cat);
        }while(true);

        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }
    }
}

/*
Задача:  Программа вводит с клавиатуры данные про котов и выводит их на экран.
Создать класс Cat с параметрами name, age, weight, tail;
Переопределить метод toString() в классе Cat, что бы он выводил информацию про кота в виде:
"Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
Вводить параметры с клавиатуры и создавать объект с введенными параметрами.
Ввод продолжается, пока переменная с именем не пуста.
Добавлять каждый объект в список, в конце вывести содержимое списка на экран.
 Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
*/