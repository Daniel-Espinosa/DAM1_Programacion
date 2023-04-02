/*4. FileWriter y FileReader
Utiliza las clases FileWriter y FileReader para crear dos programas similares a los anteriores,
utilizando con ellas las clases BufferedWriter y BufferedReader.*/
package hoja17;

import java.io.*;
import java.util.Scanner;

public class EJ4 {

    public static void main(String[] args) {
        
        //Lector de archivos
        FileReader fr = null;
        //Escritor de Archivos
        FileWriter fw = null;
        
        //Variables
        String nombre;
        int edad;
        
        
        // utilizo Scanner para ahorra tiempo
        Scanner scT = new Scanner(System.in);
        Scanner scN = new Scanner(System.in);
        
        //Introduccion de datos
        System.out.println("Introduce un nombre");
        nombre = scT.nextLine();
        System.out.println("Introduce la edad");
        edad = scN.nextInt();
        
        try {
            fw = new FileWriter("EJ4.txt");
            fw.write("Nombre: " + nombre + ", Edad: " + edad);
        } catch (IOException e) {
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
            }
        }
        
        try {
            fr = new FileReader("EJ4.txt");
            int caracter;
            String cadena = "";
            //Para poder leer el archivo se necesita un bucle while
            //El bucle almacena el byte del en la variable caracter en codigo Asci
            while ((caracter = fr.read()) > 0) {                
                //almaceno cada caracter, es necesario Recastearlo. 
                cadena += (char)caracter;
            }
            
            System.out.println(cadena);
            
        } catch (IOException e) {
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
            }
        }
        
    }
    
}
