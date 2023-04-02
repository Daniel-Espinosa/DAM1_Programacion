/*
Crear un proyecto Esfera, que almacene el radio, contenga 2 constructores, y
métodos para calcular el volumen y la superficie, además de un método para
imprimir la información de la esfera.
Además deberá contener un método main( ) para la prueba del programa.
Atributos
radio : almacena el valor del radio de la esfera
Constructores
Esfera(radio) : crea una esfera con radio pasado como parámetro
Esfera( ) : crea una esfera de radio 1.0
Métodos
volumen( ) : retorna el volumen de la esfera
superficie( ) : retorna la superficie de la esfera
imprimir( ) : imprime la información de la esfera
main( ) : Realiza las pruebas de la clase, creando objetos y aplicando los métodos.
Construye una esfera de radio 1 y halla sus características.
Construye una esfera de radio PI y halla sus características.
*/

package Ejercicio2;


public class Esfera {
    
    private double rad;
    
    //Constructores
    
    public Esfera(){
        rad = 1.0;
    }
    
    public Esfera(double rad){
        this.rad = rad;
        
    }
    
    
    // metodos
    public double volumen(){
         return (4*Math.PI*Math.pow(rad,3))/3;
        
    }
            
    
    public double superficie(){
        return 4*Math.PI*Math.pow(rad, 2);
        
    }
    

    public void imprimir(){
        System.out.println("El radio es: " + rad );
        System.out.println("El volumen es: " + volumen());
        System.out.println("La superficie es: " + superficie());
        
    }
    
}
