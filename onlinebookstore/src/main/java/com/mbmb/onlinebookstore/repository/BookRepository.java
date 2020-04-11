package com.mbmb.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbmb.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
