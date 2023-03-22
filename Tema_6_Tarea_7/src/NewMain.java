
import java.util.ArrayList;

public class NewMain {

    public static void main(String[] args) {
        
        ArrayList <Alumno> lista = new ArrayList<>();
        
        System.out.println(lista.size());
        
        Alumno a1 = new Alumno("daniel", 4.5);
        Alumno a2 = new Alumno("daniel", 4.5);
     
        lista.add(a1);
        lista.add(a2);
        
        System.out.println(lista.size());
        
    }
    
}
