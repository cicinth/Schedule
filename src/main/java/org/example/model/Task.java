package org.example.model;


import java.time.LocalDate;

public class Task  extends ScheduleItem {
    private Long id;
    private String title;
    private String description;
    private LocalDate date;
    private String status;

    public Task(Long id, String title, String description, LocalDate date) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.status = "CREATED";
    }
    @Override
    public String getItemName() {
        return this.title;
    }

    @Override
    public Long getItemId() {
        return this.id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
