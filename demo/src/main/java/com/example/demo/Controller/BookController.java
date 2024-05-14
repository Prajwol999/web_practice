package com.example.demo.Controller;

import com.example.demo.pojo.BookPojo;

import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor

public class BookController {
    private final BookService bookService;

    @PostMapping
    public void saveBook(@RequestBody BookPojo bookPojo) {
        bookService.saveData(bookPojo);
    }

}
