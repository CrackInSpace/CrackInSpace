package by.kirill.jpa.dao;

import by.kirill.jpa.models.Book;
import by.kirill.jpa.models.Person;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Component
@Transactional(readOnly = true)
public class BookDAO {

    private final EntityManager entityManager;

    @Autowired
    public BookDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //Для сложных HQL запросов

    /*public List<Book> booksOwner(int idOwner) {
        Session session = entityManager.unwrap(Session.class);

        return session.createQuery("select b from Book b where b.owner.id=:owner", Book.class)
                .setParameter("owner", idOwner).getResultList();
    }*/
}
