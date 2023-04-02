/*
1.- Definir un array de 10 posiciones de tipo entero y realizar las siguientes operaciones:
• Inicializar todas las posiciones del array a -2 a la hora de definirlo.
• Utilizando un FOR:
o Inicializar todas las posiciones a valor -1. Visualizar el resultado.
o Inicializar cada posición con un valor distinto. Visualizar el resultado.*/
package ejercicios1_09;


public class Ej1 {

    public static void main(String[] args) {
        
        int array[] = new int[]{-2,-2,-2,-2,-2,-2,-2,-2,-2,-2};
        for (int i : array) {
            i = -1;
            System.out.println(i);
        }
        
        for (int i : array) {
            i = (int)(Math.random()*10);
            System.out.println(i);
        }
        
        
        
    }
    
}
