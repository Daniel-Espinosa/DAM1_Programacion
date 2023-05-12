
import java.util.ArrayList;
import java.util.Iterator;


public class Gestion {

    private ArrayList <Personal> lista;

    public Gestion() {
        lista = new ArrayList<>();
    }
    
    // metodo
    public void inserta_empleado(String dni, int salario){
        Personal persona = new Personal(dni, salario);
        //System.out.println(dni + salario);
        boolean control = false;
        
        if (lista.size()==0) {
            lista.add(persona); 
        }else {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getDni().equals(dni)) {
                
                control = true;
                } else{
                    control = false;
                }
            } 
            if (control == false) {
                lista.add(persona);
            }
        }
        
    }
    
    
    public void borrar_empleado(String dni){
        boolean control = false;
        int borrar = -1;
        for (Personal i : lista) {
            if (i.getDni().equals(dni)) {
                control = true;
                borrar = (lista.indexOf(i));

            }
        }
        if (control == false) {
            System.out.println("personal no encontrado");
        } else{
                lista.remove(borrar);
                System.out.println("personal borrado");
        }
    }
    
    public void lista_empleados(){
            Iterator <Personal> it = lista.iterator();
            while (it.hasNext()) {
                System.out.println(it.next().toString());
            
        }
        
    }
    
    
}
