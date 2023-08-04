/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prueba1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author produccion
 */
public class Prueba1 {

    public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");    
    HolaMundo hm = (HolaMundo) context.getBean("pruebasHolaMundo");
    
    String texto = hm.holaMundo();
    
        System.out.println(texto);

        
    }
}
