/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.cafeconaplito.rest.controller;

import com.cafeconaplito.rest.entity.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author produccion
 */
public class PruebasWebTest {
    
    public PruebasWebTest() {
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
     * Test of holaMundo method, of class PruebasWeb.
     */
    @Test
    public void testHolaMundo() {
        System.out.println("holaMundo");
        PruebasWeb instance = new PruebasWeb();
        String expResult = "";
        String result = instance.holaMundo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bots method, of class PruebasWeb.
     */
    @Test
    public void testBots() {
        System.out.println("bots");
        PruebasWeb instance = new PruebasWeb();
        String expResult = "";
        String result = instance.bots();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculatePrice method, of class PruebasWeb.
     */
    @Test
    public void testCalculatePrice() {
        System.out.println("calculatePrice");
        Book book = null;
        PruebasWeb instance = new PruebasWeb();
        double expResult = 0.0;
        double result = instance.calculatePrice(book);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
