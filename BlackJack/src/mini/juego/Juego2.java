
package mini.juego;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Juego2 {
 
    public static void blackJack (){
         
        String continuar = "S";
        Scanner lectString = new Scanner (System.in);
        int win = 0, lose = 0;
        
        System.out.println("\nBLACKJACK\n");
        System.out.println("REGLAS:");
        System.out.println("El objetivo del juego es llegar a 21 sin pasarse");
        System.out.println("El que más se acerque a 21 gana");
        System.out.println("En caso de empate gana la casa");
        System.out.println("Los Ases pueden tener dos valores de 1 o 11 como mejor convenga en cada momento");
        System.out.println("Las figuras J Q K tiene un valor de 10");
        System.out.println("\nDESARROLLO DEL JUEGO:");
        System.out.println("Se repartirán dos cartas a la Casa la primera carta es visible y la segunda no");
        System.out.println("Se repartirán dos cartas al Jugador ambas cartas son visibles");
        System.out.println("Si el jugador tiene 21 en la mano inicial gana, salvo que la casa tambien tenga 21");
        System.out.println("Empieza el turno del Jugador, tendrá que decidir entre pedir carta o plantarse");
        System.out.println("Podrá pedir tantas cartas como quiera");
        System.out.println("Cuando el Jugador se planta o pierde empieza el turno de la Casa");
        System.out.println("La casa mostrara su mano y decidirá si pide cartas o se planta");
        System.out.println("Del mismo modo que el Jugador");
        System.out.println("El que tenga la mejor mano gana, recuerda en caso de empate la casa gana");
        
        System.out.println("\nEmpieza la Partida\n");
        
        System.out.println("-----------------------");
        
        do {
            
            int contBaraja = 0;
            int contCasa = 0;
            int contJugador = 0;
            int manoCasa = 0;
            int manoJugador = 0;
            int contAses = 0;
            Integer[] baraja = new Integer[52];
            int[] casa = new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
            int[] jugador = new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
            String pedir;
            boolean blackJackInicial = false;
            
            Cartas.asignarValores();
            
            //se llena el array del 0 al 51 con los numeros 1 al 52 para saber donde estan las cartas
            for (int i = 0; i < baraja.length; i++) {
                baraja[i] = i;
            }

            //lee el array comprobacion de que esta ordenado
            //System.out.println(Arrays.toString(baraja));

            // mezclar el array 
            List<Integer> intList = Arrays.asList(baraja);
            Collections.shuffle(intList);
            intList.toArray(baraja);

            //comprobacion de que estan mezcladas las cartas 
            //System.out.println(Arrays.toString(baraja));
        
            //Repartir cartas iniciales
            //2 primeras para la casa
            casa[contCasa] = baraja[contBaraja];
            contCasa++;
            contBaraja++;
            casa[contCasa] = baraja[contBaraja];
            contCasa++;
            contBaraja++;
            System.out.println("Cartas de la Casa");
            //Solo muestra la 1º carta de la casa la segunda es Oculta
            Cartas.queCartaEs(casa[0]);
            System.out.println(" CARTA BOCA ABAJO");
            
//cambiar las cartas por unas fijas pruebas            
/*
casa[0]=11; // Q
casa[1]=0; //AS            
*/              
      
            //2 siguientes para el jugador
            jugador[contJugador] = baraja[contBaraja];
            contJugador++;
            contBaraja++;
            jugador[contJugador] = baraja[contBaraja];
            contJugador++;
            contBaraja++;
            System.out.println("Cartas del Jugador");
            for (int i = 0; i < 10; i++) {
                if (jugador[i]>=0) {
                    Cartas.queCartaEs(jugador[i]);
                }
            }               
//cambiar unas cartas por unas fijas pruebas                
/*
jugador[0]=13; //K
jugador[1]=12; //AS
*/ 


            //COMPROBAR SI EN LA MANO INICIAL ALGUIEN GANA!
            //Comprobar Casa
            if (Cartas.valorCarta(casa[0])==10&&Cartas.valorCarta(casa[1])==1||Cartas.valorCarta(casa[1])==10&&Cartas.valorCarta(casa[0])==1) {
                System.out.println("\nLa casa gana");
                System.out.println("Mano de la casa");
                Cartas.queCartaEs(casa[0]);
                Cartas.queCartaEs(casa[1]);
                lose++;
                blackJackInicial = true;
            } else if (Cartas.valorCarta(jugador[0])==10&&Cartas.valorCarta(jugador[1])==1||Cartas.valorCarta(jugador[1])==10&&Cartas.valorCarta(jugador[0])==1) {
                System.out.println("\nEl jugador gana");
                win++;
                blackJackInicial = true;  
            }
          
            //Le toca al Jugador pedir Cartas.
            do {
                contAses =0;
                manoJugador = 0;
                if (blackJackInicial == true) {
                    break;
                }
                
                
                do {
                // Entra en bucle hata que da una respuesta correcta    
                System.out.println("\n¿Quieres otra Carta? (S/N)");
                pedir = lectString.nextLine().toUpperCase();
                } while (!pedir.equals("S")&&!pedir.equals("N"));
                
                
                //si preciona que quiere carta se le da una nueva carta.
                if ("S".equals(pedir)) {
                    jugador[contJugador] = baraja[contBaraja];
                    contJugador++;
                    contBaraja++;
                    System.out.println("\nCartas del Jugador");
                    //Muestra la nueva mano del Jugador
                    for (int i = 0; i < 10; i++) {
                        if (jugador[i]>=0) {
                           Cartas.queCartaEs(jugador[i]);

                        }
                    }
                }
                
                
                    for (int i = 0; i < 10; i++) {
                        
                        if(jugador[i]>=0){
                            if (Cartas.valorCarta(jugador[i])>1) {
                                manoJugador = manoJugador + Cartas.valorCarta(jugador[i]);
                                //System.out.println("\nSumando Valores: " + manoJugador);
                                if (manoJugador > 21) {
                                    System.out.println("\nPerdiste");
                                    lose++;
                                    break;    
                                }
                            } else {
                                contAses++;//conteo de Ases para luego hacer la suma a la mano.
//System.out.println("cont Ases " + contAses);
                            }        
                        }
                    }
                    
                if (manoJugador>21) {
                    //Salida del bocle si la mano se pasa de 21, no es necesario sumar los Ases
                    break;
                }
                    
                //Suma de Ases en funcion del contador de Ases.
                switch (contAses) {
                    case 0:
                        //si no tiene Ases no hace nada
                        break;
                    case 1:
                        //Con un AS sumamos a la mano 11 y si se pasa le restamos 10 si se pasa Gano el Jugador.
                        manoJugador= manoJugador + 11;
                        if (manoJugador > 21) {
                            manoJugador = manoJugador - 10;
                            if (manoJugador > 21) {
                                System.out.println("\nPerdiste");
                                lose++;
                                break;
                            }
                        }        
                        break;
                    case 2:
                        //con dos Ases sumamos 22 y vamos restando 10 si se pasa.
                        manoJugador = manoJugador + 22;
                        if (manoJugador >21) {
                            manoJugador = manoJugador - 10;
                            if (manoJugador > 21) {
                                manoJugador = manoJugador - 10;
                                if (manoJugador > 21) {
                                    System.out.println("\nPerdiste");
                                    lose++;
                                    break;
                                }
                            }
                        }       
                        break;
                    case 3:
                        //con tres Ases sumamos 33 y vamos restando 10 si se pasa.
                        manoJugador = manoJugador + 33;
                        if (manoJugador >21) {
                            manoJugador = manoJugador - 10;
                            if (manoJugador > 21) {
                                manoJugador = manoJugador - 10;
                                if (manoJugador > 21) {
                                    manoJugador = manoJugador - 10;
                                    if (manoJugador > 21) {
                                        System.out.println("\nPerdiste");
                                        lose++;
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 4:
                        //con cuatro Ases sumamos 44 y vamos restando 10 si se pasa.
                        manoJugador = manoJugador + 44;
                        if (manoJugador >21) {
                            manoJugador = manoJugador - 10;
                            if (manoJugador > 21) {
                                manoJugador = manoJugador - 10;
                                if (manoJugador > 21) {
                                    manoJugador = manoJugador - 10;
                                    if (manoJugador > 21) {
                                        manoJugador = manoJugador - 10;
                                        if (manoJugador > 21) {
                                            System.out.println("\nPerdiste");
                                            lose++;
                                            break;    
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    
                    default:
                        throw new AssertionError();
                }    

                if (manoJugador>21) {
                    break; //Se sale si la mano se pasa con la suma de los Ases.
                } 
//System.out.println("\nmanoJugador en el bucle "+manoJugador);
            } while ("S".equals(pedir));
                     
/*
System.out.println("\nmanoJugador"+manoJugador);
System.out.println("manoCasa"+manoCasa);
*/
                  
//JUEGA LA CASA            
            
            //Le toca Jugar a la Casa, esta ganara si supera o iguala al jugador.
            do {
                if (blackJackInicial == true) {
                    break;
                }
                
                if (contCasa == 2 ) {
                    System.out.println("Mano de la casa");
                    Cartas.queCartaEs(casa[0]);
                    Cartas.queCartaEs(casa[1]);
                }
            
                if (manoJugador > 21) {
                    //Se sale del DO si el Jugador se paso
                    break;
                }
         
            //LA CASA COMPRUEBA EL VALOR DE SU MANO.
                
                //Resetear los contadores de puntuacion de mano y de Ases para sumar si se pide Carta
                manoCasa = 0;
                contAses = 0;
                
                //comprobacion inicial de la puntuacion en funcion del resultado de la mano se pedira carta
                for (int i = 0; i < 10; i++) {
                    if(casa[i]>=0){
                        if (Cartas.valorCarta(casa[i])>1) {
                            manoCasa = manoCasa + Cartas.valorCarta(casa[i]);
                            //System.out.println("\nSumando Valores: " + manoCasa); // esta linea se puede apagar luego
                            if (manoCasa > 21) {
                                System.out.println("\nGanaste");
                                win++;
                                break;      
                            }
                        } else {
                            contAses++;//conteo de Ases para luego hacer la suma a la mano.
                        }
                    }
                }
                
                if (manoCasa>21) {
                    //Salida del bocle si la mano se pasa de 21, no es necesario sumar los Ases
                    break;
                }
                
                //Suma de Ases en funcion del contador de Ases.
                switch (contAses) {
                    case 0:
                        //si no tiene Ases no hace nada
                        break;
                    case 1:
                        //Con un AS sumamos a la mano 11 y si se pasa le restamos 10 si se pasa Gano el Jugador.
                        manoCasa= manoCasa + 11;
                        if (manoCasa >21) {
                            manoCasa = manoCasa - 10;
                            if (manoCasa > 21) {
                                System.out.println("\nGanaste");
                                win++;
                                break;
                            }
                        }        
                        break;
                    case 2:
                        //con dos Ases sumamos 22 y vamos restando 10 si se pasa.
                        manoCasa = manoCasa + 22;
                        if (manoCasa >21) {
                            manoCasa = manoCasa - 10;
                            if (manoCasa > 21) {
                                manoCasa = manoCasa - 10;
                                if (manoCasa > 21) {
                                    System.out.println("\nGanaste");
                                    win++;
                                    break;
                                }
                            }
                        }       
                        break;
                    case 3:
                        //con tres Ases sumamos 33 y vamos restando 10 si se pasa.
                        manoCasa = manoCasa + 33;
                        if (manoCasa >21) {
                            manoCasa = manoCasa - 10;
                            if (manoCasa > 21) {
                                manoCasa = manoCasa - 10;
                                if (manoCasa > 21) {
                                    manoCasa = manoCasa - 10;
                                    if (manoCasa > 21) {
                                        System.out.println("\nGanaste");
                                        win++;
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 4:
                        //con cuatro Ases sumamos 44 y vamos restando 10 si se pasa.
                        manoCasa = manoCasa + 44;
                        if (manoCasa >21) {
                            manoCasa = manoCasa - 10;
                            if (manoCasa > 21) {
                                manoCasa = manoCasa - 10;
                                if (manoCasa > 21) {
                                    manoCasa = manoCasa - 10;
                                    if (manoCasa > 21) {
                                        manoCasa = manoCasa - 10;
                                        if (manoCasa > 21) {
                                            System.out.println("\nGanaste");
                                            win++;
                                            break;    
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    
                    default:
                        throw new AssertionError();
                }
                
                if (manoCasa>21) {
                    //Salida del bucle si la mano se pasa de 21, no es necesario que la casa pida Carta.
                    break;
                }
/*
System.out.println("manoJugador"+manoJugador);
System.out.println("manoCasa"+manoCasa);
*/                
                if (manoCasa == 21 || manoCasa <= 21 && manoCasa >= manoJugador) {
                    // si la casa tiene 21 o su mano es igual o mayor que la del jugador la casa gana y se termina.
                    System.out.println("\nPerdiste");
                    lose++;
                    break;
                }
                
            //LA CASA PIDE CARTA o SE PLANTA
                
                //Si la mano de la Casa es menor a la del Jugador se pide carta.
                if (manoCasa < manoJugador) {
                    System.out.println("\nLa casa pide Carta");
                    casa[contCasa] = baraja[contBaraja];
                    contCasa++;
                    contBaraja++;
                    System.out.println("Cartas de la Casa");
                    //Muestra la nueva mano de la casa.
                    for (int i = 0; i < 10; i++) {
                        if (casa[i]>=0) {
                           Cartas.queCartaEs(casa[i]);

                        }
                    }
                }
                
            } while (manoCasa<manoJugador);
            
        //continuar
            do {
                System.out.println("\nGanadas: " + win + " Derrotas: " + lose);
                System.out.println("Deseas volver a jugar: (S/N)");
                continuar = lectString.nextLine().toUpperCase();
            } while (!continuar.equals("S")&&!continuar.equals("N"));
        
        } while ("S".equals(continuar));
    }    
}
