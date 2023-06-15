package org.example.config.interfaces;

@FunctionalInterface
public interface NotificationInterface<T> {
    void sendNotification(T t);

}
