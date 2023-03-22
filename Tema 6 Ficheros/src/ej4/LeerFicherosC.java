package ej4;

import java.io.*;

public class LeerFicherosC {

    public static void main(String[] args) {

        FileReader fr = null;        
        String texto = "";
        char c = 0;
        try {
            fr = new FileReader("datos1.txt");
           
            do {                              
                c = (char) fr.read();            
                texto = texto + c;          
            } while (c != '.'); // si no encuentra un punto el bucle sera infinito
            System.out.println(texto);
        } catch (FileNotFoundException fnfe) {
            System.err.println("Archivo no encontrado");
        } catch (IOException e) {
            System.err.println("Ha ocurrido una IOException");
        } finally {
            try {

                if (fr != null) {
                    fr.close();                  
                }                                   
            } catch (IOException e) {
                System.err.println("Ha ocurrido una IOException");
            }

        }

    }
}
