package Spring.AppMVC.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class Book {
    private int id;

    @NotEmpty(message = "Book should name")
    private String name;

    @NotEmpty(message = "Author should name")
    @Pattern(regexp = "[A-Z]\\w+ [A-Z]\\. [A-Z]\\.", message = "Name author should be in this format: Surname N. O.")
    private String author;

    @Min(value = 1800, message = "Book year not should will below 1800")
    private int ageBook;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAgeBook() {
        return ageBook;
    }

    public void setAgeBook(int ageBook) {
        this.ageBook = ageBook;
    }
}
