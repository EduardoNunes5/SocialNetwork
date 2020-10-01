package com.socialnetwork.socialnetworkdemo.entities;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String name;
    @NotNull
    private String email;
    private int age;
    @NotNull
    private String password;


    public User(){}

    public User(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String newName){
        this.name =newName;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

}
