/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.cafeconpalito.SpringSecurityCifrado;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author produccion
 */
public class EncryptionTest {

    public EncryptionTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    void bcryptTest() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String passwordCifrado = passwordEncoder.encode("admin");
        System.out.println("PASSWORD");
        System.out.println(passwordCifrado);
        boolean matches = passwordEncoder.matches("admin", passwordCifrado);

        System.out.println("BOOLEAN");
        System.out.println(matches);

    }

    @Test
    void multiBcryptTest() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        for (int i = 0; i < 10; i++) {
            String passwordCifrado = passwordEncoder.encode("admin");
            System.out.println(passwordCifrado);
        }
    }
    
}
