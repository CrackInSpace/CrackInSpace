package by.kirill.jpa.services;

import by.kirill.jpa.models.Book;
import by.kirill.jpa.models.Person;
import by.kirill.jpa.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional(readOnly = true)
public class BooksService {

    private final BooksRepository booksRepository;

    @Autowired
    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Book> findAll() {
        return booksRepository.findAll();
    }

    public Book findById(int id) {
        return booksRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(Book book) {
        booksRepository.save(book);
    }

    @Transactional
    public void update(int id, Book updatedBook) {
        updatedBook.setId(id);
        booksRepository.save(updatedBook);
    }

    @Transactional
    public void delete(int id) {
        booksRepository.deleteById(id);
    }

    @Transactional
    public void release(int id){
        findById(id).getOwner().getBooks().remove(findById(id));
        findById(id).setOwner(null);
    }

    @Transactional
    public void assign(int id, Person selectedPerson){
        findById(id).setOwner(selectedPerson);
        if (findById(id).getOwner().getBooks() == null)
//            findById(id).getOwner().setBooks(new ArrayList<>(List.of(findById(id))));
//            findById(id).getOwner().setBooks(new ArrayList<>(Arrays.asList(findById(id))));
            findById(id).getOwner().setBooks(new ArrayList<>(Collections.singletonList(findById(id))));
        else
            findById(id).getOwner().getBooks().add(findById(id));
    }

    public List<Book> findBooksByOwnerId(int idOwner) {
        return booksRepository.findBooksByOwnerId(idOwner);
    }
}
