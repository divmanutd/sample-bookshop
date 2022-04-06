package com.divyesh.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.divyesh.model.Book;
import com.divyesh.repository.BooksRepository;  
  
//defining the business logic  
@Service  
public class BookShopService   
{  
@Autowired  
BooksRepository booksRepository;  
//getting all books record by using the method findaAll() of CrudRepository  
public List<Book> getAllBooks()   
{  
List<Book> books = new ArrayList<Book>();  
booksRepository.findAll().forEach(books1 -> books.add(books1));  
return books;  
}  
//getting a specific record by using the method findById() of CrudRepository  
public Book getBooksById(int id)   
{  
return booksRepository.findById(id).get();  
}  
//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(Book books)   
{  
booksRepository.save(books);  
}  
//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int id)   
{  
booksRepository.deleteById(id);  
}  
//updating a record  
public void update(Book books, int bookid)   
{  
booksRepository.save(books);  
}  
}  
