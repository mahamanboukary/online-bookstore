package com.mbmb.onlinebookstore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mbmb.onlinebookstore.entity.Book;
import com.mbmb.onlinebookstore.repository.BookRepository;

@SpringBootApplication
public class OnlineBookStoreApplication  implements CommandLineRunner {
	
	
	@Autowired
	private BookRepository  bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(OnlineBookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		List<Book> books = bookRepository.findAll();
		
		for (Book book : books) {
			
			
			System.out.println(book.getSku());
			System.out.println(book.getName());
			
		}
		
	}

}
