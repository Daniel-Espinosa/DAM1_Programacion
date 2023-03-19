
import java.io.*;


public class MetodosAlumno {
    
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
    
}
