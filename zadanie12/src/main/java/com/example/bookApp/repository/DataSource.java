package com.example.bookApp.repository;

import com.example.bookApp.entity.Book;

import java.util.HashMap;

public class DataSource {
    private static HashMap<String, Book> dataSource;

    public static HashMap<String, Book> getInstance() {
        if (dataSource == null) {
            dataSource = new HashMap<>();
        }
        return dataSource;
    }
}
