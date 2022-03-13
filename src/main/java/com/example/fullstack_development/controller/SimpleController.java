package com.example.fullstack_development.controller;

import com.example.fullstack_development.entities.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

    @RequestMapping("/")
    @ResponseBody
    public String displayIndex(@ModelAttribute("model") String data)
    {
        return "index";
    }
}
