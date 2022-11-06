package lesson20.HomeWork.User;

import java.util.*;

public class HomeWork2 {
    public static void main(String[] args) {
        Map<User, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        for (int a = 0; a < 6; a++) {
            int age = sc.nextInt();
            String name = sc.next();
            int salary = sc.nextInt();
            String place = sc.next();
            map.put(new User(age, name, salary), place);
        }

        System.out.println("All worker:");
        for (Map.Entry<User, String> entry : map.entrySet()) {
            System.out.println(entry);
        }


        Set<User> boss = new TreeSet<>(Comparator.comparing(User::getSalary).thenComparing(User::getAge));
        Set<User> worker = new TreeSet<>(Comparator.comparing(User::getAge).thenComparing(User::getName));
        Set<User> another = new TreeSet<>(Comparator.comparing(User::getName).thenComparing(User::getSalary));

        for (Map.Entry<User, String> entry : map.entrySet()) {
            if(entry.getValue().equals("Boss")) boss.add(entry.getKey());
            else if(entry.getValue().equals("Worker")) worker.add(entry.getKey());
            else if(entry.getValue().equals("Another")) another.add(entry.getKey());
        }

        System.out.println("Boss:");
        for (User user : boss) {
            System.out.println(user);
        }

        System.out.println("Worker:");
        for (User user : worker) {
            System.out.println(user);
        }
        System.out.println("Another:");
        for (User user : another) {
            System.out.println(user);
        }
    }
}

/*
Создать класс User с 3 полями - age(int), name(String), salary(int)
Создать коллекцию HashMap<User, String> и добавить туда 5 записей по принципу юзер-должность
Данные добавлять с консоли, используя BufferedReader

Разделить коллекцию HashMap на 3 коллекции TreeSet:
- в первую коллекцию сохранять пользователей с должностью - boss
- во вторую коллекцию сохранять пользователей с должностью - worker
- в третью коллекцию сохранять пользователей с другими должностями

Отсортировать пользователей с должностью boss по параметру salary и вывести содержимое коллекции в консоль
Отсортировать пользователей с должностью worker по параметру age и вывести содержимое коллекции в консоль
Отсортировать пользователей с другими должностями по параметру name и вывести содержимое коллекции в консоль
21
Bob
2000
Boss

22
Lol
3000
Worker

23
Poli
1400
Another

33
Pilo
4000
Boss

18
Oli
1800
Worker

23
Alka
1200
Another
*/