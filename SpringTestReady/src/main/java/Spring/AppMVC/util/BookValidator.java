package Spring.AppMVC.util;

import Spring.AppMVC.dao.BookDAO;
import Spring.AppMVC.dao.PeopleDAO;
import Spring.AppMVC.models.Book;
import Spring.AppMVC.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class BookValidator implements Validator {
    private final BookDAO bookDAO;

    @Autowired
    public BookValidator(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Book.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Book book = (Book) target;

        /*if (bookDAO.show(person.getFio()).isPresent()) {
            // поле, код ошибки, сообщение ошибки
            errors.rejectValue("fio", "", "This fio is already in use");
        }*/
    }

}
