import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;
/**
 *
 * @author damt108
 */
public class LeerXMLperro {

    public static void main(String[] args) {
    
        try {
            String [] arrayPerros;
            
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            
            Document d = db.parse("perros.xml");
            
            Element raiz = d.getDocumentElement();
            
            NodeList nLperros = raiz.getElementsByTagName("perro");
            
            arrayPerros = new String[nLperros.getLength()];
            
            for (int i = 0; i < nLperros.getLength(); i++) {
                Node n = nLperros.item(i);
                //if (n.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) n;
                    String nombre = e.getElementsByTagName("nombre").item(0).getTextContent();
                    String raza = e.getElementsByTagName("raza").item(0).getTextContent();
                    arrayPerros[i]= "Nombre del perro: " + nombre + " - Raza: " + raza;
                //}
            }
            
            System.out.println("Los perros almacenados en el XML son:");
            for (String i : arrayPerros) {
                System.out.println(i);
            }
            
        } catch (IOException e) {
            System.err.println("IOException");
        } catch (SAXException e) { 
            System.err.println("SAXException");
        } catch (ParserConfigurationException e){
            System.err.println("ParseConfigurationException");
        } catch (NullPointerException e){
            System.err.println("NullPointerException");
        }
        
    }
    
}
