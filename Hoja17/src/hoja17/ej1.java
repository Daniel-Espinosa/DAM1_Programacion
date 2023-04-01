package hoja17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ej1 {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferTeclado = new BufferedReader(isr);

        String nombre;
        int edad = 0;
        double altura = 0;
        boolean rep;
        String leer;

        System.out.printf("Nombre: ");
        nombre = bufferTeclado.readLine();
        do {
            try {
                System.out.printf("Edad: ");
                leer = bufferTeclado.readLine();
                edad = Integer.parseInt(leer);
                rep = true;
            } catch (NumberFormatException e) {
                System.out.println("Introduce numero entero");
                rep = false;
            } catch (IOException e) {
                System.out.println("Ha ocurrido una IOException");
                rep = false;
            }

        } while (edad < 0 || edad > 10 || !rep);

        do {
            try {
                System.out.printf("Altura: ");
                leer = bufferTeclado.readLine();
                altura = Double.parseDouble(leer);
                rep = true;
            } catch (NumberFormatException e) {
                System.out.println("Introduce un número decimal");
                rep = false;
            } catch (IOException e) {
                System.out.println("Ha ocurrido una IOException");
                rep = false;
            }
        } while (altura < 0.3 || altura > 1.5 || !rep);

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        altura = altura + 0.7;
        System.out.println("Altura dentro de 10 años: " + altura);
    }
}
