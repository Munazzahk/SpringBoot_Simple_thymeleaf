package com.example.simplethymeleaf.controllers;

import com.example.simplethymeleaf.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {

        Person person = new Person();
        person.setId(12);
        person.setFirstName("Annie");
        person.setLastName("No-name");

        model.addAttribute("id", person.getId());
        model.addAttribute("firstName", person.getFirstName());
        model.addAttribute("lastName", person.getLastName());

        Person person2 = new Person();
        person2.setId(23);
        person2.setFirstName("Nanna");
        person2.setLastName("P");

        model.addAttribute("person2", person2);

        return "home/index";
    }

}
