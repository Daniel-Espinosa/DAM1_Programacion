/*
 
*/
package EJ1;


public class Prog03_Ejerc1 {


    public static void main(String[] args) {
        
       Fecha objFecha1 = new Fecha(2); 
       Fecha objFecha2 = new Fecha(15,6,2015);
       
       objFecha1.setDia(20);
       objFecha1.setAnio(2000);
       System.out.println("Primera fecha, inicializada con el primer constructor");
       System.out.println(objFecha1.toString());
        if (objFecha1.esVerano()==true) {
            System.out.println("Es verano");
        } else {
            System.out.println("No es Verano");     
        }
       
       
        System.out.println("Segunda fecha, inicializada con el segundo constructor");
        System.out.println("La fecha 2 contiene el año " + objFecha2.getAnio());
        System.out.println(objFecha2.toString());
        if (objFecha2.esVerano()==true) {
            System.out.println("Es verano");
        } else {
            System.out.println("No es Verano");     
        }
       
       
        
        
        
    }
    
}
