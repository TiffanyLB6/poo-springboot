package com.ups.poo.controller;

import com.ups.poo.dto.BookDTO;
import com.ups.poo.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class BookController {
    public final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/all-books")
    public ResponseEntity findAllBooks(){
        List<BookDTO> bookDTOList = new ArrayList<>();
        bookDTOList = bookService.findAllBooks();
        return new ResponseEntity<>(bookDTOList, HttpStatus.OK);
    }
}
