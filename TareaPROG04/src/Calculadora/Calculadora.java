
package Calculadora;

import java.util.Scanner;



public class Calculadora {

    public static void main(String[] args) {
        
                
        Scanner lectura = new Scanner(System.in);
        int seleccion = 0;
        
            //entramos en un bucle do while para repetir el menu principal hasta salir
            do {
                
                //inicializamos los valores que se solicitaran por teclado en negativo.
                short valor1 = -1 ,valor2 = - 1;
                
                //inicializamos el try catch si al introducir la opcion es una opcion no valida nos vuelva al menu inicial
                try {

                    System.out.println("Que operacion deseas realizar: ");
                    System.out.println("Suma  = 1");
                    System.out.println("Resta = 2");
                    System.out.println("Multiplicascion = 3");
                    System.out.println("Division = 4");
                    System.out.println("Salir = 0");
                    seleccion = lectura.nextInt();
                    
                    //segun la eleccion del menu principal entramos en cada caso con el Switch
                    switch (seleccion) {
                        case 1:
                            System.out.println("\nOpcion elegida: Suma de dos numeros");
                            
                            do {
                                try{ //inicializamos el try catch si al introducir el valor da error nos lo vuelve a pedir.
                                    System.out.println("introduce 1º numero: ");
                                    valor1 = lectura.nextShort();
                                }catch (Exception e) {
                                    lectura.next();
                                    System.out.println("introduce un numero entre 0 y 32767");
                                }
                            } while (valor1<0); // el valor introducido tiene que ser mayor que 0
                            
                            
                            do {    
                                try { //inicializamos el try catch si al introducir el valor da error nos lo vuelve a pedir.
                                    System.out.println("introduce 2º numero: ");
                                    valor2=lectura.nextShort();
                                } catch (Exception e) {
                                    lectura.next();
                                    System.out.println("introduce un numero entre 0 y 32767");
                                }
                                
                            } while (valor2<0); // el valor introducido tiene que ser mayor que 0
                           
                            sumaMenu(valor1,valor2);
                                    
                            break;

                        case 2:
                            System.out.println("\nOpcion elegida: Resta de dos numeros");
                            
                            do {
                                try{ //inicializamos el try catch si al introducir el valor da error nos lo vuelve a pedir.
                                    System.out.println("introduce el minuendo: ");
                                    valor1=lectura.nextShort();
                                }catch (Exception e) {
                                    lectura.next();
                                    System.out.println("introduce un numero entre 0 y 32767");
                                }
                            } while (valor1<0); // el valor introducido tiene que ser mayor que 0
                            
                            do {    
                                try { //inicializamos el try catch si al introducir el valor da error nos lo vuelve a pedir.
                                    System.out.println("introduce el sustraendo: ");
                                    valor2 = lectura.nextShort();
                                } catch (Exception e) {
                                    lectura.next();
                                    System.out.println("introduce un numero entre 0 y 32767");
                                }
                                
                            } while (valor2<0); // el valor introducido tiene que ser mayor que 0
                            
                            if (valor1<valor2) { // si el minuendo es menor al sustraendo lo avisa y no realiza la operacion
                                System.out.println("La resta da negativo y no se realizara\n");
                            } else {
                                restarMenu(valor1,valor2);
                            }
                            
                            break;

                        case 3:
                            
                            System.out.println("\nOpcion elegida: Multiplicacion de dos numeros");
                            
                            do {
                                try{ //inicializamos el try catch si al introducir el valor da error nos lo vuelve a pedir.
                                    System.out.println("introduce el multiplicando ");
                                    valor1=lectura.nextShort();
                                }catch (Exception e) {
                                    lectura.next();
                                    System.out.println("introduce un numero entre 0 y 32767");
                                }
                            } while (valor1<0); // el valor introducido tiene que ser mayor que 0
                            
                            do {    
                                try { //inicializamos el try catch si al introducir el valor da error nos lo vuelve a pedir.
                                    System.out.println("introduce el multiplicador ");
                                    valor2=lectura.nextShort();
                                } catch (Exception e) {
                                    lectura.next();
                                    System.out.println("introduce un numero entre 0 y 32767");
                                }
                                
                            } while (valor2<0); // el valor introducido tiene que ser mayor que 0
                            
                            multiplicarMenu (valor1,valor2);
                            
                            break;

                        case 4:
                            System.out.println("Division");
                            break;

                        case 0:
                            System.out.println("Adios amigos!");
                            break;

                    }
                        if (seleccion <0 || seleccion > 4) {
                            System.out.println("introduce una opcion valida \n");
                    }

                } catch (Exception e) {
                    System.out.println("Se produjo un error");
                }     


            } while (seleccion != 0);
       
    }
    
    
    private static void sumaMenu (int sumando1 , int sumando2){
        
        // declaramos variables
        byte array1[];
        byte array2[];
        int resultado;
        
        // inicializamos los arrays
        // esto da un tamaño fijo el short como maximo tiene 5 digitos
        array1 = new byte[5];
        array2 = new byte[5];
        
        // colocamos en cada posición del array el digito correspondiente
        for (int i = 0; i < 5 ; i++) {
            array1[i]=(byte) (sumando1%10);
            sumando1=(short) (sumando1/10);
        }
        
        // colocamos en cada posición del array el digito correspondiente
        for (int i = 0; i < 5 ; i++) {
            array2[i]=(byte) (sumando2%10);
            sumando2=(short) (sumando2/10);
        }
        
        int temp = 0;
        String acumulado = "";
        
        // con cada pasada del for suma primero unidades, luego decenas y asi sucesivamente
        // si el valor es mayor que 9 lleva 1 para la suma de la siguiente posición
        // va almacenando las sumas en el temp
        // almacena el valor total en el acumulado, lo trato como un String para que al recastearlo en un numero los 0 de las izquierda desaparescan.
        for (int i = 0; i < 5; i++) {
            temp = array1[i]+array2[i]+temp;
            acumulado = (temp%10) + acumulado;
            temp = temp/10;
        }
        
        // imprime el resultado
        resultado = Integer.parseInt(acumulado);
        System.out.println("la suma es: " + resultado + "\n"); 
        
    }
    
    //suma tramposo
    private static int sumar (int sumando1, int sumando2){
        
        int suma;
        
        suma = sumando1+sumando2;
        
        return suma;
        
    }
    
    private static void restarMenu (int minuendo, int sustraendo){
        
        // declaramos variables
        byte array1[];
        byte array2[];
        int resultado;
        
        // inicializamos los arrays
        // esto da un tamaño fijo el short como maximo tiene 5 digitos
        array1 = new byte[5];
        array2 = new byte[5];
        
        // colocamos en cada posición del array el digito correspondiente
        for (int i = 0; i < 5 ; i++) {
            array1[i]=(byte) (minuendo%10);
            minuendo=(short) (minuendo/10);
        }
        
        // colocamos en cada posición del array el digito correspondiente
        for (int i = 0; i < 5 ; i++) {
            array2[i]=(byte) (sustraendo%10);
            sustraendo=(short) (sustraendo/10);
        }
        
        String acumulado = "";
        
        // con cada pasada del for restamos primero unidades, luego decenas y asi sucesivamente
        // si el valor es menor que 0 se lleva 1 para poder realizar la resta
        // almacena el valor total en el acumulado, lo trato como un String para que al recastearlo en un numero los 0 de las izquierda desaparescan.
        for (int i = 0; i < 5; i++) {
            if (array1[i]-array2[i]<0) {
                array1[i+1]=(byte) (array1[i+1]-1);
                acumulado= ((array1[i]+10)-array2[i])+acumulado;
            } else {
                acumulado= (array1[i]-array2[i])+acumulado;
            }

        }
        
        // imprime el resultado
        resultado = Integer.parseInt(acumulado);
        System.out.println("La resta es: " + resultado + "\n");
        
    }
    
    //restar tramposo
    private static int restar (int minuendo, int sustraendo){
        
        int resta;
        
        resta = minuendo-sustraendo;
        
        return resta;
        
    }
    
    
    private static void multiplicarMenu (int multiplicando, int multiplicador){
        
        
        // declaramos variables
        byte array2[];
        int resultado = 0;
        // inicializamos el array
        // esto da un tamaño fijo el short como maximo tiene 5 digitos
        array2 = new byte[5];
        
        // colocamos en cada posición del array el digito correspondiente
        for (int i = 0; i < 5 ; i++) {
            array2[i]=(byte) (multiplicador%10);
            multiplicador=(short) (multiplicador/10);
        }
        
        //creamos un contador de 0 para las poder desplazar las sumas.
        int ceros = 1;
        int temp;

        //con cada pasada de este for recorremos las posiciones del array
        for (int i = 0; i < 5; i++) {
            temp = 0;
            //con cada pasada de este for sumamos las veces que hace falta
            for (int j = 0; j < array2[i]; j++) {
                temp = multiplicando+temp;
            }
            
            //esto permite desplazar la posición para realizar la suma
            if (i>0) {
                ceros = ceros * 10; //lleva el conteo de las veces que se desplaza la posición para la suma
                resultado = resultado + (temp*ceros);
            }else{
                resultado = temp;
            }
            
        }
        
        System.out.println("la multiplicacion es: " + resultado + "\n");
        
    }
    
    //multiplicar tramposo
    private static int multiplicar (int multiplicando, int multiplicador){
        
        int multi;
        
        multi = multiplicando * multiplicador;
        
        return multi;
        
    }
    
    
}

