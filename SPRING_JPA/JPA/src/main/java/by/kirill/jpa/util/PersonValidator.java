package by.kirill.jpa.util;

import by.kirill.jpa.dao.PersonDAO;
import by.kirill.jpa.models.Person;
import by.kirill.jpa.services.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class PersonValidator implements Validator {
    //С помощь HQL
    private final PersonDAO personDAO;
    //С помощь абстракции
    private final PeopleService peopleService;

    @Autowired
    public PersonValidator(PersonDAO personDAO, PeopleService peopleService) {
        this.personDAO = personDAO;
        this.peopleService = peopleService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;

        //  С помощь DAO с SQL запросом в ручную
//        if (personDAO.findByFullName(person.getFullName()).isPresent()) {
//            // поле, код ошибки, сообщение ошибки
//            errors.rejectValue("fullName", "", "This fio is already in use");
//        }

        //  С помощь Services с магией :D
        if (peopleService.findByFullName(person.getFullName()).isPresent()) {
            // поле, код ошибки, сообщение ошибки
            errors.rejectValue("fullName", "", "This full name is already in use");
        }

        // Проверяем, что у человека имя начинается с заглавной буквы
        // Если имя не начинается с заглавной буквы - выдаем ошибку
//        if (!Character.isUpperCase(person.getName().codePointAt(0)))
//            errors.rejectValue("name", "", "Name should start with a capital letter");
    }
}
