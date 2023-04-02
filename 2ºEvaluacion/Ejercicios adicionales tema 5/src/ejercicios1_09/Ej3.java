/*
3.- Programa que indique la posición del array donde se encuentra un número dado por
teclado. En caso de no encontrarlo, visualizar el mensaje “Número no encontrado”. Por
ejemplo, crear un array con 10 elementos del 1 al 10, preguntar por el número y si el
número introducido está comprendido entre 1 y 10 lo encuentra e indica la posición.*/
package ejercicios1_09;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        int array[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        int pos = -1;
        int valor = 0;
        
        System.out.println("de que numero quieres saber la posicion");
        Scanner sc = new Scanner(System.in);
        valor = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i]==valor) {
                pos=i;
            }
        }
        

        if (pos >= 0) {
            System.out.println("la posicion es " + pos);
        } else {
            System.out.println("el numero no se encuentra");
        }



    }
    
}
