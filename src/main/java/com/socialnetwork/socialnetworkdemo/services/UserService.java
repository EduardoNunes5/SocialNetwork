package com.socialnetwork.socialnetworkdemo.services;

import com.socialnetwork.socialnetworkdemo.entities.User;
import com.socialnetwork.socialnetworkdemo.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    @Autowired
    private UserRepository userDAO;


    public User createUser(User user){
        if(this.userDAO.findUserByEmail(user.getEmail()).isPresent()){
            throw new IllegalArgumentException("usuario ja existe");
        }
        return userDAO.save(user);
    }


}