package com.example.fullstack_development.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("eventName", "Fifa18");
        return "index";
    }


}
