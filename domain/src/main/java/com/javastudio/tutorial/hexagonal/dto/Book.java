package com.javastudio.tutorial.hexagonal.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private String isbn;
}
