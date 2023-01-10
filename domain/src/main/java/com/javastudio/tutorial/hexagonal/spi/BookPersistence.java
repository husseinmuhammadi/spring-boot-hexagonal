package com.javastudio.tutorial.hexagonal.spi;

import com.javastudio.tutorial.hexagonal.dto.Book;

import java.util.List;
import java.util.Optional;

public interface BookPersistence {
    Book addBook(Book book);

    void deleteBookById(Long id);

    Book updateBook(Book book);

    List<Book> getBooks();

    Optional<Book> getBookById(Long bookId);
}
