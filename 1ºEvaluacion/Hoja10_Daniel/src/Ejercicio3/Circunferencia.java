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




public class Circunferencia {
    
    private double rad;
    
    //constructores:
    public Circunferencia(double rad){
        this.rad = rad;
    }
    
    public Circunferencia(){
        rad = 1.0;
        
    }
            
    //metodos:
    public double area(){
        return (Math.PI*Math.pow(rad,2));
    }
    
    public double perimetro(){
        return (2*Math.PI*rad);
    }
    
    public void imprimir(){
        System.out.println("El radio es: " + rad);
        System.out.println("El area es: " + area());
        System.out.println("El perimetro es: " + perimetro());
    }
}
