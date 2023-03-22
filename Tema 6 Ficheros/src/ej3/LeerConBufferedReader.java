package ej3;

import java.io.*;


public class LeerConBufferedReader {

    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader bufferTeclado = new BufferedReader(isr);
            System.out.println("Introduzca un entero");
            String cadena = bufferTeclado.readLine();
            Integer.parseInt(cadena);
            System.out.println("Gracias por introducir " + cadena);
        } catch (IOException e) {
            System.err.println("Ha ocurrido una IOException");
        } // falta la excepcion NumberFormatException

    }
}
