package lesson11;

public class Human {
    private String name;
    private boolean gender;
    private int age;
    private Human father;//= new Human("Kolya", true, 45);
    private Human mather;//= new Human("Vika", false, 47);

    public Human(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Human(String name, boolean gender, int age, Human father, Human mather) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.father = father;
        this.mather = mather;
    }

    @Override
    public String toString() {
        return "Name= " + name +  ", gender= " + gender + ", age= " + age
                +
                (father == null? "" : ".\nFather: " + father.toString())
                +
                (mather == null? "" : ".\nMather: " + mather);
    }
}
