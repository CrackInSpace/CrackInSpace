package by.kirill.jpa.controllers;

import by.kirill.jpa.dao.BookDAO;
import by.kirill.jpa.dao.PersonDAO;
import by.kirill.jpa.models.Book;
import by.kirill.jpa.models.Person;
import by.kirill.jpa.services.BooksService;
import by.kirill.jpa.services.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;
    private final BookDAO bookDAO;

    private final PeopleService peopleService;
    private final PersonDAO personDAO;

    @Autowired
    public BooksController(BooksService booksService, BookDAO bookDAO,
                           PeopleService peopleService, PersonDAO personDAO) {
        this.booksService = booksService;
        this.bookDAO = bookDAO;
        this.peopleService = peopleService;
        this.personDAO = personDAO;
    }

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("books", booksService.findAll());
        return "/books/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model,
                       @ModelAttribute("person") Person person) {
        model.addAttribute("book", booksService.findById(id));

        if (booksService.findById(id).getOwner() != null)
            model.addAttribute("owner", booksService.findById(id).getOwner());
        else
            model.addAttribute("people", peopleService.findAll());

        return "/books/show";
    }

    @GetMapping("/new")
    public String newBook(@ModelAttribute("book") Book book) {
        return "/books/new";
    }

    @PostMapping("")
    public String create(@ModelAttribute("book") @Valid Book book, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "/books/new";

        booksService.save(book);
        return "redirect:/books";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") int id, Model model) {
        model.addAttribute("book", booksService.findById(id));
        return "/books/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("book") @Valid Book book, BindingResult bindingResult,
                         @PathVariable("id") int id) {
        if(bindingResult.hasErrors())
            return "/books/edit";

        booksService.update(id, book);
        return "redirect:/books";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        booksService.delete(id);
        return "redirect:/books";
    }

    @PatchMapping("/{id}/release")
    public String release(@PathVariable("id") int id) {
        booksService.release(id);
        return "redirect:/books/" + id;
    }

    @PatchMapping("/{id}/assign")
    public String assign(@PathVariable("id") int id, @ModelAttribute("person") Person selectedPerson){
        //У selectedPerson назначено только поле id, остальное null
        booksService.assign(id, selectedPerson);
        return "redirect:/books/" + id;
    }
}
