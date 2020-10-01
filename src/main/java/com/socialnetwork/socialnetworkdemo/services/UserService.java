package com.socialnetwork.socialnetworkdemo.services;

import com.socialnetwork.socialnetworkdemo.entities.User;
import com.socialnetwork.socialnetworkdemo.repositories.UserRepository;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    private UserRepository userDAO;

    private PasswordEncoder passwordEncoder;

    public UserService(UserRepository userDAO, PasswordEncoder passwordEncoder){
        this.userDAO = userDAO;
        this.passwordEncoder = passwordEncoder;
    }


    public User createUser(User user){
        if(this.userDAO.findUserByEmail(user.getEmail()).isPresent()){
            throw new IllegalArgumentException("usuario ja existe");
        }
        User newUser = new User();
        newUser.setAge(user.getAge());
        newUser.setName(user.getName());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(this.passwordEncoder.encode(user.getPassword()));
        return userDAO.save(newUser);
    }


}