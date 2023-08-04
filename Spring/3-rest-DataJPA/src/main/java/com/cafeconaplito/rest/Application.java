package com.cafeconaplito.rest;

import com.cafeconaplito.rest.repository.BookRepository;
import com.cafeconaplito.rest.entity.Book;
import java.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Application.class, args);

        BookRepository repo = context.getBean(BookRepository.class);

        //cuento los libros
        System.out.println("libro en la BBDD");
        System.out.println(repo.count());

        // creo un libro
        Book b1 = new Book(null, "libro 1", "Author 1", 55, 10.50, LocalDate.of(1992, 5, 15), false);
        Book b2 = new Book(null, "libro 2", "Author 1", 102, 15.50, LocalDate.of(1950, 6, 5), false);

        //almaceno libro
        repo.save(b1);
        repo.save(b2);

        //cuento los libros
        System.out.println("libros en la BBDD");
        System.out.println(repo.count());

        //Borro los libros
        //repo.deleteById(1L);

        //muestro los libros
        System.out.println("libros en la BBDD");
        System.out.println(repo.count());

    }

}
