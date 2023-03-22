
import java.io.*;
import java.util.*;


public class Metodos_Alumnos {
    
    static  ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        
    public static void grabar_alumnos(){

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("alumnos.dat"));
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
    
    //public static void grabar_coleccion_en_fichero(): graba el arraylist en el fichero.
    public static void grabar_coleccion_en_fichero(){
            
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try {

            oos = new ObjectOutputStream(fos = new FileOutputStream("alumnos.dat"));
            oos.writeObject(listaAlumnos);

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
    public static void leer_coleccion_del_fichero(){
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try {
            
            ois = new ObjectInputStream(fis = new FileInputStream("alumnos.dat"));
            listaAlumnos = (ArrayList) ois.readObject();
            
        } catch (FileNotFoundException e) {
            System.err.println("IOException");
        } catch (IOException e){
            System.err.println("FileNotFoundException");
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
    public static void anadir_alumno(){
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nombre = "";
        Double calificacion = 0.0;
        Boolean control = true;
        try {
            do {
                System.out.println("Introduce un nombre");
                nombre = br.readLine();
                if (nombre == "") {
                    System.out.println("introduce un nombre");
                } else {
                    control = false;
                }                
            } while (control);
        } catch (Exception e) {
            System.err.println("Exception");
        }
            
            control = true;
        
        try {
            
            do {
                System.out.println("Introduce una calificacion para " + nombre);
                calificacion = Double.parseDouble(br.readLine());
                control = false;
            } while (control);
            
        } catch (NumberFormatException e) {
            System.err.println("Introduce una calificacion correcta");
        } catch (Exception e) {
            System.err.println("Exception"); 
        }
        Alumno alum = new Alumno(nombre, calificacion);
        listaAlumnos.add(alum);
    }
    
    /*public static void listar_alumnos(): recorre el arraylist con un bucle for, 
    un bucle foreach, o un iterador, imprimiendo cada objeto Alumno contenido en el ArrayList.*/
    public static void listar_alumnos(){
        if (!listaAlumnos.isEmpty()) {
            for (Alumno i: listaAlumnos) {
                System.out.println(i.toString());
            }
        } else {
            System.out.println("no tienes alumnos en el listado");
        }
    }
    
    /*buscar_alumno() que permita buscar un alumno concreto (por nombre). No es
    necesario leer nada del fichero, se recorre el arraylist buscando.*/
    
    public void buscar_alumno(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nombre = "";
        try {
            do {
                System.out.println("Introduce un nombre para buscar:");
                nombre = br.readLine();
            } while ("".equals(nombre));

            for (Alumno i : listaAlumnos) {
                if (nombre.equalsIgnoreCase(i.getNombre())) {
                    System.out.println(i.toString());
                }
            }
        } catch (IOException e) {
            System.err.println("IOException");
        }

        
        
    }
    
    
}
