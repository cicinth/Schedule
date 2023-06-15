package org.example.model;



import java.time.LocalDate;

public class Event extends ScheduleItem {
    private Long id;
    private String name;
    private String description;
    private LocalDate date;
    private String status;
    private String address;

    public Event(Long id, String name, String description, LocalDate date, String address) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.status = "CREATED";
        this.address = address;
    }

    @Override
    public String getItemName() {
        return this.name;
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

    public String getAddress() {
        return address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setAddress(String address) {
        this.address = address;
    }
}
