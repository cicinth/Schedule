package org.example.config.interfaces;


import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public interface SchedulerOperations<T, S extends Temporal & TemporalAdjuster> {
    T cancel(T t);
    T changeDate(T t, S date);
}
