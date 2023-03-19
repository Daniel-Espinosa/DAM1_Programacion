
package EjerciciosAd4_2;

public class Principal {


    public static void main(String[] args) {
        
        Cuenta c1 = new Cuenta("daniel", "numcuenta", 4.5, 1000);
        Cuenta c2 = new Cuenta("prueba", "asd2123", 3.5, 1500);
        
        System.out.println(c1.ingreso());
        System.out.println(c1.reintegro());
        
        System.out.println(c1.transferencia(c2, 1900));
        
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
    }
    
}
