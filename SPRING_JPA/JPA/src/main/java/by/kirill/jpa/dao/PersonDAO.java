package by.kirill.jpa.dao;

import by.kirill.jpa.models.Person;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Component
@Transactional(readOnly = true)
public class PersonDAO {

    private final EntityManager entityManager;


    public PersonDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //Для сложных HQL запросов

    /*public Optional<Person> findByFullName(String fullName) {
        return entityManager.createQuery("select p from Person p where p.fullName=:name", Person.class)
                .setParameter("name", fullName).getResultList().stream().findAny();
    }*/

    /*
    //example
    public void testNPlus1() {
        Session session = entityManager.unwrap(Session.class);

        *//*List<Person> people = session.createQuery("SELECT p from Person p", Person.class)
                .getResultList();*//*

        Set<Person> people = new HashSet<>(
                session.createQuery("select p from Person p left join fetch p.books", Person.class)
                .getResultList());

        for (Person person : people) {
            System.out.println("Person " + person.getName() + " has: " + person.getItems());
        }
    }*/
}
