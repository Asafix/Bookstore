package com.example.Bookstore;

import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Bookstore.bean.Book;
import com.example.Bookstore.bean.BookRepository;

@SpringBootApplication
public class BookstoreApplication {
	private static final Logger Log = LoggerFactory.getLogger(BookstoreApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

@Bean
public CommandLineRunner demo(BookRepository repository) {
	return (args) -> {
		Log.info("Books listed?");

		Book bk = new Book("George R. R. Martin", "A Game of Thrones",
				"1224557-1", "1996");
		Book bk2 = new Book("George R. R. Martin", "A Clash of Kings",
				"1224557-2", "1999");
		Book bk3 = new Book("George R. R. Martin", "A Storm of Swords",
				"1224557-3", "2000");
		Book bk4 = new Book("George R. R. Martin", "A Feast for Crows", 
				"1224557-4", "2005");
		Book bk5 = new Book("George R. R. Martin", "A Dance with Dragons",
				"1224557-5", "2011");
		Book bk6 = new Book("George R. R. Martin", "The Winds of Winter",
				"1224557-6", "2018");
		Book bk7 = new Book("George R. R. Martin", "A Dream of Spring",
				"1224557-7", "2018");

		repository.save(bk);
		repository.save(bk2);
		repository.save(bk3);
		repository.save(bk4);
		repository.save(bk5);
		repository.save(bk6);
		repository.save(bk7);

		Log.info("Books found with findAll():");
		Log.info("-------------------------------");
		for (Book book : repository.findAll()) {
			Log.info(book.toString());
		}
		Log.info("-------------------------------");
	};
		}
}