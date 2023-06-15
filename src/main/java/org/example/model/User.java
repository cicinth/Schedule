package org.example.model;

import org.example.config.DataBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private Long id;
    private String username;
    private Map<Long, Schedule> schedules;

    public User(Long id, String username) {
        this.id = id;
        this.username = username;
        this.schedules = new HashMap<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<Long,Schedule> getSchedules() {
        return schedules;
    }

    public void addSchedules(Schedule schedule) {
        this.schedules.put(schedule.getId(), schedule);
    }
}
