package ejemploxml;

import java.io.*;
import java.util.*;

public class EjemploXML {

    public static void main(String[] args) {

        String raiz = "perros";
        String salir;

        Scanner scTxt = new Scanner(System.in);
        FileWriter fw = null;

        String texto1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        String inicio = "\n<" + raiz + ">";
        String fin = "\n</" + raiz + ">";

        try {
            fw = new FileWriter("perros.xml");
            fw.write(texto1);
            fw.write(inicio);
            do {
                String nombre;
                String raza;
                // Pedimos por teclado el nombre del perro
                do {
                    System.out.println("Introduce el nombre del perro");
                    nombre = scTxt.nextLine();
                    if (nombre.equalsIgnoreCase("")) {
                        System.out.println("Tienes que introducir un nombre");
                    }
                } while ("".equalsIgnoreCase(nombre));

                // Pedimos por teclado la raza del perro
                do {
                    System.out.println("Introduce la raza de: " + nombre);
                    raza = scTxt.nextLine();
                    if (nombre.equalsIgnoreCase("")) {
                        System.out.println("Tienes que introducir la raza de: " + nombre);
                    }
                } while ("".equalsIgnoreCase(raza));

                //añadimos 
                String insertPerro = "\n<perro>"
                        + "\n<nombre>" + nombre + "</nombre>"
                        + "\n<raza>" + raza + "</raza>"
                        + "\n</perro>";
                fw.write(insertPerro);

                
                do {
                    System.out.println("¿Quieres Salir? Y / N");
                    salir = scTxt.nextLine();
                    if (!salir.equalsIgnoreCase("Y") && !salir.equalsIgnoreCase("N")) {
                        System.out.println("Introduce Y o N");
                    }
                } while (!salir.equalsIgnoreCase("Y") && !salir.equalsIgnoreCase("N"));

            } while (!"Y".equalsIgnoreCase(salir));

            //cierra
            fw.write(fin);
            System.out.println("Fichero XML generado.");
        } catch (IOException e) {
            System.out.println("Ha ocurrido una IOException.");
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.err.println("Ha ocurrido una IOException.");
            }

        }
    }

}
