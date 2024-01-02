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

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public int getPriority() {
        return priority;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getCompletionDate() {
        return completionDate;
    }

    public Category getCategory() {
        return category;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
