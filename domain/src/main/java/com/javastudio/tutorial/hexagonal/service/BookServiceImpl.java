package com.javastudio.tutorial.hexagonal.service;

import com.javastudio.tutorial.hexagonal.api.BookService;
import com.javastudio.tutorial.hexagonal.dto.Book;
import com.javastudio.tutorial.hexagonal.spi.BookPersistence;

import java.util.List;
import java.util.Optional;

public class BookServiceImpl implements BookService {

    private final BookPersistence bookPersistence;

    public BookServiceImpl(BookPersistence bookPersistence) {
        this.bookPersistence = bookPersistence;
    }

    @Override
    public Book addBook(Book book) {
        return bookPersistence.addBook(book);
    }

    @Override
    public void deleteBookById(Long id) {
        bookPersistence.deleteBookById(id);
    }

    @Override
    public Book updateBook(Book book) {
        return bookPersistence.updateBook(book);
    }

    @Override
    public List<Book> getBooks() {
        return bookPersistence.getBooks();
    }

    @Override
    public Optional<Book> getBookById(Long bookId) {
        return bookPersistence.getBookById(bookId);
    }
}
