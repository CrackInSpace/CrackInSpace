package Spring.AppMVC.dao;

import Spring.AppMVC.models.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PeopleMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();

        person.setId(rs.getInt("person_id"));
        person.setFio(rs.getString("fio"));
        person.setAge(rs.getInt("age"));

        return person;
    }
}
