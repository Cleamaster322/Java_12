package com.example.myapplication;

public class Task {
    private String title;
    private String description;
    private boolean isCompleted;
    private int priority;
    private String creationDate;
    private String completionDate;
    private Category category;

    // Конструктор
    public Task(String title, String description, boolean isCompleted, int priority, String creationDate, String completionDate, Category category) {
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;
        this.priority = priority;
        this.creationDate = creationDate;
        this.completionDate = completionDate;
        this.category = category;
    }

}
