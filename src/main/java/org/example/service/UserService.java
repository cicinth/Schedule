package org.example.service;

import org.example.model.User;
import org.example.repository.UserRepository;

public class UserService {
    UserRepository userRepository = new UserRepository();
    public User createUser(Long id, String username){
        User user = new User(id, username);
        userRepository.saveUser(user);
        return user;
    }

    public User getUser(Long id){
        return userRepository.findUserById(id);
    }
}
