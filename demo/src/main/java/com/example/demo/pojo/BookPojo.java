package com.example.demo.pojo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class BookPojo {
    private String bookName;
    private Integer groundID;
    private Integer userID;


    public Integer getGroundId() {
        return groundID;
    }

    public Integer getUserId() {
        return userID;

    }
}
