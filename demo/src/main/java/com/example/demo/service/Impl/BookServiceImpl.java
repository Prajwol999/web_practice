package com.example.demo.service.Impl;

import com.example.demo.entity.Book;
import com.example.demo.entity.Ground;
import com.example.demo.pojo.BookPojo;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.GroundRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final GroundRepository groundRepository;
    private final UserRepository userRepository;



    @Override
    public void saveData(BookPojo bookPojo) {
        Book book = new Book();
        book.setName(bookPojo.getBookName());

        Ground ground =groundRepository.findById(bookPojo.getGroundId()).get();
        book.setGround(ground);

        User user = userRepository.findById(bookPojo.getUserId()).get();
        book.setUser(user);

        bookRepository.save(book);




    }
}
