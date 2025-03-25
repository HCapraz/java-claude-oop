package com.hikmetkurs.javaoop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Java OOP Öğrenim Platformu");
        model.addAttribute("welcome", "Java Nesne Yönelimli Programlama kavramlarını öğrenmek için interaktif platformumuza hoş geldiniz!");
        return "home";
    }
}