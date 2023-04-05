package Ejercicio1;

import java.io.*;
import java.util.*;

public class Gestion {

    private LinkedList<Personal> empleados;

    public Gestion() {
        empleados = new LinkedList<>();
    }

    public void insertar() {

        Scanner scTxt = new Scanner(System.in);
        Scanner scNum = new Scanner(System.in);

        // almaceno los datos en una variable para pasarlo y si es correcto continuar
        String dni;
        int salario;
        boolean control = false; // para saber si ya esta el empleado en la lista

        do {
            System.out.println("introduce un dni");
            dni = scTxt.nextLine();
        } while (Personal.validarDni(dni) == false);

        // me fio de la buena voluntad del Usuario
        do {
            System.out.println("Introduce un salario entre 1200 y 2100");
            salario = scNum.nextInt();
        } while (Personal.validarSalario(salario) == false);

        // si todo esta ok se crea la persona con DNI Y SALARIO
        Personal p1 = new Personal(dni, salario);

        // si la lista esta vacia añade el 1º empleado
        if (empleados.isEmpty()) {
            empleados.add(p1);
        } else { // si la lista ya tiene informacion recorremos el array comparando DNI para ver si no esta duplicado
            for (Personal i : empleados) {
                if (i.getDni().equalsIgnoreCase(dni)) {
                    control = true; // si el dni ya esta el control pasa a true
                }
            }

            if (control == true) {
                System.out.println("El empleado ya esta en la lista");
                System.out.println("no se añadira");
            } else {
                System.out.println("Empleado añadido a la lista");
                empleados.add(p1);
            }
        }
    }

    public void eliminar(String dni) {

        // booleano para controlar que se borra el empleado
        boolean control = false;
        if (Personal.validarDni(dni)) {
            if (empleados.isEmpty()) {
                System.out.println("La lista esta vacia");
            } else { // si la lista ya tiene informacion recorremos el array comparando DNI para ver si existe
                //iterador.
                Iterator<Personal> it = empleados.iterator();
                while (it.hasNext()) {
                    if (it.next().getDni().equalsIgnoreCase(dni)) {
                        System.out.println("empleado encontrado y borrado");
                        it.remove();
                        control = true;
                    }
                }
            }

            if (control == false) {
                System.out.println("Empleado no encontrado");
            }

        } else {
            System.out.println("EL dni no es valido");
        }

    }

    //metodo guardar fichero
    public void guardarFichero() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            //se le pasa la ruta del archivo
            fos = new FileOutputStream("fichero.dat");
            //se le pasa el fos como parametro
            oos = new ObjectOutputStream(fos);

            oos.writeObject(empleados);
            System.out.println("fichero guardado");
        } catch (IOException e) {
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                    fos.close();
                }
            } catch (IOException e) {
            }

        }

    }

    public void leer_fichero() {

        File archivo = new File("fichero.dat");
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            // comprueba que el archivo existe y si es asi carga la informacion en el array list.
            if (archivo.isFile()) {
                ois = new ObjectInputStream(fis = new FileInputStream(archivo));
                empleados = (LinkedList) ois.readObject();
                System.out.println("archivo " + archivo.getName() + " Cargado");

                // como luego pides se muestra por pantalla el listado.
                System.out.println("mostrando listado de empleados");
                if (empleados.isEmpty()) {
                    System.out.println("la lista esta vacia");
                } else {
                    for (Personal i : empleados) {
                        System.out.println(i.toString());
                    }
                }
            } else {
                System.out.println("El archivo " + archivo.getName() + " no existe, No se carga nada");
            }

        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException");
        } catch (IOException e) {
            System.err.println("IOException");
        } catch (ClassNotFoundException ex) {
            System.err.println("ClassNotFoundException");
        } finally {
            try {
                if (fis != null) {
                    ois.close();
                    fis.close();
                }
            } catch (IOException e) {
            }
        }
    }

}
