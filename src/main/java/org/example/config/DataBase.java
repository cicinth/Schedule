package org.example.config;

import org.example.model.User;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private static DataBase instance;
    private Map<Long, User> users;

    private DataBase(){
        users = new HashMap<>();
    }

    public static DataBase getInstance(){
        if(instance == null){
            instance = new DataBase();
        }
        return  instance;
    }
    public void addUser(Long id, User user){
        users.put(id, user);
    }

    public User getUserById(Long id){
        return users.get(id);
    }

}
