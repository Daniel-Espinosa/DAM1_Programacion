package EJ7;

import java.io.*;

/*
➢ Un método grabar_alumnos() que permita grabar tres alumnos en un fichero.
➢ Un método listar_alumnos() que permita ver el listado completo de alumnos grabados.
➢ Un método borrar_fichero() que borre la existencia del fichero creado.
➢ Un método renombrar_fichero() que permita cambiar de nombre un fichero ya
existente. 
*/

public class MetodosAlumnos {
    
    public static void grabar_alumno(){
        Alumno array[] = new Alumno[3];
        int contador = 0;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try {
            fos = new FileOutputStream("alumnos.dat");
            oos = new ObjectOutputStream(fos);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            do {
                boolean control = true;
                String nombre = "";
                double calificacion = 0;
                // pedir nombre
                do {                    
                    try {
                        System.out.println("Dame el nombre del " + (contador +1 )+ "º alumno");
                        nombre = br.readLine();
                        control = false;
                    } catch (IOException e) {
                        System.err.println("IOEXception");
                    } catch (Exception e) {
                        System.err.println("Exception");
                    }
                } while (control);
                    
                control = true;
                
                // pedir calificacion
                do {                    
                    try {
                        System.out.println("Dame la calificacion de " + nombre);
                        calificacion = Double.parseDouble(br.readLine());
                        control = false;
                    } catch (IOException e) {
                        System.err.println("IOEXception");
                    } catch (NumberFormatException e) {
                        System.err.println("Numbre Format Exception");
                    } catch (Exception e){
                        System.err.println("Exception");
                    }
                } while (control);
                
                array[contador] = new Alumno(nombre, calificacion);
                
                contador++;
            } while (contador<3);
            
            for (int i = 0; i < array.length; i++) {
                oos.writeObject(array[i]);
            }
            
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ARRAY FUERA DE LIMITE");
        } catch (FileNotFoundException e) {
            System.err.println("File NOT FOuND");
        } catch (IOException e) {
            System.err.println("IOEXception");
        } catch (Exception e){
            System.err.println("Exception");
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                    oos.close();
                }
            } catch (IOException e) {
                System.err.println("IOException");
            }
        }

    }
    
    public static void listar_alumnos(){

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try {
            fis = new FileInputStream("alumnos.dat");
            ois = new ObjectInputStream(fis);
            
            while (fis.available()>0) {
                Alumno alum = (Alumno)ois.readObject();
                System.out.println(alum.toString());
                
            }
            
        } catch (IOException e) {
            System.err.println("as");
        } catch (ClassNotFoundException e) {
            System.err.println("asd");
        } finally{
            try {
                if (fis != null) {
                    fis.close();
                    ois.close();
                }
            } catch (IOException e) {
            }
        }
        
    }
    
    public static void borrar_fichero(){
        File archivo = new File("alumnos.dat");
        if (archivo.delete()) {
            System.out.println("borrado");
        } else {
            System.out.println("no borrado");
        } 
    }
    
    public static void renombrar_fichero(){
        File archivo = new File("alumno.dat");
        try {
            if (archivo.exists()) {
            File archivo2 = new File("alumno2.dat");
            archivo2.createNewFile();
            archivo2 = archivo;
            
        }
            
        } catch (IOException e) {
        }
        
        
        
    }
}
