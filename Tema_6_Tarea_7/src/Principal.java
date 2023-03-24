/*Crea una clase Principal en la que se le solicita al usuario el nombre del fichero en el que
quiere grabar los datos. Después carga la colección que haya almacenada en ese fichero si es
que existe.

Ofrece un menú repetitivo al usuario con las opciones:

1. Grabar un nuevo alumno.
2. Listar los alumnos grabados.
3. Mostar todos los alumnos en orden alfabético
4. Hacer la media de los aprobados, de los suspensos y de todos.
5. Buscar un alumno concreto.
6. Modificar la nota de un alumno concreto.
7. Mostar todos los alumnos en orden alfabético.
8. Borrar un alumno concreto.
9. Borrar el fichero guardado.
10. Cambiar el nombre del fichero.
11. Salir.*/

import java.io.*;
import java.util.*;

public class Principal {

    public static void main(String[] args) {

        boolean salir = true;
        int opcion;
                
        // inicio del programa
        // se solicita un nombre del archivo y se carga la informacion del mismo si existiera.
        Metodos_Alumnos.nombre_archivo();
        Metodos_Alumnos.leer_coleccion_del_fichero();
        
        do {
            try {
                System.out.println("");
                System.out.println("Introduce una opcion:");
                System.out.println("1. Grabar un nuevo alumno.\n"
                                    + "2. Listar los alumnos grabados.\n"
                                    + "3. Mostar todos los alumnos en orden alfabético\n"
                                    + "4. Hacer la media de los aprobados, de los suspensos y de todos.\n"
                                    + "5. Buscar un alumno concreto.\n"
                                    + "6. Modificar la nota de un alumno concreto.\n"
                                    + "7. Mostar todos los alumnos en orden alfabético.\n"
                                    + "8. Borrar un alumno concreto.\n"
                                    + "9. Borrar el fichero guardado.\n"
                                    + "10. Cambiar el nombre del fichero.\n"
                                    + "11. Salir.");

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                opcion = Integer.parseInt(br.readLine());
                switch (opcion) {
                    case 1:
                        System.out.println("1. Grabar un nuevo alumno");
                        // se añade un alumno al ArrayList y se guarda la informacion en el fichero.
                        Metodos_Alumnos.anadir_alumno();
                        Metodos_Alumnos.grabar_coleccion_en_fichero();
                        break;
                    case 2:
                        //se muestra por pantalla todos los alumnos guardados en el Array list
                        System.out.println("2. Listar los alumnos grabados");
                        Metodos_Alumnos.listar_alumnos();
                        break;
                    case 3:
                        // TOCA CREAR UN NUEVO METODO PARA ESTO
                        System.out.println("3. Mostar todos los alumnos en orden alfabético");
                        Metodos_Alumnos.listar_orden_alfabetico();
                        break;
                    case 4:
                        //Creo un metodo nuevo para esta funcion en Metodos_Alumnos.
                        System.out.println("4. Hacer la media de los aprobados, de los suspensos y de todos");
                        Metodos_Alumnos.media_notas();
                        break;
                    case 5:
                        //Busca por el nombre un alunmo y muestra el nombre y la calificacion, si existe mas de uno imprime todos los que encuentra
                        System.out.println("5. Buscar un alumno concreto");
                        Metodos_Alumnos.buscar_alumno();
                        break;
                    case 6:
                        //TOCA CREAR UN METODO PARA ESTO
                        //Metodo creado busca en el array las coincidencias con el nombre y si lo encuentra pregunta si quieres modificar la nota (puede encontrar mas de una coincidencia de nombre)
                        //guarda el fichero al terminar
                        System.out.println("6. Modificar la nota de un alumno concreto");
                        Metodos_Alumnos.modificar_nota();
                        Metodos_Alumnos.grabar_coleccion_en_fichero();
                        break;
                    case 7:
                        //TOCA CREAR UN METODO PARA ESTO, ES IGUAL AL 3 y tenemos un metodo que es listar alumnos que no utilizamos
                        System.out.println("7. Mostar todos los alumnos en orden alfabético");
                        Metodos_Alumnos.listar_orden_alfabetico();
                        break;
                    case 8:
                        //Introduciendo nombre y Calificacion exacta de un alumno lo borra del ArrayList y guarda el fichero.                       
                        System.out.println("8. Borrar un alumno concreto");
                        Metodos_Alumnos.borrar_alumno();
                        Metodos_Alumnos.grabar_coleccion_en_fichero();
                        break;
                    case 9:
                        //si el archivo existe lo borra sino avisa de que no existe.
                        System.out.println("9. Borrar el fichero guardado");
                        Metodos_Alumnos.borrarFichero();
                        break;
                    case 10:
                        //Comprueba que el fichero existe y si es asi solicita por teclado el nombre y lo modifica por el nuevo
                        System.out.println("10. Cambiar el nombre del fichero");
                        Metodos_Alumnos.renombrar_fichero();
                        break;
                    case 11:
                        System.out.println("Adios!");
                        salir = false;
                        break;
                    default:
                        System.err.println("Introduce una opcion del 1 al 11");
                }

            } catch (NumberFormatException e) {
                System.err.println("Tienes que introducir un valor numerico");
            } catch (IOException e) {
                System.err.println("IOException");
            }
        } while (salir);

    }

}
