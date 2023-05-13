package ejemplo.dom;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;

public class EjemploDOM {

    public static void main(String[] args) {
        try {
            //Objetos necesarios para parsear el archivo.
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder b = dbf.newDocumentBuilder();

            //Accedemos al fichero que queremos leer.
            Document d = b.parse("ejemplo.xml");

            //Elemento raíz.
            Element raiz = d.getDocumentElement();

            NodeList paises = raiz.getElementsByTagName("pais");
            
            for (int i = 0; i < paises.getLength(); i++) {
                Node n = paises.item(i);
                
               if (n.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) n;
                    String nombre = e.getElementsByTagName("nombre").item(0).getTextContent();
                    String capital = e.getElementsByTagName("capital").item(0).getTextContent();
                    System.out.println("La capital de " + nombre + " es " + capital);
                }
            }
        } catch (IOException ex) {
            System.err.println("No se ha podido leer el fichero XML.");
        } catch (SAXException ex) {
            System.err.println("No se ha podido parsear el fichero XML.");
        } catch (Exception ex) {
            System.err.println("Ha ocurrido una error.");
        }
    }
}
