
package EjerciciosAd4_1;


public class Principal {


    public static void main(String[] args) {
        
        Libro lib= new Libro("Libro1", "Daniel", 5, 0);
        
        System.out.println(lib.toString());
        
        System.out.println(lib.prestamo());
        System.out.println(lib.prestamo());
        System.out.println(lib.prestamo());
        System.out.println(lib.prestamo());
        System.out.println(lib.prestamo());
        System.out.println(lib.prestamo());
        System.out.println("ya no puede prestar mas!");
        System.out.println(lib.ejemplares);
        System.out.println(lib.devolucion());
        System.out.println(lib.devolucion());
        System.out.println(lib.devolucion());
        System.out.println(lib.devolucion());
        System.out.println(lib.devolucion());
        System.out.println(lib.devolucion());
        System.out.println("ya no puede devolver mas");
        System.out.println(lib.prestados);
    }
    
    
    
}
