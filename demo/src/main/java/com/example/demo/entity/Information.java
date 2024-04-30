package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "informations")

public class Information {
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "informations_seq_gen")
    @SequenceGenerator(sequenceName = "informations_seq",name="informations_seq_gen",allocationSize=1)


    @Id
    private Integer id;

    @Column(name = "Name",nullable = false,length = 50)
    private String name;

    @Column(name = "age",nullable = false)
    private Integer age;

    @Column(name = "Ph No.",nullable = false,length = 10)
    private Integer phNo;


}
