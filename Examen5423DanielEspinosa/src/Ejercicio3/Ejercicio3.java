package Ejercicio3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        String[][] listado = new String [][] {{"A","B","C","D","E"},{"F","G","H","I","K"},{"L","M","N","O","P"},{"Q","R","S","T","U"},{"V","W","X","Y","Z"}};
        
        Scanner scTxt = new Scanner (System.in);
        System.out.println("introduce un mensaje a cifrar");
        String cadena = scTxt.nextLine();
        
        String almacenCaracteres ="";
        
        File archivo = new File("encriptado.txt");
       
        File fichero = new File("C:\\carpeta\\carpeta\\ejemplo.txt");
        FileWriter fw = null;
        
        try {
            
            for (int i = 0; i < cadena.length(); i++) {
                for (int j = 0; j < listado.length; j++) {
                    for (int k = 0; k < listado[j].length; k++) {
                        if (listado[j][k].equalsIgnoreCase(""+cadena.charAt(i))) {
                            almacenCaracteres += (j+1) +""+ (k+1);
                        }
                    }
                }
                
                
            }
            //sout para comprobar que funciona
            System.out.println(almacenCaracteres);
            //guarda el archivo
            fw = new FileWriter(archivo);
            fw.write(almacenCaracteres);
            
            
        } catch (IOException e) {
            System.err.println("IOException");
        } finally {
            try {
                if (fw!=null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.err.println("IOException cierre flujo");
            }
        }
        

    }
    
}
