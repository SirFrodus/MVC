package com.example.springcrudthymeleaf;

import com.example.springcrudthymeleaf.model.Book;
import com.example.springcrudthymeleaf.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(App.class, args);

		var repo = context.getBean(BookRepository.class);

		List<Book> books = List.of(
		new Book(null, "Book 1", "autor", 10.0),
		new Book(null, "Book 2", "autor", 10.89),
		new Book(null, "Book 3", "autor", 10.44),
		new Book(null, "Book 4", "autor", 10.00)

		);
		repo.saveAll(books);

	}

}
