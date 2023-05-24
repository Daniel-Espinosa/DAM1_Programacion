package ejemplo5;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import ejemplo1.Estudiante;
import java.io.File;
import java.util.Scanner;

public class Ejemplo5 {

    public static void main(String[] args) {

        File fichero = new File("Ejemplo");
        fichero.delete();

        ObjectContainer bd = Db4oEmbedded.openFile("Ejemplo");

        bd.store(new Estudiante("Pedro", 6));
        bd.store(new Estudiante("Nuria", 7));
        bd.store(new Estudiante("Luis", 4));
        bd.store(new Estudiante("Pedro", 6));
        bd.store(new Estudiante("Pedro", 0));
        bd.store(new Estudiante("Pepe", 0));

        System.out.println("Muestra toda la lista");
        Estudiante e1 = new Estudiante(null, 0);
        ObjectSet os = bd.queryByExample(e1);
        while (os.hasNext()) {
            e1 = (Estudiante) os.next();
            e1.info();
        }

        String nombre;
        int nota;
        String aux = "";

        System.out.println("Quieres modificar la nota de algun Alumno");
        System.out.println("Introduce el nombre: ");
        Scanner sc = new Scanner(System.in);
        nombre = sc.next();

        Estudiante e2 = new Estudiante(null, 0);
        os = bd.queryByExample(e2);
        while (os.hasNext()) {
            e2 = (Estudiante) os.next();
            if (nombre.equals(e2.getNombre())) {
                System.out.println("Quieres modificar la nota de: " + e2.getNombre() + " con nota: " + e2.getNota() + " Y / N");
                if ("Y".equalsIgnoreCase(aux)) {

                    bd.delete(e2);
                    System.out.println("Introduce la nota");
                    Scanner scNum = new Scanner(System.in);
                    nota = scNum.nextInt();
                    bd.store(new Estudiante(nombre, nota));
                    
                }

            }
        }

        bd.close();

    }

}
