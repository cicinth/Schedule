package org.example.service;

import org.example.config.interfaces.SchedulerOperations;
import org.example.model.Schedule;
import org.example.model.Task;
import org.example.model.User;
import org.example.utils.LoggerSchedule;

import java.time.LocalDate;



public class TaskService implements SchedulerOperations<Task, LocalDate> {

    UserService userService = new UserService();

    public  Task createTask(Long taskId, String taskName, String taskDescription, LocalDate taskDate, Long scheduleId, Long userId){

        Task task = new Task(taskId, taskName, taskDescription, taskDate);
        LoggerSchedule.log("task criada");
        LoggerSchedule.log(taskId);

        User user = userService.getUser(userId);
        Schedule schedule = user.getSchedules().get(scheduleId);
        schedule.addScheduleItem(task);

        return  task;

    }
    @Override
    public Task cancel(Task task) {
        task.setStatus("CANCEL");
        return task;
    }

    @Override
    public Task changeDate(Task task, LocalDate date) {
        task.setDate(date);
        return task;
    }

}
