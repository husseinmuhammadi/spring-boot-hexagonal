package com.javastudio.tutorial.hexagonal.repository;

import com.javastudio.tutorial.hexagonal.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
