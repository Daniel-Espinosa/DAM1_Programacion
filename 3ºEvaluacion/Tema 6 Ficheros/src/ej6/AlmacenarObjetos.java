package ej6;

import java.io.*;

public class AlmacenarObjetos {

    public static void main(String[] args) {

        Amigo am1 = new Amigo("Pablo", 987987987);
        Amigo am2 = new Amigo("Laura", 678678678);
        Amigo am3 = new Amigo("Carlos", 876876876);

        FileOutputStream fos = null;
        ObjectOutputStream flujosalidaobjetos = null;
       
        try {
            
            fos = new FileOutputStream("amigos.dat"); //.dat
         
            flujosalidaobjetos = new ObjectOutputStream(fos);
            
            //esto añade de uno a uno o machaca uno al siguiente?
            flujosalidaobjetos.writeObject(am1);           
            flujosalidaobjetos.writeObject(am2);           
            flujosalidaobjetos.writeObject(am3);

        } catch (IOException e) {
            System.err.println("Ha ocurrido una IOException");
        } finally {
            try {
                if (flujosalidaobjetos != null) { //cerrar por fos
                    flujosalidaobjetos.close();                   
                    fos.close(); 
                }
            } catch (IOException e) {
                System.err.println("Ha ocurrido una IOException");

            }

        }
    }
}
