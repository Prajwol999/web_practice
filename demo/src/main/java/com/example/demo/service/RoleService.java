package com.example.demo.service;

import com.example.demo.entity.Role;
import com.example.demo.pojo.RolePojo;

import java.util.List;

public interface RoleService {

    Role saveData(RolePojo rolePojo);
    List<Role> findAll();
    Role findById(Integer id);
    void deleteById(Integer id);
}
