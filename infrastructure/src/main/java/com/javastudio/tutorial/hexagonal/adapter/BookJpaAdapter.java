package com.javastudio.tutorial.hexagonal.adapter;

import com.javastudio.tutorial.hexagonal.dto.Book;
import com.javastudio.tutorial.hexagonal.mapper.BookMapper;
import com.javastudio.tutorial.hexagonal.model.BookEntity;
import com.javastudio.tutorial.hexagonal.repository.BookRepository;
import com.javastudio.tutorial.hexagonal.spi.BookPersistence;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookJpaAdapter implements BookPersistence {

    private final BookRepository repository;
    private final BookMapper mapper;

    public BookJpaAdapter(BookRepository repository, BookMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Book addBook(Book book) {
        BookEntity savedBook = repository.save(mapper.map(book));
        return mapper.map(savedBook);
    }

    @Override
    public void deleteBookById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Book updateBook(Book book) {
        BookEntity updatedEntity  = repository.save(mapper.map(book));
        return mapper.map(updatedEntity);
    }

    @Override
    public List<Book> getBooks() {
        return mapper.map(repository.findAll());
    }

    @Override
    public Optional<Book> getBookById(Long bookId) {
        return repository.findById(bookId).map(mapper::map);
    }
}
