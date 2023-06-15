package org.example.repository;

import org.example.config.DataBase;
import org.example.model.User;

public class UserRepository {

    DataBase dataBase =  DataBase.getInstance();

    public User findUserById(Long id){
        return dataBase.getUserById(id);
    }

    public void saveUser(User user){
        dataBase.addUser(user.getId(), user);
    }

}
