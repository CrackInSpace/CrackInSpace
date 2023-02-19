package lesson20.Test;

public class User implements Comparable<User>{
    private String name;
    private int age;
    private int salary;

    public User(String name, int age, int salary) {
        this.name = name;
        this.age = age;
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

    //Переопределили метод compareTo таким образом, что сортировка идет по возрасту
    @Override
    public int compareTo(User o) {
        if(this.age == o.age) {
            return 0;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return 1;
        }
        //ИЛИ return Integer.compare(this.age, o.age);
    }
}
