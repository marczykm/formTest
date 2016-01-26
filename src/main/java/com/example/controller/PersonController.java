package com.example.controller;

import com.example.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by MMARCZYK on 2016-01-26.
 */
@Controller
@RequestMapping("/")
public class PersonController {

    @RequestMapping
    public String index(Model model){
        model.addAttribute("person", new Person());
        return "index";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute Person person, Model model){
        model.addAttribute("person", person);
        System.out.println(person);
        return "save";
    }
}
