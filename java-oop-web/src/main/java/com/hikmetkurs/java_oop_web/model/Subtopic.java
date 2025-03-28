package com.hikmetkurs.java_oop_web.model;

import java.util.ArrayList;
import java.util.List;

public class Subtopic {
    private Long id;
    private String title;
    private String description;
    private String content;
    private List<String> examples;

    public Subtopic() {
        this.examples = new ArrayList<>();
    }

    public Subtopic(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.examples = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getExamples() {
        return examples;
    }

    public void setExamples(List<String> examples) {
        this.examples = examples;
    }

    public void addExample(String example) {
        this.examples.add(example);
    }
}