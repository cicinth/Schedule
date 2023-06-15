package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private Long id;
    private String title;
    private List<ScheduleItem> scheduleItems;

    public Schedule(Long id, String title) {
        this.id = id;
        this.title = title;
        this.scheduleItems = new ArrayList<>();
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

    public List<ScheduleItem> getScheduleItems() {
        return scheduleItems;
    }

    public void addScheduleItem(ScheduleItem scheduleItem) {
        this.scheduleItems.add(scheduleItem);
    }

}
