package Spring.AppMVC.dao;

import Spring.AppMVC.models.Book;
import Spring.AppMVC.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PeopleDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PeopleDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> index(){
        return jdbcTemplate.query("SELECT * FROM Person", new PeopleMapper());
    }

    public Optional<Person> show(String fio) {
        return jdbcTemplate.query("SELECT * FROM Person WHERE fio=?", new Object[]{fio},
                new PeopleMapper()).stream().findAny();
    }

    public Person show(int id) {
        return (Person) jdbcTemplate.query("SELECT * FROM Person WHERE person_id=?", new Object[]{id}, new PeopleMapper())
                .stream().findAny().orElse(null);
    }

    public void save(Person person){
        jdbcTemplate.update("INSERT INTO Person(fio, age) VALUES (?,?)", person.getFio(), person.getAge());
    }

    public void update(Person newPerson, int id){
        jdbcTemplate.update("UPDATE Person SET fio=?, age=? WHERE person_id=?",
                newPerson.getFio(), newPerson.getAge(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM Person WHERE person_id=?", id);
    }

    public List<Book> getBooksByPersonId(int id){
        return jdbcTemplate.query("SELECT * FROM Book WHERE person_id=?", new Object[]{id}, new BookMapper());
    }
}
