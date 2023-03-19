package ejercicio14;

import java.util.Scanner;

public class Principal  {

    public static void main(String[] args) {

        Agenda contactos = new Agenda(4);
        int numero = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Introduce el número de la opción que quieres seleccionar:");
            System.out.println("1. Añadir nuevo contacto.");
            System.out.println("2. Mostrar la agenda.");
            System.out.println("3. Buscar contacto.");
            System.out.println("4. Mostrar el número de contactos de la agenda.");
            System.out.println("5. Modificar contacto.");
            System.out.println("6. Salir.");

            numero = teclado.nextInt();

            switch (numero) {
                case 1:
                    System.out.print("Introduce el nombre del contacto que quieres añadir: ");
                    String nombre = teclado.next();
                    System.out.print("Introduce el teléfono del contacto que quieres añadir: ");
                    int telefono = teclado.nextInt();
                    Persona persona = new Persona(nombre, telefono);
                    contactos.anadir(persona);
                    break;
                case 2:
                    contactos.mostrar();
                    break;
                case 3:
                    System.out.print("Introduce el nombre del contacto que quieres buscar: ");
                    nombre = teclado.next();
                    contactos.buscar(nombre);
                    break;
                case 4:
                    System.out.println("A continuación se muestra el número de contactos en la agenda: ");
                    System.out.println(contactos.getContador_personas());
                    break;
                case 5:
                    System.out.println("Introduce el nombre de la persona para cambiar su teléfono: ");
                    nombre = teclado.next();
                    System.out.println("Introduce el nuevo teléfono: ");
                    telefono = teclado.nextInt();
                    contactos.modificar(nombre, telefono);
                    break;
                case 6:
                    System.out.println("Se va a cerrar el programa.");
                    break;
                default:
                    System.out.println("No has seleccionado ninguna de las opciones.");
                    break;
            }

        } while (numero != 6);
        
    }

}
