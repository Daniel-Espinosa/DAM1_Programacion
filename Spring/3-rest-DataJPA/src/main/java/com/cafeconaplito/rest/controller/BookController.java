/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafeconaplito.rest.controller;

import com.cafeconaplito.rest.entity.Book;
import com.cafeconaplito.rest.repository.BookRepository;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author produccion
 */
@RestController
public class BookController {

    //atributo
    private BookRepository bookRepository;
    private final Logger log = LoggerFactory.getLogger(BookController.class);

    //constructor
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //METODOSs
    //buscar todos los libros (lista)
    @GetMapping("/api/books")
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    // busca un libro por la ID, tiene que 
    @GetMapping("/api/books/{id}")
    public ResponseEntity<Book> findOneById(@PathVariable Long id) {

        Optional<Book> bookOpt = bookRepository.findById(id);

        // si encuntra o no el Id del libro devuelve valor y sino lo encuentra retorna 404
        // opcion1
        if (bookOpt.isPresent()) {
            return ResponseEntity.ok(bookOpt.get());
        } else {
            return ResponseEntity.notFound().build();
        }

        //simplificada
        //opcion2
        //return bookOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * Se añade un libro nuevo desde postman y devuelve los datos del mismo.
     *
     * @param book
     * @return
     */
    @PostMapping("/api/books")
    public ResponseEntity<Book> create(@RequestBody Book book) {
        if (book.getId() != null) {
            log.warn("El libro ya existe");
            return ResponseEntity.badRequest().build();
        }
        Book result = bookRepository.save(book);
        return ResponseEntity.ok(result);

    }

    /**
     *
     * @param id
     * @return
     */
    @PutMapping("/api/books")
    public ResponseEntity<Book> update(@RequestBody Book book) {
        if (book.getId() == null) { // si no tiene ID el libro no existe o lo pasa mal
            log.warn("Libro sin ID no se puede actualizar");
            return ResponseEntity.badRequest().build();
        }
        if (bookRepository.existsById(book.getId())) { // si envia ID pero no existe
            log.warn("Libro sin ID no se puede actualizar");
            return ResponseEntity.notFound().build();
        }

        Book result = bookRepository.save(book);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/api/books/{id}")
    public ResponseEntity<Book> deleteById(@PathVariable Long id) {

        if (!bookRepository.existsById(id)) {
            log.warn("El libro que quieren borrar no existe");
            return ResponseEntity.notFound().build();
        }
        bookRepository.deleteById(id);
        return ResponseEntity.noContent().build();

    }
    
    @DeleteMapping("/api/books")
    
    public ResponseEntity<Book> deleteAll() {

        if (bookRepository.count() == 0) {
            log.warn("No se puede borrar todo ya no hay nada en la bbdd");
            return ResponseEntity.badRequest().build();
        }
        bookRepository.deleteAll();
        return ResponseEntity.noContent().build();

    }


}
