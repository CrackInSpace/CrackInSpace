package by.kirill.jpa.repositories;

import by.kirill.jpa.models.Book;
import by.kirill.jpa.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {

    List<Book> findBooksByOwnerId(int idOwner);
}
