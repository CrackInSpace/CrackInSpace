package Spring.AppMVC.dao;

import Spring.AppMVC.models.Book;
import Spring.AppMVC.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BookDAO {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public BookDAO(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> index(){
        return jdbcTemplate.query("SELECT * FROM Book", new BookMapper());
    }

    public Book show(int id){
        return (Book) jdbcTemplate.query("SELECT * FROM Book WHERE book_id=?",
                new Object[]{id}, new BookMapper()).stream().findAny().orElse(null);
    }

    public void save(Book book) {
        jdbcTemplate.update("INSERT INTO Book(book_name, author, age_book) VALUES (?,?,?) ",
                book.getName(), book.getAuthor(), book.getAgeBook());
    }

    public void update(int id, Book newBook) {
        jdbcTemplate.update("UPDATE Book SET book_name=?, author=?, age_book=? WHERE book_id=?",
                newBook.getName(), newBook.getAuthor(), newBook.getAgeBook(), id);
    }

    public void delete(int id){
        jdbcTemplate.update("DELETE FROM Person WHERE person_id=?", id);
    }

    //Join table Book and Person and get people where book with id
    public Optional<Person> getBookOwner(int id){
        return jdbcTemplate.query("SELECT Person.* FROM Book JOIN Person ON Book.person_id = Person.person_id " +
                "WHERE Book.book_id = ?", new Object[]{id}, new PeopleMapper()).stream().findAny();
    }

    public void release(int id){
        jdbcTemplate.update("UPDATE Book SET person_id=NULL WHERE book_id=?", id);
    }

    public void assign(int id, Person selectedPerson){
        jdbcTemplate.update("UPDATE Book SET person_id=? WHERE book_id=?", selectedPerson.getId(), id);
    }
}
