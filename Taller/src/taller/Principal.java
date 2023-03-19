package taller;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Taller vehiculos = new Taller();

        int numero;

        do {
            System.out.println("Introduce un número correspondiente a una de las siguientes opciones:");
            System.out.println("1. Añadir coche.");
            System.out.println("2. Eliminar coche.");
            System.out.println("3. Salir.");

            numero = teclado.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("Introduce la marca del coche:");
                    String marca = teclado.next();
                    System.out.println("Introduce el color del coche:");
                    String color = teclado.next();
                    System.out.println("Introduce la matrícula del coche:");
                    String matricula = teclado.next();
                    vehiculos.anade_elemento(color, marca, matricula);
                    break;
                case 2:
                    System.out.println("Introduce la matrícula del coche que quieres eliminar:");
                    String borrar = teclado.next();
                    vehiculos.elimina_elemento(borrar);
                    break;
                case 3:
                    System.out.println("Cerrando programa.");
                    break;
                default:
                    System.out.println("La opción elegida no es válida, vuelve a introducir un número.");
                    break;
            }

        } while (numero != 3);

        vehiculos.visualiza_matriculas();
        vehiculos.visualiza_coches();
        vehiculos.visualiza_taller();
        
    }

}
