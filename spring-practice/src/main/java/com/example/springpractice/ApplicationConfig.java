package com.example.springpractice;

import com.example.springpractice.book.BookRepository;
import com.example.springpractice.book.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = SpringPracticeApplication.class)
public class ApplicationConfig {

//
//    @Bean
//    public BookRepository bookRepository() {
//        return new BookRepository();
//    }
//
//    @Bean
//    public BookService bookService() {
//        return new BookService();
//    }

}
