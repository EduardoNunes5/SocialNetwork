package com.socialnetwork.socialnetworkdemo.dtos;

import com.socialnetwork.socialnetworkdemo.entities.User;
import lombok.Data;

@Data
public class UserDTO {

    private long id;
    private int age;
    private String name;
    private String email;


    public UserDTO(User user){
        this.id = user.getId();
        this.age = user.getAge();
        this.name = user.getName();
        this.email = user.getEmail();
    }
}
