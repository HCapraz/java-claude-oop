package com.hikmetkurs.java_oop_web.model;

import java.util.List;
import java.util.ArrayList;

public class Topic {
    private Long id;
    private String title;
    private String description;
    private String iconClass;
    private String level;
    private List<String> tags;
    private List<Subtopic> subtopics;

    public Topic() {
        this.tags = new ArrayList<>();
        this.subtopics = new ArrayList<>();
    }

    public Topic(Long id, String title, String description, String iconClass, String level) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.iconClass = iconClass;
        this.level = level;
        this.tags = new ArrayList<>();
        this.subtopics = new ArrayList<>();
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

    public String getIconClass() {
        return iconClass;
    }

    public void setIconClass(String iconClass) {
        this.iconClass = iconClass;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public void addTag(String tag) {
        this.tags.add(tag);
    }

    public List<Subtopic> getSubtopics() {
        return subtopics;
    }

    public void setSubtopics(List<Subtopic> subtopics) {
        this.subtopics = subtopics;
    }

    public void addSubtopic(Subtopic subtopic) {
        this.subtopics.add(subtopic);
    }
}