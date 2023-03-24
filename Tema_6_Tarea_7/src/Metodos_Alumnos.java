
import java.io.*;
import java.util.*;

public class Metodos_Alumnos {

    public static ArrayList<Alumno> array_alumnos = new ArrayList<>();
    public static File archivo;

    //Metodo Extra para fijar el nombre del Fichero con el que se va a trabajar.
    public static void nombre_archivo() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nombreArchivo = "";

        try {
            do {
                System.out.println("Introduce el nombre del archivo con el que se va a trabajar");
                System.out.println("(no es necesario introducir la extencion)");
                nombreArchivo = br.readLine();
            } while (nombreArchivo == "");
            archivo = new File(nombreArchivo + ".dat");
        } catch (IOException e) {
        }
    }

    //public static void grabar_coleccion_en_fichero(): graba el arraylist en el fichero.
    public static void grabar_coleccion_en_fichero() {

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {

            oos = new ObjectOutputStream(fos = new FileOutputStream(archivo));
            oos.writeObject(array_alumnos);

        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException");
        } catch (IOException e) {
            System.err.println("IOException");
        } finally {
            try {
                if (fos != null) {
                    oos.close();
                    fos.close();
                }
            } catch (IOException e) {
                System.err.println("IOException");
            }

        }

    }

    /* public static void leer_coleccion_del_fichero(): permite cargar el arraylist leyendo del
    fichero un solo objeto, haciendo el casting al tipo (ArrayList).*/
    public static void leer_coleccion_del_fichero() {

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            // comprueba que el archivo existe y si es asi carga la informacion en el array list.
            if (archivo.isFile()) {
                ois = new ObjectInputStream(fis = new FileInputStream(archivo));
                array_alumnos = (ArrayList) ois.readObject();
                System.out.println("archivo " + archivo.getName() + " Cargado");
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

    /* public static void anadir_alumno(): permite almacenar un objeto de tipo Alumno en el arraylist. */
    public static void anadir_alumno() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nombre = "";
        Double calificacion = -1.0;
        boolean control = true;

        // comprueba que el nombre introducido sea distinto de vacio
        do {
            try {

                System.out.println("Introduce un nombre");
                nombre = br.readLine();
                if ("".equals(nombre)) {
                    System.out.println("Introduce un nombre no puede estar vacio");
                }

            } catch (Exception e) {
                System.err.println("Exception");
            }
        } while ("".equals(nombre));
        // comprueba que la calificacion itroducida sea en el formato correcto y >= 0
        do {
            try {

                System.out.println("Introduce una calificacion para " + nombre);
                calificacion = Double.parseDouble(br.readLine());
                if (calificacion < 0 || calificacion > 10) {
                    System.out.println("introduce una calificacion valida entre 0 y 10");
                    calificacion = -1.0;
                }

            } catch (NumberFormatException e) {
                System.err.println("Introduce una calificacion correcta");
            } catch (Exception e) {
                System.err.println("Exception");
            }
        } while (calificacion < 0 || calificacion > 10);
        // si todo es correcto se añade el alumno al array list
        Alumno alum = new Alumno(nombre, calificacion);
        array_alumnos.add(alum);
    }

    /*public static void listar_alumnos(): recorre el arraylist con un bucle for, 
    un bucle foreach, o un iterador, imprimiendo cada objeto Alumno contenido en el ArrayList.*/
    public static void listar_alumnos() {
        if (!array_alumnos.isEmpty()) {
            for (Alumno i : array_alumnos) {
                System.out.println(i.toString());
            }
        } else {
            System.out.println("no tienes alumnos en el listado");
        }
    }

    /*buscar_alumno() que permita buscar un alumno concreto (por nombre). No es
    necesario leer nada del fichero, se recorre el arraylist buscando.*/
    public static void buscar_alumno() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nombre = "";
        boolean control = false;
        // si no hay alumnos en el array devuelve un mensaje de que esta vacio
        if (array_alumnos.isEmpty()) {
            System.out.println("La lista esta vacia, no se puede buscar un alumno");
        } else {
            try {
                //se requiere introducir un nombre
                do {
                    System.out.println("Introduce un nombre para buscar:");
                    nombre = br.readLine();
                    if ("".equals(nombre)) {
                        System.out.println("introduce un nombre, no puede estar vacio");
                    }
                } while ("".equals(nombre));

                //se recorre el array buscando coincidencia con el nombre Ignorando Case
                for (Alumno i : array_alumnos) {
                    if (nombre.equalsIgnoreCase(i.getNombre())) {
                        System.out.println(i.toString());
                        control = true;
                    }
                }

                if (control == false) {
                    System.out.println("Alumno no encontrado");
                }
            } catch (IOException e) {
                System.err.println("IOException");
            }
        }
    }

    /*borrar_alumno() que permita borrar un alumno concreto preguntando antes todos los
    datos del mismo. No es necesario leer nada del fichero, se recorre el arraylist
    buscando. Una vez encontrado se borra el objeto concreto con los métodos de
    ArrayList.*/
    public static void borrar_alumno() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nombre = "";
        Double calificacion = -1.0;

        // si no hay alumnos en el array no se puede borrar y da error.
        if (array_alumnos.isEmpty()) {
            System.out.println("Aun no tienes alumnos en el listado, no puedes borrar");
        } else {
            try {
                //Se obliga a introducir un nombre , no puede estar vacio.
                do {
                    System.out.println("Introduce el nombre del Alumno que deseas borrar:");
                    nombre = br.readLine();
                    if ("".equals(nombre)) {
                        System.out.println("tienes que introducir un nombre");
                    }
                } while ("".equals(nombre));
            } catch (IOException e) {
                System.err.println("IOException");
            }
            
            do {
                try {
                    // comprueba que la calificacion itroducida sea en el formato correcto y >= 0

                    System.out.println("Introduce la calificacion de " + nombre + " para borrarlo");
                    calificacion = Double.parseDouble(br.readLine());
                    if (calificacion < 0 || calificacion > 10) {
                        System.out.println("introduce una calificacion valida entre 0 y 10");
                    }

                } catch (NumberFormatException e) {
                    System.err.println("Introduce un numero");
                } catch (IOException e) {
                    System.err.println("IOException");
                }
            } while (calificacion < 0 || calificacion > 10);
            
            // Boolean de control para controlar si se borra o no un alumno y poder imprimir mensaje
            boolean controlBorrado = false;
            for (int i = 0; i < array_alumnos.size(); i++) {
                String nombreAux = array_alumnos.get(i).getNombre();
                Double calificacionAux = array_alumnos.get(i).getCalificacion();
                if (nombre.equalsIgnoreCase(nombreAux) && calificacion.equals(calificacionAux)) {
                    System.out.println("BORRADO: " + array_alumnos.get(i).toString());
                    array_alumnos.remove(i);
                    controlBorrado = true;
                }
            }

            // mensaje si no se borra ningun Alumno
            if (controlBorrado == false) {
                System.out.println("Alumno: " + nombre + " Calificacion: " + calificacion + " NO ENCONTRADO");
            }

        }

    }

    //borrarFichero() que borre la existencia del fichero creado.
    public static void borrarFichero() {
        // comprueba que el archivo existe 
        if (archivo.isFile()) {
            System.out.println("Fichero " + archivo.getName() + " borrado");
            archivo.delete();
        } else {
            System.out.println("El ficher no existe");
        }
    }

    //renombrar_fichero() que permita cambiar de nombre un fichero ya existente.
    public static void renombrar_fichero() {
        File renombraArchivo = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nombreArchivo = "";
        //Comprobar que el archivo existe
        if (archivo.isFile() ) {
            try {
                do {
                    System.out.println("Introduce el nuevo nombre para el fichero");
                    System.out.println("(no es necesario introducir la extencion)");
                    nombreArchivo = br.readLine();
                } while (nombreArchivo == "");
                // dando nombre al nuevo archivo.
                renombraArchivo = new File(nombreArchivo + ".dat");
                //renombrando el archivo cambio el nombre por el nuevo.
                archivo.renameTo(renombraArchivo);
                //modifico la informacion de la Variable File Archivo
                archivo = renombraArchivo;
            } catch (IOException e) {
                System.err.println("IOException");
            }
        } else {
            System.out.println("El ficher " + archivo.getName() + " no existe, no se puede renombrar");
        }

    }

    // CREO UN METODO PARA ESTA FUNCION QUE PIDE EN EL MAIN
    //4. Hacer la media de los aprobados, de los suspensos y de todos
    public static void media_notas() {
        //comprobar si tenemos informacion en el array de alumnos sino avisa que no se hace nada
        int contaAprobado = 0, contaSuspensos = 0;
        double sumaAprobados = 0, sumaSuspensos = 0;
        if (array_alumnos.isEmpty()) {
            System.out.println("no tienes alumnos almacenados, no se hace nada");
        } else {
            //sumo los Aprobados y los Suspensos y llevo la cuenta de ambos.
            for (Alumno i : array_alumnos) {
                if (i.getCalificacion() >= 5) {
                    contaAprobado++;
                    sumaAprobados += i.getCalificacion();
                } else if (i.getCalificacion() < 5) {
                    contaSuspensos++;
                    sumaSuspensos += i.getCalificacion();
                }
            }

            //imprimimos por pantalla las notas medias de aprobados si las hubiera.
            if (contaAprobado > 0) {
                System.out.println("La media de las notas de los " + contaAprobado + " alumno/s aprobados es");
                System.out.println(sumaAprobados / contaAprobado);
            } else {
                System.out.println("* No hay alumnos aprobados para hacer la media");
            }
            //imprimimos por pantalla las notas medias de suspensos si las hubiera.
            if (contaSuspensos > 0) {
                System.out.println("La media de las notas de los " + contaSuspensos + " alumno/s suspensos es");
                System.out.println(sumaSuspensos / contaSuspensos);
            } else {
                System.out.println("* No hay alumnos suspensos para hacer la media");
            }

            // imprimimos la media de todas las notas ;)
            if (contaAprobado > 0 && contaSuspensos > 0) {
                System.out.println("La media de las notas de los " + (contaAprobado + contaSuspensos) + " alumno/s suspensos es");
                System.out.println((sumaAprobados + sumaSuspensos) / (contaAprobado + contaSuspensos));
            } else {
                System.out.println("* Para hacer la media de los suspensos y aprobados es necesario al menos 1 en cada grupo");
                System.out.println("como no se cumple la condicion no es necesario realizarla");
            }
        }
    }

    // CREO UN METODO PARA ESTA FUNCION QUE PIDE EN EL MAIN
    //6. Modificar la nota de un alumno concreto
    public static void modificar_nota() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nombre = "";
        double calificacion = -1.0;

        if (array_alumnos.isEmpty()) {
            System.out.println("no tienes alumnos almacenados, no se hace nada");
        } else {
            // introducir un nombre
            try {
                do {
                    System.out.println("Introduce un nombre para buscar y modificar la calificacion");
                    nombre = br.readLine();
                } while (nombre == "");
            } catch (IOException e) {
            }

            //recorre el array buscando coincidencias con el nombre ignorando Case (puede existir mas de uno)
            for (Alumno i : array_alumnos) {
                if (i.getNombre().equalsIgnoreCase(nombre)) {
                    // imprime por pantalla los datos del alumno encontrado
                    System.out.println("Encontrado alumno " + i.toString());
                    String opcion = "";
                    // si encuentra una coincidencia con el nombre pregunta si desea cambiar la calificacion
                    do {
                        try {
                            System.out.println("Quieres modificar la nota S/N");
                            opcion = br.readLine();
                            if (!"s".equalsIgnoreCase(opcion) && !"n".equalsIgnoreCase(opcion)) {
                                System.out.println("introduce una opcion valida");
                            }
                        } catch (IOException e) {
                        }
                    } while (!"s".equalsIgnoreCase(opcion) && !"n".equalsIgnoreCase(opcion));

                    // si la opcion es que si modificara la calificacion del alumno se comprueba que esta sea correcta
                    if ("S".equalsIgnoreCase(opcion)) {
                        do {
                            try {
                                System.out.println("Introduce la nueva calificacion para " + i.getNombre());
                                calificacion = Double.parseDouble(br.readLine());
                                if (calificacion < 0 || calificacion > 10) {
                                    System.out.println("introduce una calificacion valida entre 0 y 10");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Introduce un valor para la calificacion");
                            } catch (IOException e) {
                            }
                        } while (calificacion < 0 || calificacion > 10);
                        // si todo es correcto se modifica la calificacion
                        i.setCalificacion(calificacion);
                        System.out.println("Calificacion modificada");
                        System.out.println(i.toString());

                    }
                }
            }
        }
    }

    //CREO UN METODO PARA ESTA FUNCION QUE PIDE EN EL MAIN
    //3. Mostar todos los alumnos en orden alfabético
    //7. Mostar todos los alumnos en orden alfabético
    public static void listar_orden_alfabetico() {
        LinkedList<String> listaNombres = new LinkedList<>();
        if (array_alumnos.isEmpty()) {
            System.out.println("La lista no contiene nada no se puede mostrar");
        } else {
            for (Alumno i : array_alumnos) {
                listaNombres.add(i.getNombre());
            }
            //ordena la coleccion
            Collections.sort(listaNombres);

            System.out.println("listado de alumnos ordenados alfabeticamente");
            for (String i : listaNombres) {
                System.out.println(i);
            }
        }
    }

    // METODOS IMPORTADOS AL COPIAR LA CLASE METODOS ALUMNOS COMO PIDE EN EL ENUNCIADO
    // ESTOS METODOS CARECEN DE SENTIDO EN ESTE EJERCICIO YA QUE SE IMPLEMENTAN NUEVOS METODOS PARA LO MISMO.
    // Este metodo queda obsoleto ya que se crea un nuevo metodo de añadir alumno
    /*
    public static void grabar_alumnos(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(archivo));
            int cont = 0;
            Alumno array[] = new Alumno[3];
            boolean control = true;
            do {
                String nombre = "";
                double calificacion =0;
                // pedir nombre;
                try {
                    do {
                        System.out.println("introduce el nombre del " + (cont+1) +"º alumno");
                        nombre = br.readLine();
                        control = false;
                    } while (control);
                } catch (IOException e) {
                    System.err.println("IOException");
                } catch (Exception e) {
                    System.err.println("Exception");
                }
                
                // resetea el control a true hasta que se introdusca una calificacion correcta
                control = true;
                
                // pedir calificacion
                try {
                    do {
                        System.out.println("Introduce la calificacion de " + nombre);
                        calificacion = Double.parseDouble(br.readLine());
                        control = false;
                    } while (control);
                } catch (NumberFormatException e) {
                    System.err.println("Introduce un numero correctamente");
                } catch (IOException e) {
                    System.err.println("IOException");
                } catch (Exception e) {
                    System.err.println("Exception");
                }
                
                // almaceno en el array el alumno si todo es correcto
                array[cont]= new Alumno(nombre, calificacion);
                // sumo uno al contador para llevar la cuenta;
                cont++;   
            } while (cont<3);
            
            //al tener los 3 alumnos dentro del array podemos escribir el archivo con los datos de los alumnos;
            for (Alumno i : array) {
               output.writeObject(i); 
            }
            
        } catch (IOException e) {
        } catch (Exception e) {
        }  
    }
     */
    // este metodo queda Obsoleto ya que luestra los alumnos directamente desde el archivo.dat...
    /*
    // metodo mostrar alumnos 
    public static void mostrar_alumnos(){
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("alumnos.dat"));
            System.out.println(input.available());
            for (int i = 0; i < input.available(); i++) {
                Alumno alum = (Alumno) input.readObject();
                System.out.println(alum.toString());
            }   
        } catch (IOException e) {
            System.err.println("IOException");
        } catch (Exception e){
            System.err.println("Exception");
        } 
    }
     */
}
