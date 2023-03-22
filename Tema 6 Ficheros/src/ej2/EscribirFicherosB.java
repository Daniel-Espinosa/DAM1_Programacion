package ej2;

import java.io.*;


public class EscribirFicherosB {

    public static void main(String[] args) {
        FileOutputStream fos = null;      

        String texto = "En un lugar de la mancha de cuyo nombre no quiero acordarme...";
        char c = 0;
        try {
            fos = new FileOutputStream("C:\\Usuarios\\datos.txt"); // la ruta es incorrecta
          
            for (int i = 0; i < texto.length(); i++) {   
                c = texto.charAt(i);  
                fos.write((byte) c);                     
            }                                            
        } catch (IOException e) {
            System.err.println("Ha ocurrido una IOException");
        } finally {
            try {
                fos.close();                    		
            } catch (IOException e) {             
                System.err.println("Ha ocurrido una IOException");
            }
            
        }
    }
}

