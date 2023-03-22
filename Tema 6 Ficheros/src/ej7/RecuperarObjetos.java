package ej7;

import java.io.*;
import ej6.Amigo;

public class RecuperarObjetos {
    
    //fallos por duplicidad de clase y que no sabe leer bien el paquete amigo ;)

    public static void main(String[] args) {

        File fichero;
        FileInputStream fis = null;
        ObjectInputStream flujoentradaobjetos = null;

        try {

            fichero = new File("amigos.dat"); // .dat

            if (fichero.exists()) {

                fis = new FileInputStream(fichero);
                flujoentradaobjetos = new ObjectInputStream(fis);

                while (fis.available()>0) { //este while es raro...
                    Amigo a = (Amigo) flujoentradaobjetos.readObject();
                    System.out.println(a.toString());
                }
                
            }
        } catch (EOFException eof) {
            System.err.println("---------------------------------------");
        } catch (FileNotFoundException fnf) {
            System.err.println("Fichero no encontrado" + fnf);
        } catch (IOException ioe) {
            System.err.println("Se ha producido una IoException" + ioe);
            System.out.println(ioe.getStackTrace());
        } catch (Throwable e) {
            System.err.println("Error de programa: " + e);
        } finally {
            try {
                if (flujoentradaobjetos != null) { // cerrar por fis
                    flujoentradaobjetos.close();
                    fis.close();
                }
            } catch (IOException ioe) {
                System.err.println("Ha ocurrido una IOException");
            }

        }

    }
}
