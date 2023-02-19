package Spring.AppMVC.dao;

import Spring.AppMVC.models.Book;
import Spring.AppMVC.models.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();

        book.setId((rs.getInt("book_id")));
        book.setName(rs.getString("book_name"));
        book.setAuthor(rs.getString("author"));
        book.setAgeBook(rs.getInt("age_book"));

        return book;
    }
}
