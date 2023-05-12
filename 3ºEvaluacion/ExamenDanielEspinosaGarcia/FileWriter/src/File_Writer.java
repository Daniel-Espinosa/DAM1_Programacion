
import java.io.*;


public class File_Writer {

    public static void main(String[] args) {
        
        /*
        FileWriter fw = null;
        FileWriter fw2 = null;
        String texto = "hola";
        String texto2 = "mundo";
        try {
            fw = new FileWriter("datos1.txt");
            fw.write(texto);
            fw2 = new FileWriter("datos2.txt");
            fw2.write(texto2);
            System.out.println("todo OK");
        } catch (IOException e) {
            System.err.println("IOException");
        }finally {
            try {
                if (fw !=null) {
                    fw.close();
                }
                if (fw2 != null) {
                    fw2.close();
                }
            } catch (IOException e) {
                System.err.println("IOException");
            }
        }
        */
        
        int cont = 0;
        
        do {
            FileWriter fw = null;
            String texto = "hola";
            try {
                fw = new FileWriter("datos" + cont + ".txt");
                fw.write(texto + " " + cont);
                System.out.println("todo OK");
            } catch (IOException e) {
                System.err.println("IOException");
            } finally {
                try {
                    if (fw != null) {
                        fw.close();
                    }
                } catch (IOException e) {
                    System.err.println("IOException");
                }
            }
            cont++;
        } while (cont != 3);
        
        
        
    }
    
}
