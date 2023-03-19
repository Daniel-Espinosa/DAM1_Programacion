/*
Crear un proyecto Circunferencia, que almacene el radio, contenga 2 constructores, y métodos para calcular el área y el perímetro.
Además deberá contener un método main( ) para la prueba del programa.
Atributos radio : almacena el valor del radio de la circunferencia
Constructores Circunferencia(r): crea una circunferencia con radio pasado como parámetro Circunferencia( ) : crea una circunferencia de radio 1.0
Métodos área (): retorna el área de la circunferencia
perímetro (): retorna el perímetro de la circunferencia
imprimir( ) : imprime la información de la circunferencia
main( ) : Realiza las pruebas de la clase
*/
package Ejercicio3;


public class Ejercicio3 {


    public static void main(String[] args) {
        
        Circunferencia circ1 = new Circunferencia();
        Circunferencia circ2 = new Circunferencia(2.5);
        
        System.out.println("Circunferencia 1:");
        circ1.imprimir();
        System.out.println("Circunferencia 2:");
        circ2.imprimir();
        
        
    }
    
}
