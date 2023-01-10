package com.javastudio.tutorial.hexagonal.mapper;

import com.javastudio.tutorial.hexagonal.dto.Book;
import com.javastudio.tutorial.hexagonal.model.BookModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface BookModelMapper {

    BookModel map(Book book);
    List<BookModel> map(List<Book> books);
    Book map(BookModel bookModel);
}
