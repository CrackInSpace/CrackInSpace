package lesson20.HomeWork.User;

import java.util.Objects;

public class User {
    private int age;
    private String name;
    private int salary;

    public User(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }


    //Переопределяем методы, чтобы у нас объект был уникальный, а не несколько
    //21 //Bob //2000 //Worker
    //21 //Bob //2000 //Worker
    //В итоге будет один Боб благодаря переопределенным правильно методам equals и hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && salary == user.salary && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, salary);
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
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

19
Alka
1200
Another
*/