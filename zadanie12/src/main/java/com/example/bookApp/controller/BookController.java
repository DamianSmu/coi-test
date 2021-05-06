package com.example.bookApp.controller;

import com.example.bookApp.entity.Book;
import com.example.bookApp.repository.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class BookController {

    private final BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping("api/book/isbn/{isbn}")
    public Book getBookByISBN(@PathVariable("isbn") String ISBN){
        return repository.findByISBN(ISBN).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found"));
    }

    @GetMapping("api/book/title/{title}")
    public List<Book> getBooksByTitle(@PathVariable("title") String title){
        List<Book> result = repository.findByTitle(title);
        if(result.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found");
        }
        return result;
    }
}
