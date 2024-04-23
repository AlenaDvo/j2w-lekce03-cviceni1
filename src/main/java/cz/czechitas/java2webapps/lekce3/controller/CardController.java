package cz.czechitas.java2webapps.lekce3.controller;

import cz.czechitas.java2webapps.lekce3.entity.Address;
import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class CardController {
    @GetMapping("/")
//    fotka uvedena
    public ModelAndView showCard() {
        ModelAndView modelAndView = new ModelAndView("card");
        Person person = new Person("Eliška", "Krásnohorská", LocalDate.of(1947, 11, 18), "https://thispersondoesnotexist.com/");
        Address address = new Address("Nové náměstí", 337, "Všetaty", 277716);
        modelAndView.addObject("person", person)
                .addObject("address", address);
        return modelAndView;
// fotka neuvedena
//    public ModelAndView showCard() {
//        Person person = new Person("Eliška", "Krásnohorská", LocalDate.of(1947, 11, 18), "");
//        ModelAndView modelAndView = new ModelAndView("card");
//        modelAndView.addObject("person", person);
//        return modelAndView;
    }
}