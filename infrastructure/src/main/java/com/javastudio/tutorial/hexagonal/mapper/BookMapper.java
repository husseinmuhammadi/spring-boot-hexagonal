package com.javastudio.tutorial.hexagonal.mapper;

import com.javastudio.tutorial.hexagonal.dto.Book;
import com.javastudio.tutorial.hexagonal.model.BookEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {

    Book map (BookEntity bookEntity);
    List<Book> map (List<BookEntity> bookEntity);

    BookEntity map (Book book);
}
