package com.ana.librarian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class LibrarianApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrarianApplication.class, args);
	}
}
