package com.example.demo.service;

import com.example.demo.entity.Ground;
import com.example.demo.pojo.UserPojo;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface UserService {
    User saveUser(UserPojo userPojo);
    List<User> getAll();
    void deleteById(int id);
   Optional<Ground> findById(int id);
}
