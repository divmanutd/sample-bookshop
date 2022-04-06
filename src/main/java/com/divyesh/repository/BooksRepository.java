package com.divyesh.repository;

import org.springframework.data.repository.CrudRepository;

import com.divyesh.model.Book;

//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Book, Integer> {
}