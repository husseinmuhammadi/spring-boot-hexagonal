package com.javastudio.tutorial.hexagonal.config;

import com.javastudio.tutorial.hexagonal.api.BookService;
import com.javastudio.tutorial.hexagonal.service.BookServiceImpl;
import com.javastudio.tutorial.hexagonal.spi.BookPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {

    @Autowired
    private BookPersistence bookPersistence;

    @Bean
    public BookService bookService() {
        return new BookServiceImpl(bookPersistence);
    }
}
