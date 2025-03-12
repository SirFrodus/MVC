package com.example.springcrudthymeleaf.repository;

import com.example.springcrudthymeleaf.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
