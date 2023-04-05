package Ejercicio1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        boolean control = true;
        int opcion;
        
        Gestion lista = new Gestion();

        do {
            System.out.println("1 Añadir empleado");
            System.out.println("2 Eliminar empleado");
            System.out.println("3 Generar fichero.dat con los datos de los empleado");
            System.out.println("4 Leer fichero.dat con los datos de los empleado");
            System.out.println("5 Salir");
            
            // me fio de la buena fe del usuario
            Scanner scNum = new Scanner(System.in);
            Scanner scTxt = new Scanner(System.in);
            opcion = scNum.nextInt();

            switch (opcion) {
                case 1:
                    lista.insertar();

                    break;
                case 2:
                    System.out.println("introduce un DNI");
                    String dni = scTxt.nextLine();
                    lista.eliminar(dni);
                    break;
                case 3:
                    lista.guardarFichero();
                    break;
                case 4:
                    lista.leer_fichero();
                    break;
                case 5:
                    System.out.println("Adios!");
                    control = false;
                    break;
                default:
                    System.out.println("introduce una opcion valida");
            }

        } while (control);

    }

}
