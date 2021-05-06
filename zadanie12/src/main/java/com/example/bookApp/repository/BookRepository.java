package com.example.bookApp.repository;


import com.example.bookApp.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class BookRepository {
    public Optional<Book> findByISBN(String iban){
        return DataSource.getInstance().values().stream().filter(b -> b.getISBN().equals(iban)).findAny();
    }
    public List<Book> findByTitle(String title){
        return DataSource.getInstance().values().stream().filter(b -> b.getTitle().matches(".*" + title + ".*")).collect(Collectors.toList());
    }
}
