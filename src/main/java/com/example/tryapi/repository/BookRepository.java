package com.example.tryapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tryapi.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
