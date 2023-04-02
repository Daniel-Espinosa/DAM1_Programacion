
package EjerciciosAd4_3;


public class Principal {


    public static void main(String[] args) {
        Contador c1 = new Contador(-10);
        
        System.out.println(c1.getCont());
        for (int i = 0; i < 10; i++) {
            c1.incrementa();
            System.out.println(c1.getCont());
        }
        
        for (int i = 0; i < 20; i++) {
            c1.decrementa();
            
            System.out.println(c1.getCont());
        }
    }
    
}
