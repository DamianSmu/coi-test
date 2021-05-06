package com.example.bookApp;

import com.example.bookApp.entity.Book;
import com.example.bookApp.repository.DataSource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Map;

@SpringBootApplication
public class BookAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookAppApplication.class, args);
	}


	@Bean
	public CommandLineRunner loadData() {
		return (args) -> {
			Map<String, Book> bookMap = DataSource.getInstance();
			Book bookA = new Book("1", "BookAA", "000-00-00-00000-1");
			Book bookB = new Book("2", "BookAA-B", "000-00-00-00000-2");
			Book bookC = new Book("3", "BookC", "000-00-00-00000-3");
			bookMap.put(bookA.getId(), bookA);
			bookMap.put(bookB.getId(), bookB);
			bookMap.put(bookC.getId(), bookC);
		};
	}
}
