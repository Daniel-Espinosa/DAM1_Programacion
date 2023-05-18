
package ejemplo2;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import ejemplo1.Estudiante;


public class Ejemplo2 {

    
    public static void main(String[] args) {
       
        ObjectContainer bd = Db4oEmbedded.openFile("Ejemplo");

        bd.store(new Estudiante("Pedro", 6));
        bd.store(new Estudiante("Nuria", 7));
        bd.store(new Estudiante("Luis", 4));
        bd.store(new Estudiante("Pedro", 6));

        Estudiante e1 = new Estudiante(null,0);
        ObjectSet os = bd.queryByExample(e1);
        while(os.hasNext()){
            e1=(Estudiante) os.next();
            e1.info();
        }

        bd.close();
        
    }
    
}
