package com.example.springpractice.book;

import com.example.springpractice.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {


    @Autowired
    BookRepository bookRepository;

//    public BookService(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
