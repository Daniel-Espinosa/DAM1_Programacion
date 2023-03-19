/*



*/
package com.prog03.principal;

import com.prog03.figuras.Rectangulo;


public class Principal {


    public static void main(String[] args) {
        
        Rectangulo objRect1 = new Rectangulo();
        Rectangulo objRect2 = new Rectangulo(5,3);
        
        objRect1.setAlt(6);
        objRect1.setBase(6);
        
        
        //Salida por pantalla rectangulo 1
        System.out.println("Rectangulo 1:");
        System.out.println(objRect1.toString());
        System.out.println("El area es de: " + objRect1.getArea());
        if (objRect1.isCuadrado()==true) {
            System.out.println("Es un cuadrado");
        }else{
            System.out.println("Es un rectangulo");
        }
        
        //Salidad por pantalla rectangulo 2
        System.out.println("Rectangulo 2:");
        System.out.println(objRect2.toString());
        System.out.println("El area es de: " + objRect2.getArea());
        if (objRect2.isCuadrado()==true) {
            System.out.println("Es un cuadrado");
        }else{
            System.out.println("Es un rectangulo");
        }
        
    }
    
}
