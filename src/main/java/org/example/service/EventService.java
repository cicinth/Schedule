package org.example.service;

import org.example.config.interfaces.SchedulerOperations;
import org.example.model.Event;
import org.example.model.Schedule;
import org.example.model.User;

import java.time.LocalDate;

public class EventService implements SchedulerOperations<Event, LocalDate> {
    UserService userService = new UserService();

    public Event create(Long idEvent, String nameEvent,
                        String eventDescription, LocalDate dateEvent,
                        String eventAddress, Long scheduleId, Long userId)
    {

        Event event = new Event(idEvent, nameEvent, eventDescription, dateEvent, eventAddress);
        User user = userService.getUser(userId);
        Schedule schedule = user.getSchedules().get(scheduleId);
        schedule.addScheduleItem(event);

        return event;
    }
    @Override
    public Event cancel(Event event) {
        event.setStatus("CANCEL");
        return event;
    }

    @Override
    public Event changeDate(Event event, LocalDate date) {
        event.setDate(date);
        return event;
    }
}
