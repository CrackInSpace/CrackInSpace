package by.kirill.jpa.controllers;

import by.kirill.jpa.dao.BookDAO;
import by.kirill.jpa.dao.PersonDAO;
import by.kirill.jpa.models.Person;
import by.kirill.jpa.services.BooksService;
import by.kirill.jpa.services.PeopleService;
import by.kirill.jpa.util.PersonValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/people")
public class PeopleController {

    private final PeopleService peopleService;
    private final PersonDAO personDAO;
    private final PersonValidator personValidator;

    private final BooksService booksService;
    private final BookDAO bookDAO;


    @Autowired
    public PeopleController(PeopleService peopleService, PersonDAO personDAO, PersonValidator personValidator,
                            BooksService booksService, BookDAO bookDAO) {
        this.peopleService = peopleService;
        this.personDAO = personDAO;
        this.personValidator = personValidator;
        this.booksService = booksService;
        this.bookDAO = bookDAO;
    }

    @GetMapping("")
    public String findAll(Model model) {
        model.addAttribute("people", peopleService.findAll());
        return "/people/index";
    }

    @GetMapping("/{id}")
    public String findOne(@PathVariable("id") int id, Model model) {
        model.addAttribute("person", peopleService.findById(id));
//        model.addAttribute("books", bookDAO.booksOwner(id));
        model.addAttribute("books", booksService.findBooksByOwnerId(id));
        return "/people/show";
    }

    @GetMapping("/new")
    public String newPerson(@ModelAttribute("person") Person person) {
        return "/people/new";
    }

    @PostMapping("")
    public String create(@ModelAttribute("person") @Valid Person createPerson,
                         BindingResult bindingResult) {

        personValidator.validate(createPerson, bindingResult);

        if (bindingResult.hasErrors())
            return "/people/new";

        peopleService.save(createPerson);
        return "redirect:/people";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") int id, Model model) {
        model.addAttribute("person", peopleService.findById(id));
        return "/people/edit";
    }

    @PatchMapping("/{id}")
    public String update(@PathVariable("id") int id,
                         @ModelAttribute("person") @Valid Person updatePerson, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "/people/edit";

        /*updatePerson.setId(id);//Логику выносим в сервис!
        peopleService.save(updatePerson);*/
        peopleService.update(id, updatePerson);
        return "redirect:/people";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        peopleService.delete(id);
        return "redirect:/people";
    }
}
