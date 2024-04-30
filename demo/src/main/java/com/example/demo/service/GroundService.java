package com.example.demo.service;

import com.example.demo.entity.Ground;
import com.example.demo.pojo.GroundPojo;

import java.util.List;
import java.util.Optional;

public interface GroundService {
    void save(GroundPojo groundPojo);
    List<Ground> getAll();
    void deleteById(int id);
    Optional<GroundPojo> getById(int id);


    void deleteById(Integer id);

    void saveData(GroundPojo groundPojo);
    Optional<GroundPojo> getDataById(int id);

    Optional<GroundPojo> findById(Integer id);
}
