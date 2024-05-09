package cz.czechitas.java2webapps.lekce3.controller;

import cz.czechitas.java2webapps.lekce3.entity.Address;
import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class CardController {
    Person person = new Person(
            "Eliška",
            "Krásnohorská",
            LocalDate.of(1947, 11, 18),
            "https://thispersondoesnotexist.com/"
    );

    Person person2 = new Person(
            "Karel",
            "Nováček",
            LocalDate.of(1965, 1, 1),
            null
    );
    Address address = new Address(
            "Nové náměstí",
            337,
            "Všetaty",
            "27716");

    @GetMapping("/")
//    fotka uvedena
    public ModelAndView showCard() {
        ModelAndView modelAndView = new ModelAndView("card");
        modelAndView.addObject("person", person)
                .addObject("address", address);
        return modelAndView;
// fotka neuvedena
//    public ModelAndView showCard() {
//        ModelAndView modelAndView = new ModelAndView("card");
//        modelAndView.addObject("person", person2)
//                .addObject("address", address);
//        return modelAndView;
    }
}