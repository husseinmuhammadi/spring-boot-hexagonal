package com.javastudio.tutorial.hexagonal.resources;

import com.javastudio.tutorial.hexagonal.api.BookService;
import com.javastudio.tutorial.hexagonal.mapper.BookModelMapper;
import com.javastudio.tutorial.hexagonal.model.BookModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksResource {

    private final BookService bookService;
    private final BookModelMapper mapper;

    public BooksResource(BookService bookService, BookModelMapper mapper) {
        this.bookService = bookService;
        this.mapper = mapper;
    }

    @GetMapping
    public List<BookModel> findBooks() {
        return mapper.map(bookService.getBooks());
    }
}
