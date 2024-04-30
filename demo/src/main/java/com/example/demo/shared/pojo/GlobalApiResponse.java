package com.example.demo.shared.pojo;


import lombok.*;
import java.util.List;
import  java.util.Map;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class GlobalApiResponse<T> {
    private String message;
    private Integer statusCode;
    private T data;
}
