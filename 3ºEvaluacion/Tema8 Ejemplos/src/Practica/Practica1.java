/*
Clase Principal:
- Añade 20 estudiantes una base de datos orientada a objetos con notas
aleatorias entre 0 y 10 (ambos incluidos). Debes incluir al menos 4 nombres
repetidos.
- Consulta todos los estudiantes con el primer nombre.
- Consulta todos los estudiantes con el segundo nombre.
- Consulta todos los estudiantes con nota de 0.
- Consulta todos los estudiantes con nota de 7.
- Consulta todos los estudiantes aprobados.
- Consulta todos los estudiantes suspensos.*/
package Practica;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.io.File;

public class Practica1 {

    public static void main(String[] args) {
        
        File fichero = new File("Ejemplo");
        fichero.delete();
        
        String[] nombre = {"Daniel","Ramiro","Carmen","Albano","Javier","Marcos"};
        
        ObjectContainer bd = Db4oEmbedded.openFile("Ejemplo");
        
        
        System.out.println("lista de todos los alumnos");
        for (int i = 0; i < 20; i++) {
            String dni = "DNI" + (int) (Math.random() * 90000+10000);
            Estu e = new Estu(nombre[((int) (Math.random()*6))], dni, ((int) (Math.random()*11)));
            System.out.println(e.toString());
            bd.store(e);
        }
     
        System.out.println("");
        System.out.println("Consulta todos los estudiantes con el primer nombre DANIEL");
        
        Estu e1 = new Estu("Daniel",null,0);
        ObjectSet os = bd.queryByExample(e1);
        while(os.hasNext()){
            e1=(Estu) os.next();
            System.out.println(e1.toString());;
        }
        
        System.out.println("");
        System.out.println("Consulta todos los estudiantes con el segundo nombre. RAMIRO");
        
        Estu e2 = new Estu("Ramiro",null,0);
        ObjectSet os2 = bd.queryByExample(e2);
        while(os2.hasNext()){
            e2=(Estu) os2.next();
            System.out.println(e2.toString());;
        }
        
        
        System.out.println("");
        System.out.println("Consulta todos los estudiantes con nota de 0");
        
        Estu e3 = new Estu(null,null,0);
        ObjectSet os3 = bd.queryByExample(e3);
        while(os3.hasNext()){
            e3=(Estu) os3.next();
            if (e3.getNota() == 0) {
               System.out.println(e3.toString());
            }
        }
        
        
                System.out.println("");
        System.out.println("Consulta todos los estudiantes con nota de 7");
        
        Estu e4 = new Estu(null,null,7);
        ObjectSet os4 = bd.queryByExample(e4);
        while(os4.hasNext()){
            e4=(Estu) os4.next();
          
               System.out.println(e4.toString());

        }
        
        System.out.println("");
        System.out.println("Consulta todos los estudiantes aprobados.");
        
        Estu e5 = new Estu(null,null,0);
        ObjectSet os5 = bd.queryByExample(e5);
        while(os5.hasNext()){
            e5=(Estu) os5.next();
            if (e5.getNota() >= 5) {
               System.out.println(e5.toString());
            }
        }
        
        System.out.println("");
        System.out.println("Consulta todos los estudiantes Suspensos.");
        
        Estu e6 = new Estu(null,null,0);
        ObjectSet os6 = bd.queryByExample(e6);
        while(os6.hasNext()){
            e6=(Estu) os6.next();
            if (e6.getNota() < 5) {
               System.out.println(e6.toString());
            }
        }
        
        
        bd.close();
    }
    
}
