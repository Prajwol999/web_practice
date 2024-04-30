package com.example.demo.service.Impl;//package com.example.demo.Service.Impl;

import com.example.demo.entity.Ground;
import com.example.demo.repository.GroundRepository;
import com.example.demo.service.GroundService;
import com.example.demo.pojo.GroundPojo;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Getter
@Setter

@Service
@RequiredArgsConstructor
public class GroundServiceImpl implements GroundService {

    @Override
    public void save(GroundPojo groundPojo) {

    }

    @Override
    public List<Ground> getAll(){
        return groundRepository.findAll();
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Optional<GroundPojo> getById(int id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Integer id) {
        groundRepository.deleteById(id);//delete from table where id is what
    }

    private final GroundRepository groundRepository;





    @Override

    public void saveData(GroundPojo groundPojo) {

        Ground ground  = new Ground();
        ground.setId(groundPojo.getId());
        ground.setGroundName(groundPojo.getGroundName());

        groundRepository.save(ground);

    }

    @Override
    public Optional<GroundPojo> getDataById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<GroundPojo> findById(Integer id) {
        return Optional.empty();
    }

}