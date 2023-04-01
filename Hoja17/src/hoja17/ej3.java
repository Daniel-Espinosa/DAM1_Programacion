
package hoja17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ej3 {

    public static void main(String[] args) {
        
        FileInputStream fis = null;
        String texto = "";
        char c = 0;
        try{                                            
            fis = new FileInputStream ("datos personales.txt");
            int longitud = fis.available();
            for (int i = 0; i < longitud ; i++) {
                c = (char)fis.read();
                texto = texto + c;
            }
            System.out.println(texto);
        }catch(FileNotFoundException fnfe){
            System.out.println("Archivo no encontrado");
        }catch (IOException e){
            System.out.println("Ha ocurrido una IOException");
        }
        finally{
            try{  
                if (fis != null) {
                    fis.close();
                    System.out.println("Flujo cerrado correctamente");
                }
            }catch(IOException e){              
                System.out.println("Ha ocurrido una IOException");   
            }
        }
        
    }
}