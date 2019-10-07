package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
    @RequestMapping ("/")
    public String homePage(Model model) {
        model.addAttribute("myvar", "say heelo to the poeple.");
    return "hometemplate";
    }
}
