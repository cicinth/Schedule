package org.example.service;
import org.example.model.Schedule;
import org.example.model.User;


public class ScheduleService {
    UserService userService = new UserService();

    public Schedule addSchedule(Long scheduleId, String scheduleTitle, Long userId){
        Schedule schedule = new Schedule(scheduleId, scheduleTitle);
        User user = userService.getUser(userId);
        user.addSchedules(schedule);
        return schedule;
    }
}
