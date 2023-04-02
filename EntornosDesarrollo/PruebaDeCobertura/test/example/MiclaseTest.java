/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author produccion
 */
public class MiclaseTest {
    
    public MiclaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
 public void testNumero_mayor_caso1() {
 int a = 5;
 int b = 3;
 int c = 7;
 MiClase instance = new MiClase();
 int expResult = 7;
 int result = instance.numero_mayor(a, b, c);
 assertEquals(expResult, result);
 }
 @Test
 public void testNumero_mayor_caso2() {
 int a = 5;
 int b = 3;
 int c = 4;
 MiClase instance = new MiClase();
 int expResult = 5;
 int result = instance.numero_mayor(a, b, c);
 assertEquals(expResult, result);
 }

 @Test
 public void testNumero_mayor_caso3() {
 int a = 5;
 int b = 7;
 int c = 6;
 MiClase instance = new MiClase();
 int expResult = 7;
 int result = instance.numero_mayor(a, b, c);
 assertEquals(expResult, result);
 }

 @Test
 public void testNumero_mayor_caso4() {
 int a = 5;
 int b = 7;
 int c = 9;
 MiClase instance = new MiClase();
 int expResult = 9;
 int result = instance.numero_mayor(a, b, c);
 assertEquals(expResult, result);
 }
    
    
    
    
}
