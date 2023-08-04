/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.cafeconaplito.rest.controller;

import com.cafeconaplito.rest.entity.Book;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author produccion
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookControllerTest {
    
    
    
    public BookControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of findAll method, of class BookController.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        BookController instance = null;
        List<Book> expResult = null;
        List<Book> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneById method, of class BookController.
     */
    @Test
    public void testFindOneById() {
        System.out.println("findOneById");
        Long id = null;
        BookController instance = null;
        ResponseEntity<Book> expResult = null;
        ResponseEntity<Book> result = instance.findOneById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class BookController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Book book = null;
        BookController instance = null;
        ResponseEntity<Book> expResult = null;
        ResponseEntity<Book> result = instance.create(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class BookController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Book book = null;
        BookController instance = null;
        ResponseEntity<Book> expResult = null;
        ResponseEntity<Book> result = instance.update(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteById method, of class BookController.
     */
    @Test
    public void testDeleteById() {
        System.out.println("deleteById");
        Long id = null;
        BookController instance = null;
        ResponseEntity<Book> expResult = null;
        ResponseEntity<Book> result = instance.deleteById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAll method, of class BookController.
     */
    @Test
    public void testDeleteAll() {
        System.out.println("deleteAll");
        BookController instance = null;
        ResponseEntity<Book> expResult = null;
        ResponseEntity<Book> result = instance.deleteAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
