
package mini.juego;

import java.util.Arrays;

/**
 *
 * @author produccion
 */
public class Cartas {
    
    private static String baraja[] = new String[52];
    private static int valorCartas[] = new int[52];
    private static String palos[] = {"\u2665","\u2660","\u2666","\u2663"};
    //private static String palos[] = {"Corazones","Picas","Diamante","Trebol"}
    
    public static void asignarValores(){
        
        int posBaraja=0;
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < 13; j++) {
                if (j==10) {
                    valorCartas[posBaraja] = 10;
                    baraja[posBaraja] = "J" + "" + palos[i];
                    //baraja[posBaraja] = "J" + " " + palos[i];
                    posBaraja++;
                }else if (j==11) {
                    valorCartas[posBaraja] = 10;
                    baraja[posBaraja] = "Q" + "" + palos[i];
                    //baraja[posBaraja] = "Q" + " " + palos[i];
                    posBaraja++;   
                }else if (j==12) {
                    valorCartas[posBaraja] = 10;
                    baraja[posBaraja] = "K" + "" + palos[i];
                    //baraja[posBaraja] = "K" + " " + palos[i];
                    posBaraja++;
                }else if (j==0){
                    valorCartas[posBaraja] = 1;
                    baraja[posBaraja] = "AS" + "" + palos[i];
                    //baraja[posBaraja] = "AS" + " " + palos[i];
                    posBaraja++;
                } else{
                    valorCartas[posBaraja] = (j+1);
                    baraja[posBaraja] = (j+1) + "" + palos[i];
                    //baraja[posBaraja] = (j+1) + " " + palos[i];
                    posBaraja++;
                }
            }
        }
       
        //System.out.println(Arrays.toString(baraja));
        //System.out.println(Arrays.toString(valorCartas));
    }
    
    public static void queCartaEs(int a){
        //return baraja[a];
        System.out.print(baraja[a]+ " ");
        
    }
    
    public static int valorCarta(int a){
        return valorCartas[a];
    }
    
}
