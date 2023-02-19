package Spring.AppMVC.models;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class Person {
    private int id;

    @Pattern(regexp = "[A-Z]\\w+ [A-Z]\\w+ [A-Z]\\w+", message = "Your FIO should be in this format: Surname Name Otchestvo")
    @NotEmpty(message = "FIO will be should not empty")
    private String fio;

    @Min(value = 1900, message = "Year born should be greater than 1900")
    private int age;

    public Person() {
    }

    public Person(int id, String fio, int age) {
        this.id = id;
        this.fio = fio;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
