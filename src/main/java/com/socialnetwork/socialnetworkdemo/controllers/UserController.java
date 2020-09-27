package com.socialnetwork.socialnetworkdemo.controllers;

import com.socialnetwork.socialnetworkdemo.entities.User;
import com.socialnetwork.socialnetworkdemo.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping(value = "users")
    public ResponseEntity<?> createUser(@RequestBody User user){
        try {
            return new ResponseEntity<>(this.userService.createUser(user), HttpStatus.OK);
        }
        catch(IllegalArgumentException iae){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    
}
