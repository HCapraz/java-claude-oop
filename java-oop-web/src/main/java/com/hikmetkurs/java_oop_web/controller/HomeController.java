package com.hikmetkurs.java_oop_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Java Öğrenim Platformu");
        model.addAttribute("welcome", "Java ve OOP kavramlarını interaktif bir şekilde öğrenmeye hazır mısınız?");
        return "home";  // templates/home.html şablonunu kullanacak
    }
}