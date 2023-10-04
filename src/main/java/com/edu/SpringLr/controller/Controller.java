package com.edu.SpringLr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/hello")
    public String showFirstPage(@RequestParam(name = "name", required = false, defaultValue = "World")
                                String name,
                                Model model) {
        model.addAttribute("name", name);
        return "first-page";
    }
}
