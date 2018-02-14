package com.example.Bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
}

@Bean
public CommandLineRunner demo(BookRepository repository) {
	return (args) -> {
		log.info("Commandline works`?");

		Book bk = new Book("George R. R. Martin", "A Game of Thrones",
				"1224557-1", 1996);
		Book bk2 = new Book("George R. R. Martin", "A Clash of Kings",
				"1224557-2", 1999);
		Book bk3 = new Book("George R. R. Martin", "A Storm of Swords",
				"1224557-3", 2000);
		Book bk4 = new Book("George R. R. Martin", "A Feast for Crows", 
				"1224557-4", 2005);
		Book bk5 = new Book("George R. R. Martin", "A Dance with Dragons",
				"1224557-5", 2011);
		Book bk6 = new Book("George R. R. Martin", "The Winds of Winter",
				"1224557-6", 2018);
		Book bk7 = new Book("George R. R. Martin", "A Dream of Spring",
				"1224557-7", 2018);

		repository.save(bk);
		repository.save(bk2);
		repository.save(bk3);
		repository.save(bk4);
		repository.save(bk5);
		repository.save(bk6);
		repository.save(bk7);

		log.info("Books found with findAll():");
		log.info("-------------------------------");
		for (Book book : repository.findAll()) {
			log.info(book.toString());
		}
		log.info("-------------------------------");
	};
		}
}