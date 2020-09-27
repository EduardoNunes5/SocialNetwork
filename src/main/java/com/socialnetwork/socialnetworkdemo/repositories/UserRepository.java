package com.socialnetwork.socialnetworkdemo.repositories;

import java.util.Optional;

import com.socialnetwork.socialnetworkdemo.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

    Optional<User> findByEmail(String email);
    Optional<User> findUserByEmail(String email);

}
