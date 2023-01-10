package com.javastudio.tutorial.hexagonal.model;

import com.javastudio.tutorial.hexagonal.dto.Book;
import jdk.jfr.DataAmount;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookModel {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private String isbn;
}
