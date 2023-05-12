
public class Principal {

    public static void main(String[] args) {
        
        Gestion listado = new Gestion();
        
        listado.inserta_empleado("1234", 100);
        listado.inserta_empleado("2345", 200);
        listado.inserta_empleado("3456", 300);
        listado.inserta_empleado("4567", 400);
        listado.inserta_empleado("5678", 500);

        listado.lista_empleados();
        
        listado.borrar_empleado("2345");

        listado.lista_empleados();
    }
    
}
