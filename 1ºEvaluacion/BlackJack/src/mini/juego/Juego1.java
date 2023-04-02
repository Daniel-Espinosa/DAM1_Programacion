/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.juego;

import java.util.Scanner;

/**
 *
 * @author produccion
 */
public class Juego1 {
    
    public static void JuegoPalabras() {
    //Array donde metemos una serie de palabras para nuestro juego
	String[] palabras={"java", "css", "html"};
		
	//Elegimos una palabra aleatoria
	int aleatorio = (int) (Math.random() * palabras.length);
	String palabraOculta=palabras[aleatorio];
		
	//Array con los guiones bajos
	String palabra="";
	for (int i = 0; i < palabraOculta.length(); i++) {
            palabra += "_ ";
	}
		
	//Creamos el scanner junto a una pequeÃ±a introduccion del juego
	Scanner scanner=new Scanner(System.in);
        System.out.println("Este juego contiene distintas palabras relacionadas con la informatica");
        System.out.println("Se trata de ir escribiendo letras hasta completar la palabra oculta");
        System.out.println("Tienes 5 vidas en total, con cada fallo te resta 1 vida");
		
	//Declaramos una variable que cuente las vidas que tenemos
	int vidas=5;
	
        //While que mientras tengamos vidas, nos va pidiendo letras para rellenar los distintos huecos de la palabra oculta
	while (vidas > 0 && palabra.contains("_")) {
            System.out.println("\nLa palabra: " +palabra);
            System.out.println("Introduce una letra: ");
            String letra=scanner.next().toLowerCase();
			
            //Comprobamos si la letra estÃ¡ en la palabra
            if (palabraOculta.contains(letra)) {
                //Recorremos la palabra para reemplazar los guiones
                String nuevoAdivinar = "";
                //For que cambia los guiones por las letras que hemos adivinado
                for (int i = 0; i < palabraOculta.length(); i++) {
                    if (palabraOculta.charAt(i) == letra.charAt(0)) {
                        nuevoAdivinar += letra +" ";
                    } else {
                        nuevoAdivinar += palabra.charAt(i*2)+" ";
                    }
                }
            palabra=nuevoAdivinar;
            //Si fallamos una letra nos va quitando vidad hasta quedarnos con 0
            } else {
                vidas--;
                System.out.println("Has fallado, te quedan "+vidas+"vidas");
            }
        }
        
        
        System.out.println(palabra+"XX");
        palabra = palabra.replaceAll("\\s+", "");
        System.out.println(palabra+"XXRepair");
        System.out.println(palabraOculta+"xx");
        //Comprobamos si ha ganado
        if (palabra!=palabraOculta) {
            System.out.println("\nHas ganado, la palabra era: " +palabraOculta);
        } else {
            System.out.println("\nHas perdido, la palabra era: " +palabraOculta);
        }
        if (palabra.equals(palabraOculta)) {
            System.out.println("ahora si comprueba bien");
        }
        
    }
    
}
