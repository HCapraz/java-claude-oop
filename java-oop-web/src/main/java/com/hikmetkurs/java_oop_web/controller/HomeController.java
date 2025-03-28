package com.hikmetkurs.java_oop_web.controller;

import com.hikmetkurs.java_oop_web.model.Topic;
import com.hikmetkurs.java_oop_web.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {
    
    private final TopicService topicService;
    
    @Autowired
    public HomeController(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Java Öğrenim Platformu");
        model.addAttribute("welcome", "Java ve OOP kavramlarını interaktif bir şekilde öğrenmeye hazır mısınız?");
        return "home";  // templates/home.html şablonunu kullanacak
    }
    
    @GetMapping("/topics")
    public String allTopics(Model model) {
        List<Topic> topics = topicService.getAllTopics();
        model.addAttribute("title", "Java Konuları");
        model.addAttribute("topics", topics);
        return "topics";  // templates/topics.html şablonunu kullanacak
    }
    
    @GetMapping("/topics/{id}")
    public String topicDetail(@PathVariable("id") Long id, Model model) {
        Optional<Topic> topic = topicService.getTopicById(id);
        
        if (topic.isPresent()) {
            model.addAttribute("title", topic.get().getTitle());
            model.addAttribute("topic", topic.get());
            return "topic-detail";  // templates/topic-detail.html şablonunu kullanacak
        } else {
            return "redirect:/topics";
        }
    }
}