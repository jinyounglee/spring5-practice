package com.example.springpractice;

import com.example.springpractice.book.BookRepository;
import com.example.springpractice.book.BookService;
import com.example.springpractice.store.StoreRepository;
import com.example.springpractice.store.StoreService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		ApplicationContext context2 = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		String[] annotationBeanDefinitionNames = context2.getBeanDefinitionNames();


		System.out.println("beanDefinitionNames size:: " + beanDefinitionNames.length);
		System.out.println(Arrays.toString(beanDefinitionNames));
		System.out.println(Arrays.toString(annotationBeanDefinitionNames));


		BookService bookService = context.getBean(beanDefinitionNames[0], BookService.class);
		BookService bookService2 = context.getBean(beanDefinitionNames[0], BookService.class);
		BookRepository bookRepository  = context.getBean(beanDefinitionNames[1], BookRepository.class);

		StoreService storeService = context.getBean("storeService", StoreService.class);
		StoreRepository storeRepository = context.getBean("storeRepository", StoreRepository.class);

		BookService bookService1 = context2.getBean("bookService", BookService.class);
		System.out.println(bookService.getBookRepository() != null);

		System.out.println(storeService.getStoreRepository() != null );

		System.out.println(bookService1.getBookRepository() != null);
	}
}
