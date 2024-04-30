package com.example.demo.repository;
import com.example.demo.entity.Ground;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroundRepository  extends JpaRepository<Ground, Integer> {

}
