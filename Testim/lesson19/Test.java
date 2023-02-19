package lesson19;

import java.util.Objects;

public class Test {
    private int age;
    private double ear;

    public Test() {
    }

    public Test(int age, double ear) {
        this.age = age;
        this.ear = ear;
    }


    //Обязательно должны переопределять в паре equals и hashCode иначе могут возникнуть ошибки
    //Такие как: неправильная работа коллизии, вообще неработоспособность коллизии...
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return age == test.age && Double.compare(test.ear, ear) == 0;
        //return age == test.age && ear == test.ear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, ear);
    }
}
